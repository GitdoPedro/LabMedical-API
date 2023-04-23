package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Medico.MedicoCadastroDTO;
import com.example.LABMedical.service.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/usuarios")
public class MedicoController {

    @Autowired
    private MedicoService MedicoService;

    @PostMapping("/adicionar")
    public ResponseEntity<String> salvarMedico(@RequestBody @Valid MedicoCadastroDTO MedicoRequest){
        return MedicoService.salvarMedico(MedicoRequest);
    }

}
