package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Consulta.ConsultaAtualizacaoDTO;
import com.example.LABMedical.dto.Consulta.ConsultaCadastroDTO;
import com.example.LABMedical.dto.Exame.ExameAtualizacaoDTO;
import com.example.LABMedical.dto.Exame.ExameCadastroDTO;
import com.example.LABMedical.service.ConsultaService;
import com.example.LABMedical.service.ExameService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //S14 - Atualização dos dados de Exames
    @PutMapping
    public ResponseEntity<String> atualizaExamePorId(@RequestParam Integer id,
                                                        @RequestBody @Valid ExameAtualizacaoDTO exameRequest) {
        return exameService.atualizaExamePorId(id, exameRequest);
    }

    //S15 - Listagem de Exame pelo identificador
    @GetMapping("/{id}")
    public ResponseEntity<String> buscaExamesPorId(@PathVariable Integer id) {
        return exameService.buscaExamesPorId(id);
    }
}
