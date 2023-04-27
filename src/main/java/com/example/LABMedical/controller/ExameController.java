package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Consulta.ConsultaCadastroDTO;
import com.example.LABMedical.dto.Exame.ExameCadastroDTO;
import com.example.LABMedical.service.ConsultaService;
import com.example.LABMedical.service.ExameService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exames")
public class ExameController {

    @Autowired
    ExameService exameService;

    //S13 - Cadastro de Exame
    @PostMapping
    public ResponseEntity<String> salvarExame(@RequestBody @Valid ExameCadastroDTO exameRequest){
        return exameService.salvarExame(exameRequest);
    }
}
