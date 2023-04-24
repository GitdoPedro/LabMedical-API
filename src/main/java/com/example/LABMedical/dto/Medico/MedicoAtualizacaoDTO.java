package com.example.LABMedical.dto.Medico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class MedicoAtualizacaoDTO {
    @NotNull(message = "O campo nome completo é obrigatório")
    private String nomeCompleto;
    @NotNull(message = "O campo genero é obrigatório")
    private String genero;
    @NotNull(message = "O campo data de nascimento é obrigatório")
    private LocalDate dataNascimento;
    @NotNull(message = "O campo estado civil é obrigatório")
    private String estadoCivil;
    @NotNull(message = "O campo telefone é obrigatório")
    private String telefone;
    @NotNull(message = "O campo e-mail é obrigatório")
    private String email;
    @NotNull(message = "O campo naturalidade é obrigatório")
    private String Naturalidade;
    @NotNull(message = "O campo crm é obrigatório")
    private String CRM;
    @NotNull(message = "O campo especialização é obrigatório")
    private String especializacaoClinica;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        Naturalidade = naturalidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecializacaoClinica() {
        return especializacaoClinica;
    }

    public void setEspecializacaoClinica(String especializacaoClinica) {
        this.especializacaoClinica = especializacaoClinica;
    }
}
