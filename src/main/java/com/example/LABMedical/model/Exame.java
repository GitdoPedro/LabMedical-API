package com.example.LABMedical.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "exame")
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeExame;
    private LocalDateTime dataHora;
    private String tipoExame;
    private String laboratorio;
    private String arquivoExame;
    private String resultadoExame;
    @OneToOne
    private Paciente paciente;

    @OneToOne
    private Medico medico;

    public Exame() {}

    public Exame(Integer id, String nomeExame, LocalDateTime dataHora,
                 String tipoExame, String laboratorio, String arquivoExame,
                 String resultadoExame, Paciente paciente, Medico medico) {
        this.id = id;
        this.nomeExame = nomeExame;
        this.dataHora = dataHora;
        this.tipoExame = tipoExame;
        this.laboratorio = laboratorio;
        this.arquivoExame = arquivoExame;
        this.resultadoExame = resultadoExame;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getArquivoExame() {
        return arquivoExame;
    }

    public void setArquivoExame(String arquivoExame) {
        this.arquivoExame = arquivoExame;
    }

    public String getResultadoExame() {
        return resultadoExame;
    }

    public void setResultadoExame(String resultadoExame) {
        this.resultadoExame = resultadoExame;
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
        return "Exame{" +
                "id=" + id +
                ", nomeExame='" + nomeExame + '\'' +
                ", dataHora=" + dataHora +
                ", tipoExame='" + tipoExame + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", arquivoExame='" + arquivoExame + '\'' +
                ", resultadoExame='" + resultadoExame + '\'' +
                '}';
    }
}
