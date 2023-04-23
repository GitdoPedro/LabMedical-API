package com.example.LABMedical.service;

import com.example.LABMedical.dto.Medico.MedicoCadastroDTO;
import com.example.LABMedical.mapper.MedicoMapper;
import com.example.LABMedical.model.Medico;
import com.example.LABMedical.respository.MedicoRepository;
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
        Medico medicoSalvo = medicoMapper.map(medicoRequest);
        medicoRepository.save(medicoSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body("Médico cadastrado com sucesso. ID: " + medicoSalvo.getId());

    }
}
