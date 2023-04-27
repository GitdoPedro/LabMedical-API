package com.example.LABMedical.service;

import com.example.LABMedical.dto.EstatisticasDTO;
import com.example.LABMedical.respository.ConsultaRepository;
import com.example.LABMedical.respository.ExameRepository;
import com.example.LABMedical.respository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EstatisticaService {
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    ConsultaRepository consultaRepository;
    @Autowired
    ExameRepository exameRepository;
    public ResponseEntity<String> buscarEstatisticas() {

        long quantidadePacientes = pacienteRepository.count();
        long quantidadeConsultas = consultaRepository.count();
        long quantidadeExames = exameRepository.count();

        EstatisticasDTO estatisticasDTO = new EstatisticasDTO(quantidadePacientes, quantidadeConsultas, quantidadeExames);

        return ResponseEntity.status(HttpStatus.OK).body(estatisticasDTO.toString());

    }
}
