package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Endereco.EnderecoCadastroDTO;
import com.example.LABMedical.service.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    //S18 - Cadastro de Endereco
    @PostMapping
    public ResponseEntity<String> salvarEndereco(@RequestBody @Valid EnderecoCadastroDTO enderecoRequest){
        return enderecoService.salvarEndereco(enderecoRequest);
    }
}
