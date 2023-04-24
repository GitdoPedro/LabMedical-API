package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Endereco.EnderecoCadastroDTO;
import com.example.LABMedical.dto.Endereco.EnderecoListagemDTO;
import com.example.LABMedical.model.Endereco;
import com.example.LABMedical.service.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<EnderecoListagemDTO>> listarEnderecos() {
        List<EnderecoListagemDTO> enderecos = enderecoService.listarEnderecos();
        return ResponseEntity.ok(enderecos);
    }
}
