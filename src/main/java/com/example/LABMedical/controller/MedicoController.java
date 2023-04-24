package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Medico.MedicoAtualizacaoDTO;
import com.example.LABMedical.dto.Medico.MedicoCadastroDTO;
import com.example.LABMedical.service.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/usuarios")
public class MedicoController {

    @Autowired
    private MedicoService MedicoService;

    //S01 - Cadastro de Usuários (Médicos)
    @PostMapping("/adicionar")
    public ResponseEntity<String> salvarMedico(@RequestBody @Valid MedicoCadastroDTO MedicoRequest){
        return MedicoService.salvarMedico(MedicoRequest);
    }

    //S02 - Atualização dos dados de Usuários (Médicos)
    @PutMapping
    public ResponseEntity<String> atualizaMedicoPorId(@RequestParam Integer id,
                                                    @RequestBody @Valid MedicoAtualizacaoDTO MedicoRequest) {
        return MedicoService.atualizaMedicoPorId(id, MedicoRequest);
    }

}
