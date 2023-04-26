package com.example.LABMedical.dto.Consulta;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class ConsultaCadastroDTO {

    @NotNull(message = "O campo motivo da consulta é obrigatório")
    private String motivoConsulta;
    @NotNull(message = "O campo data e hora é obrigatório")
    private LocalDateTime dataHora;
    @NotNull(message = "O campo descrição do problema é obrigatório")
    private String descricaoProblema;
    @NotNull(message = "O campo medicação receitada é obrigatório")
    private String medicacaoReceitada;
    @NotNull(message = "O campo dosagem e precaução é obrigatório")
    private String dosagemPrecaucao;

    @NotNull(message = "O campo id do paciente é obrigatório")
    private Integer pacienteId;

    @NotNull(message = "O campo id do médico é obrigatório")
    private Integer medicoId;

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getMedicacaoReceitada() {
        return medicacaoReceitada;
    }

    public void setMedicacaoReceitada(String medicacaoReceitada) {
        this.medicacaoReceitada = medicacaoReceitada;
    }

    public String getDosagemPrecaucao() {
        return dosagemPrecaucao;
    }

    public void setDosagemPrecaucao(String dosagemPrecaucao) {
        this.dosagemPrecaucao = dosagemPrecaucao;
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Integer getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Integer medicoId) {
        this.medicoId = medicoId;
    }
}
