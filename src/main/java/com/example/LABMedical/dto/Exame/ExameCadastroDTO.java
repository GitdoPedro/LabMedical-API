package com.example.LABMedical.dto.Exame;

import com.example.LABMedical.model.Medico;
import com.example.LABMedical.model.Paciente;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class ExameCadastroDTO {
    @NotNull(message = "O campo nome do exame é obrigatório")
    private String nomeExame;
    @NotNull(message = "O campo data e hora do exame é obrigatório")
    private LocalDateTime dataHora;
    @NotNull(message = "O campo tipo de exame é obrigatório")
    private String tipoExame;
    @NotNull(message = "O campo laboratório é obrigatório")
    private String laboratorio;
    private String arquivoExame;
    @NotNull(message = "O campo resultado do exame é obrigatório")
    private String resultadoExame;
    @NotNull(message = "O campo id do paciente é obrigatório")
    private Integer pacienteId;
    @NotNull(message = "O campo id do médico é obrigatório")
    private Integer medicoId;

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
