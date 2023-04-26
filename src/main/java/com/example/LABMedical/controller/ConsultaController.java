package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Consulta.ConsultaAtualizacaoDTO;
import com.example.LABMedical.dto.Consulta.ConsultaCadastroDTO;
import com.example.LABMedical.dto.Endereco.EnderecoCadastroDTO;
import com.example.LABMedical.dto.Paciente.PacienteAtualizacaoDTO;
import com.example.LABMedical.service.ConsultaService;
import com.example.LABMedical.service.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    @Autowired
    ConsultaService consultaService;

    //S09 - Cadastro de Consulta
    @PostMapping
    public ResponseEntity<String> salvarConsulta(@RequestBody @Valid ConsultaCadastroDTO consultaRequest){
        return consultaService.salvarConsulta(consultaRequest);
    }

    @PutMapping
    public ResponseEntity<String> atualizaConsultaPorId(@RequestParam Integer id,
                                                        @RequestBody @Valid ConsultaAtualizacaoDTO consultaRequest) {
        return consultaService.atualizaConsultaPorId(id, consultaRequest);
    }


}
