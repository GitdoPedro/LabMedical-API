package com.example.LABMedical.controller;

import com.example.LABMedical.service.ConsultaService;
import com.example.LABMedical.service.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estatisticas")
public class EstatisticaController {

    @Autowired
    EstatisticaService estatisticaService;

    //S17 - Listagem de Estatísticas
    @GetMapping
    public ResponseEntity<String> buscarEstatisticas() {
        return estatisticaService.buscarEstatisticas();
    }
}
