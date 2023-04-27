package com.example.LABMedical.dto.Exame;

import com.example.LABMedical.model.Medico;
import com.example.LABMedical.model.Paciente;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

public class ExameExclusaoDTO {

    private Integer id;
    private String nomeExame;
    private LocalDateTime dataHora;
    private String tipoExame;
    private String laboratorio;
    private String arquivoExame;
    private String resultadoExame;
    private Paciente paciente;
    private Medico medico;

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
}
