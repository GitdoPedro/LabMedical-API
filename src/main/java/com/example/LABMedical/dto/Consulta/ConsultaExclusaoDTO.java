package com.example.LABMedical.dto.Consulta;

import com.example.LABMedical.model.Medico;
import com.example.LABMedical.model.Paciente;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

public class ConsultaExclusaoDTO {
    private Integer id;
    private String motivoConsulta;
    private LocalDateTime dataHora;
    private String descricaoProblema;
    private String medicacaoReceitada;
    private String dosagemPrecaucao;
    private Paciente paciente;
    private Medico medico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
