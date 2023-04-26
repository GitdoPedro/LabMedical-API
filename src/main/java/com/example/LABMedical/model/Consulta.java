package com.example.LABMedical.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String motivoConsulta;
    private LocalDateTime dataHora;
    private String descricaoProblema;
    private String medicacaoReceitada;
    private String dosagemPrecaucao;

    @OneToOne
    private Paciente paciente;

    @OneToOne
    private Medico medico;

    public Consulta() {

    }

    public Consulta(Integer id, String motivoConsulta,
                    LocalDateTime dataHora, String descricaoProblema,
                    String medicacaoReceitada, String dosagemPrecaucao,
                    Paciente paciente, Medico medico) {
        this.id = id;
        this.motivoConsulta = motivoConsulta;
        this.dataHora = dataHora;
        this.descricaoProblema = descricaoProblema;
        this.medicacaoReceitada = medicacaoReceitada;
        this.dosagemPrecaucao = dosagemPrecaucao;
        this.paciente = paciente;
        this.medico = medico;
    }

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

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                ", dataHora=" + dataHora +
                ", descricaoProblema='" + descricaoProblema + '\'' +
                ", medicacaoReceitada='" + medicacaoReceitada + '\'' +
                ", dosagemPrecaucao='" + dosagemPrecaucao + '\'' +
                '}';
    }
}
