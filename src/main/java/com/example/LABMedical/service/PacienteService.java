package com.example.LABMedical.service;

import com.example.LABMedical.dto.Paciente.PacienteCadastroDTO;
import com.example.LABMedical.mapper.PacienteMapper;
import com.example.LABMedical.model.Endereco;
import com.example.LABMedical.model.Paciente;
import com.example.LABMedical.respository.EnderecoRepository;
import com.example.LABMedical.respository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    PacienteMapper pacienteMapper;

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    EnderecoRepository enderecoRepository;


    // reescrever o método toString
    public ResponseEntity<String> salvarPaciente(PacienteCadastroDTO pacienteRequest) {

        Optional<Paciente> pacienteExistente = pacienteRepository.findByCpf(pacienteRequest.getCPF());

        Endereco enderecoEncontrado = enderecoRepository.getById(pacienteRequest.getEnderecoId());
        if (enderecoEncontrado == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereço não localizado");
        }else if(pacienteExistente.isPresent()){
               return ResponseEntity.status(HttpStatus.CONFLICT).body("CPF já cadastrado.");
        }else{
            Paciente pacienteCadastrado = new Paciente (
                    pacienteRequest.getNomeCompleto(),pacienteRequest.getGenero(),
                    pacienteRequest.getDataNascimento(),pacienteRequest.getCPF(),
                    pacienteRequest.getRG(),pacienteRequest.getEstadoCivil(),
                    pacienteRequest.getTelefone(),pacienteRequest.getEmail(),
                    pacienteRequest.getNaturalidade(),pacienteRequest.getAlergias(),
                    pacienteRequest.getCuidadosEspecificos(),pacienteRequest.getContatoEmergencia(),
                    pacienteRequest.getConvenio(),pacienteRequest.getCarteiraConvenio(),
                    pacienteRequest.getValidadeConvenio(),enderecoEncontrado
            );
            pacienteRepository.save(pacienteCadastrado);
            return ResponseEntity.status(HttpStatus.CREATED).
                    body("O cadastro foi efetuado ID: " +pacienteCadastrado.getId()+" "+pacienteCadastrado.toString());

        }


    }
}
