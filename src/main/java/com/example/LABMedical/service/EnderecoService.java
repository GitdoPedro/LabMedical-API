package com.example.LABMedical.service;

import com.example.LABMedical.dto.Endereco.EnderecoCadastroDTO;
import com.example.LABMedical.mapper.EnderecoMapper;
import com.example.LABMedical.model.Endereco;
import com.example.LABMedical.respository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    EnderecoMapper enderecoMapper;

    @Autowired
    EnderecoRepository enderecoRepository;


    public ResponseEntity<String> salvarEndereco(EnderecoCadastroDTO enderecoRequest) {
        Endereco enderecoSalvo = enderecoMapper.map(enderecoRequest);
        enderecoRepository.save(enderecoSalvo);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("O cadastro do endereço foi efetuado!" +" "+enderecoSalvo.toString());

    }
}
