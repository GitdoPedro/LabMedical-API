package com.example.LABMedical.service;

import com.example.LABMedical.dto.Medico.MedicoAtualizacaoDTO;
import com.example.LABMedical.dto.Medico.MedicoCadastroDTO;
import com.example.LABMedical.dto.Medico.MedicoSenhaDTO;
import com.example.LABMedical.mapper.MedicoMapper;
import com.example.LABMedical.model.Medico;
import com.example.LABMedical.respository.MedicoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private MedicoMapper medicoMapper;


    public ResponseEntity<String> salvarMedico(MedicoCadastroDTO medicoRequest) {

        Optional<Medico> medicoExistente = medicoRepository.findByCpf(medicoRequest.getCPF());
        if (medicoExistente.isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CPF já cadastrado.");
        }
        try {
            Medico medicoSalvo = medicoMapper.map(medicoRequest);
            medicoRepository.save(medicoSalvo);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("O cadastro foi efetuado ID: " + medicoSalvo.getId() + " " + medicoSalvo.toString());
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Número inválido de atributos ou atributos inválidos");
        }
    }

    public ResponseEntity<String> atualizaMedicoPorId(Integer id, MedicoAtualizacaoDTO medicoRequest) {

        try {
            Medico medicoAtualizado = medicoRepository.getById(id);
            medicoAtualizado.setNomeCompleto(medicoRequest.getNomeCompleto());
            medicoAtualizado.setGenero(medicoRequest.getGenero());
            medicoAtualizado.setDataNascimento(medicoRequest.getDataNascimento());
            medicoAtualizado.setEstadoCivil(medicoRequest.getEstadoCivil());
            medicoAtualizado.setTelefone(medicoRequest.getTelefone());
            medicoAtualizado.setEmail(medicoRequest.getEmail());
            medicoAtualizado.setNaturalidade(medicoRequest.getNaturalidade());
            medicoAtualizado.setCRM(medicoRequest.getCRM());
            medicoAtualizado.setEspecializacaoClinica(medicoRequest.getEspecializacaoClinica());

            medicoRepository.save(medicoAtualizado);


            return ResponseEntity.status(HttpStatus.OK).body("O cadastro foi atualizado ID: " +
                    medicoAtualizado.getId() + " " + medicoAtualizado.toString());
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhum exame");
        }


    }

    public ResponseEntity<String> atualizaSenhaMedico(Integer id, MedicoSenhaDTO medicoRequest) {
        try {
            Medico senhaAtualizada = medicoRepository.getById(id);
            senhaAtualizada.setSenha(medicoRequest.getSenha());
            return ResponseEntity.status(HttpStatus.OK).body("A senha foi atualizada para: " +
                    senhaAtualizada.getSenha());
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhum cadastro");


        }

    }
}


