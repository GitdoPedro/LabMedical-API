package com.example.LABMedical.service;

import com.example.LABMedical.dto.Consulta.ConsultaAtualizacaoDTO;
import com.example.LABMedical.dto.Consulta.ConsultaCadastroDTO;
import com.example.LABMedical.dto.Consulta.ConsultaExclusaoDTO;
import com.example.LABMedical.dto.Consulta.ConsultaIdentificadorDTO;
import com.example.LABMedical.dto.Paciente.PacienteExclusaoDTO;
import com.example.LABMedical.dto.Paciente.PacienteIdentificadorDTO;
import com.example.LABMedical.mapper.ConsultaMapper;
import com.example.LABMedical.model.Consulta;
import com.example.LABMedical.model.Medico;
import com.example.LABMedical.model.Paciente;
import com.example.LABMedical.respository.ConsultaRepository;
import com.example.LABMedical.respository.MedicoRepository;
import com.example.LABMedical.respository.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    @Autowired
    ConsultaMapper consultaMapper;
    @Autowired
    ConsultaRepository consultaRepository;
    @Autowired
    MedicoRepository medicoRepository;
    @Autowired
    PacienteRepository pacienteRepository;

    public ResponseEntity<String> salvarConsulta(ConsultaCadastroDTO consultaRequest) {
        Paciente pacienteEncontrado = pacienteRepository.getById(consultaRequest.getPacienteId());
        Medico medicoEncontrado = medicoRepository.getById(consultaRequest.getMedicoId());


        if (pacienteEncontrado == null || medicoEncontrado == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Consulta não cadastrada. Médico ou Paciente não encontrados");
        }
        Consulta consultaSalva = new Consulta();
        consultaSalva.setMotivoConsulta(consultaRequest.getMotivoConsulta());
        consultaSalva.setDataHora(consultaRequest.getDataHora());
        consultaSalva.setDescricaoProblema(consultaRequest.getDescricaoProblema());
        consultaSalva.setMedicacaoReceitada(consultaRequest.getMedicacaoReceitada());
        consultaSalva.setDosagemPrecaucao(consultaRequest.getDosagemPrecaucao());
        consultaSalva.setPaciente(pacienteEncontrado);
        consultaSalva.setMedico(medicoEncontrado);

        consultaRepository.save(consultaSalva);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Consulta cadastrada." + consultaSalva.toString() + " " +
                        "id do paciente: " + pacienteEncontrado.getId() +
                        "id do médico: " + medicoEncontrado.getId());
    }

    public ResponseEntity<String> atualizaConsultaPorId(Integer id, ConsultaAtualizacaoDTO consultaRequest) {
        try {
            Paciente pacienteEncontrado = pacienteRepository.getById(consultaRequest.getPacienteId());
            Medico medicoEncontrado = medicoRepository.getById(consultaRequest.getMedicoId());
            Consulta consultaAtualizada = consultaRepository.getById(id);

            if (pacienteEncontrado == null || medicoEncontrado == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Consulta não atualizada. Médico ou Paciente não encontrados");
            } else {
                consultaAtualizada.setMotivoConsulta(consultaRequest.getMotivoConsulta());
                consultaAtualizada.setDescricaoProblema(consultaRequest.getDescricaoProblema());
                consultaAtualizada.setMedicacaoReceitada(consultaRequest.getMedicacaoReceitada());
                consultaAtualizada.setDosagemPrecaucao(consultaRequest.getDosagemPrecaucao());
                consultaAtualizada.setPaciente(pacienteEncontrado);
                consultaAtualizada.setMedico(medicoEncontrado);

                consultaRepository.save(consultaAtualizada);
                return ResponseEntity.status(HttpStatus.OK)
                        .body("A consulta foi atualizado. " + consultaAtualizada.toString());
            }

        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Consulta não localizada");
        }
    }


    public ResponseEntity<String> buscaConsultasPorId(Integer id) {
        try {
            Consulta consultaEncontrada = consultaRepository.getReferenceById(id);
            ConsultaIdentificadorDTO consultaEncontradaDTO;
            consultaEncontradaDTO = consultaMapper.maptoIdDTO(consultaEncontrada);
            return ResponseEntity.status(HttpStatus.OK).body(consultaEncontradaDTO.toString());
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhuma consulta");

        }
    }

    public ResponseEntity<String> deletarConsultaPorId(Integer id) {
        try {
            Consulta consultaEncontrada = consultaRepository.getReferenceById(id);
            ConsultaExclusaoDTO consultaExcluida;
            consultaExcluida = consultaMapper.maptoExclusaoDTO(consultaEncontrada);// guarda o ultimo excluido
            consultaRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O id: " + id + " não retornou nenhuma consulta");

        }
    }
}
