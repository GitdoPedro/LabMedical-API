package com.example.LABMedical.controller;

import com.example.LABMedical.dto.Medico.MedicoAtualizacaoDTO;
import com.example.LABMedical.dto.Medico.MedicoCadastroDTO;
import com.example.LABMedical.dto.Medico.MedicoSenhaDTO;
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
    public ResponseEntity<String> salvarMedico(@RequestBody @Valid MedicoCadastroDTO medicoRequest){
        return MedicoService.salvarMedico(medicoRequest);
    }

    //S02 - Atualização dos dados de Usuários (Médicos)
    @PutMapping
    public ResponseEntity<String> atualizaMedicoPorId(@RequestParam Integer id,
                                                    @RequestBody @Valid MedicoAtualizacaoDTO medicoRequest) {
        return MedicoService.atualizaMedicoPorId(id, medicoRequest);
    }

    //S03 - Atualização da senha de Usuários (Médicos)

    @PutMapping("/{id}/senha")
    public ResponseEntity<String> atualizaSenhaMedico(@PathVariable Integer id,
                                                      @RequestBody @Valid MedicoSenhaDTO medicoRequest){
        return MedicoService.atualizaSenhaMedico(id,medicoRequest);
    }


}
