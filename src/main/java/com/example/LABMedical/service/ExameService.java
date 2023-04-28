package com.example.LABMedical.service;

import com.example.LABMedical.dto.Consulta.ConsultaExclusaoDTO;
import com.example.LABMedical.dto.Consulta.ConsultaIdentificadorDTO;
import com.example.LABMedical.dto.Exame.ExameAtualizacaoDTO;
import com.example.LABMedical.dto.Exame.ExameCadastroDTO;
import com.example.LABMedical.dto.Exame.ExameExclusaoDTO;
import com.example.LABMedical.dto.Exame.ExameIdentificadorDTO;
import com.example.LABMedical.mapper.ConsultaMapper;
import com.example.LABMedical.mapper.ExameMapper;
import com.example.LABMedical.model.Consulta;
import com.example.LABMedical.model.Exame;
import com.example.LABMedical.model.Medico;
import com.example.LABMedical.model.Paciente;
import com.example.LABMedical.respository.ConsultaRepository;
import com.example.LABMedical.respository.ExameRepository;
import com.example.LABMedical.respository.MedicoRepository;
import com.example.LABMedical.respository.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExameService {
    @Autowired
    ExameMapper exameMapper;
    @Autowired
    ExameRepository exameRepository;
    @Autowired
    MedicoRepository medicoRepository;
    @Autowired
    PacienteRepository pacienteRepository;


    public ResponseEntity<String> salvarExame(ExameCadastroDTO exameRequest) {
        Paciente pacienteEncontrado = pacienteRepository.getById(exameRequest.getPacienteId());
        Medico medicoEncontrado = medicoRepository.getById(exameRequest.getMedicoId());


        if(pacienteEncontrado == null || medicoEncontrado == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Exame não cadastrada. Médico ou Paciente não encontrados");
        }
        Exame exameSalvo = new Exame();
        exameSalvo.setNomeExame(exameRequest.getNomeExame());
        exameSalvo.setDataHora(exameRequest.getDataHora());
        exameSalvo.setTipoExame(exameRequest.getTipoExame());
        exameSalvo.setLaboratorio(exameRequest.getLaboratorio());
        exameSalvo.setArquivoExame(exameRequest.getArquivoExame());
        exameSalvo.setResultadoExame(exameRequest.getResultadoExame());
        exameSalvo.setPaciente(pacienteEncontrado);
        exameSalvo.setMedico(medicoEncontrado);

        exameRepository.save(exameSalvo);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Exame cadastrado."+ exameSalvo.toString()+ " "+
                        "id do paciente: "+pacienteEncontrado.getId()+
                        "id do médico: "+medicoEncontrado.getId());
    }

    public ResponseEntity<String> atualizaExamePorId(Integer id, ExameAtualizacaoDTO exameRequest) {
        try{
            Paciente pacienteEncontrado = pacienteRepository.getById(exameRequest.getPacienteId());
            Medico medicoEncontrado = medicoRepository.getById(exameRequest.getMedicoId());
            Exame exameAtualizado = exameRepository.getById(id);

            if(pacienteEncontrado == null || medicoEncontrado == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Exame não atualizado. Médico ou Paciente não encontrados");
            }
            exameAtualizado.setNomeExame(exameRequest.getNomeExame());
            exameAtualizado.setTipoExame(exameRequest.getTipoExame());
            exameAtualizado.setLaboratorio(exameRequest.getLaboratorio());
            exameAtualizado.setArquivoExame(exameRequest.getArquivoExame());
            exameAtualizado.setResultadoExame(exameRequest.getResultadoExame());
            exameAtualizado.setPaciente(pacienteEncontrado);
            exameAtualizado.setMedico(medicoEncontrado);

            exameRepository.save(exameAtualizado);
            return ResponseEntity.status(HttpStatus.OK)
                    .body("A consulta foi atualizado. " +exameAtualizado.toString());
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Exame não localizado");
     }}

    public ResponseEntity<String> buscaExamesPorId(Integer id) {
        try{
            Exame exameEncontrado = exameRepository.getReferenceById(id);
            ExameIdentificadorDTO exameEncontradoDTO;
            exameEncontradoDTO = exameMapper.maptoIdDTO(exameEncontrado);
            return ResponseEntity.status(HttpStatus.OK).body(exameEncontrado.toString());

        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhum exame");
        }

    }

    public ResponseEntity<String> deletarExamePorId(Integer id) {
        try {
            Exame exameEncontrado = exameRepository.getReferenceById(id);
            ExameExclusaoDTO exameExcluida;
            exameExcluida = exameMapper.maptoExclusaoDTO(exameEncontrado);// guarda o ultimo excluido
            exameRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
        }catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhum exame");

        }
    }

}
