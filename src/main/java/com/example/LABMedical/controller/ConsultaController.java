package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Consulta.ConsultaCadastroDTO;
import com.example.LABMedical.dto.Endereco.EnderecoCadastroDTO;
import com.example.LABMedical.service.ConsultaService;
import com.example.LABMedical.service.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    @Autowired
    ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<String> salvarConsulta(@RequestBody @Valid ConsultaCadastroDTO consultaRequest){
        return consultaService.salvarConsulta(consultaRequest);
    }
}
