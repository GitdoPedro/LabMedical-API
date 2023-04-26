package com.example.LABMedical.service;

import com.example.LABMedical.dto.Consulta.ConsultaCadastroDTO;
import com.example.LABMedical.mapper.ConsultaMapper;
import com.example.LABMedical.model.Consulta;
import com.example.LABMedical.model.Medico;
import com.example.LABMedical.model.Paciente;
import com.example.LABMedical.respository.ConsultaRepository;
import com.example.LABMedical.respository.MedicoRepository;
import com.example.LABMedical.respository.PacienteRepository;
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


        if(pacienteEncontrado == null || medicoEncontrado == null){
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
                .body("Consulta cadastrada."+ consultaSalva.toString()+ " "+
                        "id do paciente: "+pacienteEncontrado.getId()+
                        "id do médico: "+medicoEncontrado.getId());
    }
}
