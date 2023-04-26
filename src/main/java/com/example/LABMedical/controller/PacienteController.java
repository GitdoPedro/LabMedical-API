package com.example.LABMedical.controller;


import com.example.LABMedical.dto.Endereco.EnderecoListagemDTO;
import com.example.LABMedical.dto.Paciente.PacienteAtualizacaoDTO;
import com.example.LABMedical.dto.Paciente.PacienteCadastroDTO;
import com.example.LABMedical.dto.Paciente.PacienteListagemDTO;
import com.example.LABMedical.model.Paciente;
import com.example.LABMedical.service.PacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    //S04 - Cadastro de Paciente
    @PostMapping
    public ResponseEntity<String> salvarPaciente(@RequestBody @Valid PacienteCadastroDTO pacienteRequest){
        return pacienteService.salvarPaciente(pacienteRequest);
    }

    //S05 - Atualização dos dados de Pacientes
    @PutMapping
    public ResponseEntity<String> atualizaPacientePorId(@RequestParam Integer id,
                                                      @RequestBody @Valid PacienteAtualizacaoDTO pacienteRequest) {
        return pacienteService.atualizaPacientePorId(id, pacienteRequest);
    }

   // S06 - Listagem de Pacientes
    @GetMapping
    public ResponseEntity<List<Paciente>> listarPacientes(
            @RequestParam(required = false) String nome) {
        List<Paciente> pacientes = pacienteService.listarPacientes(nome);
        return ResponseEntity.ok(pacientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> buscaPacientesPorId(@PathVariable Integer id) {
         return pacienteService.buscaPacientesPorId(id);
    }




}
