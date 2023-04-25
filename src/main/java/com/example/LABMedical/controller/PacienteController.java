package com.example.LABMedical.controller;


import com.example.LABMedical.dto.Paciente.PacienteAtualizacaoDTO;
import com.example.LABMedical.dto.Paciente.PacienteCadastroDTO;
import com.example.LABMedical.service.PacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



}
