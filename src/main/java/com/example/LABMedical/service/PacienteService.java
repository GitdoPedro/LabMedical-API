package com.example.LABMedical.service;

import com.example.LABMedical.dto.Endereco.EnderecoListagemDTO;
import com.example.LABMedical.dto.Paciente.*;
import com.example.LABMedical.mapper.PacienteMapper;
import com.example.LABMedical.model.Endereco;
import com.example.LABMedical.model.Medico;
import com.example.LABMedical.model.Paciente;
import com.example.LABMedical.respository.EnderecoRepository;
import com.example.LABMedical.respository.ExameRepository;
import com.example.LABMedical.respository.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    PacienteMapper pacienteMapper;

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    ExameService exameService;


    // reescrever o método toString
    public ResponseEntity<String> salvarPaciente(PacienteCadastroDTO pacienteRequest) {

        Optional<Paciente> pacienteExistente = pacienteRepository.findByCpf(pacienteRequest.getCPF());
        Endereco enderecoEncontrado = enderecoRepository.getById(pacienteRequest.getEnderecoId());


        if (enderecoEncontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereço não localizado");
        } else if (pacienteExistente.isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CPF já cadastrado.");
        } else {
            Paciente pacienteCadastrado = new Paciente(
                    pacienteRequest.getNomeCompleto(), pacienteRequest.getGenero(),
                    pacienteRequest.getDataNascimento(), pacienteRequest.getCPF(),
                    pacienteRequest.getRG(), pacienteRequest.getEstadoCivil(),
                    pacienteRequest.getTelefone(), pacienteRequest.getEmail(),
                    pacienteRequest.getNaturalidade(), pacienteRequest.getAlergias(),
                    pacienteRequest.getCuidadosEspecificos(), pacienteRequest.getContatoEmergencia(),
                    pacienteRequest.getConvenio(), pacienteRequest.getCarteiraConvenio(),
                    pacienteRequest.getValidadeConvenio(), enderecoEncontrado
            );
            pacienteRepository.save(pacienteCadastrado);
            return ResponseEntity.status(HttpStatus.CREATED).
                    body("O cadastro foi efetuado ID: " + pacienteCadastrado.getId() +
                            " " + pacienteRequest.toString());
        }
    }

    //reescrever toString
    public ResponseEntity<String> atualizaPacientePorId(Integer id, PacienteAtualizacaoDTO pacienteRequest) {
        Paciente pacienteAtualizado = pacienteRepository.getById(id);
        Endereco enderecoEncontrado = enderecoRepository.getById(pacienteRequest.getEnderecoId());
        if (pacienteAtualizado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhum cadastro");
        } else if (enderecoEncontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereço não localizado");
        } else {
            pacienteAtualizado.setNomeCompleto(pacienteRequest.getNomeCompleto());
            pacienteAtualizado.setGenero(pacienteRequest.getGenero());
            pacienteAtualizado.setDataNascimento(pacienteRequest.getDataNascimento());
            pacienteAtualizado.setEstadoCivil(pacienteRequest.getEstadoCivil());
            pacienteAtualizado.setTelefone(pacienteRequest.getTelefone());
            pacienteAtualizado.setEmail(pacienteRequest.getEmail());
            pacienteAtualizado.setNaturalidade(pacienteRequest.getNaturalidade());
            pacienteAtualizado.setAlergias(pacienteRequest.getAlergias());
            pacienteAtualizado.setCuidadosEspecificos(pacienteRequest.getCuidadosEspecificos());
            pacienteAtualizado.setConvenio(pacienteRequest.getConvenio());
            pacienteAtualizado.setCarteiraConvenio(pacienteRequest.getCarteiraConvenio());
            pacienteAtualizado.setValidadeConvenio(pacienteRequest.getValidadeConvenio());
            pacienteAtualizado.setEndereco(enderecoEncontrado);
            pacienteRepository.save(pacienteAtualizado);


            return ResponseEntity.status(HttpStatus.OK).body("O cadastro foi atualizado ID: " +
                    pacienteAtualizado.getId() + " " + pacienteAtualizado.toString());
        }

    }

    public List<Paciente> listarPacientes(String nomeCompleto) {
        List<Paciente> pacientes;
        if (nomeCompleto == null) {
            pacientes = pacienteRepository.findAll();
        } else {
            pacientes = pacienteRepository.findByNome(nomeCompleto);
        }
        return pacientes;

    }


    public ResponseEntity<String> buscaPacientesPorId(Integer id) {
        try {
            Paciente pacienteEncontrado = pacienteRepository.getReferenceById(id);
            PacienteIdentificadorDTO pacienteEncontradoDTO;
            pacienteEncontradoDTO = pacienteMapper.maptoIdDTO(pacienteEncontrado);
            return ResponseEntity.status(HttpStatus.OK).body(pacienteEncontradoDTO.getNomeCompleto());
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhum cadastro");
        }
    }

    public ResponseEntity<String> deletarPacientesPorId(Integer id) {
        try {
            Paciente pacienteEncontrado = pacienteRepository.getReferenceById(id);
            PacienteExclusaoDTO pacienteExcluido;
            pacienteExcluido = pacienteMapper.maptoExclusaoDTO(pacienteEncontrado);// guarda o ultimo excluido
            pacienteRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhum cadastro");

        }
    }
}
