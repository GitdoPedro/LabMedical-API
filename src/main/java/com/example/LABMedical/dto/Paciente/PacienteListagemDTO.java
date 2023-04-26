package com.example.LABMedical.dto.Paciente;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class PacienteListagemDTO {

    private String nomeCompleto;
    private String genero;
    private LocalDate dataNascimento;
    private String CPF;
    private String RG;
    private String estadoCivil;
    private String telefone;
    private String email;
    private String Naturalidade;
    private String Alergias;
    private String cuidadosEspecificos;
    private String contatoEmergencia;
    private String convenio;
    private String carteiraConvenio;
    private LocalDate validadeConvenio;
    private Integer enderecoId;

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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
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

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String alergias) {
        Alergias = alergias;
    }

    public String getCuidadosEspecificos() {
        return cuidadosEspecificos;
    }

    public void setCuidadosEspecificos(String cuidadosEspecificos) {
        this.cuidadosEspecificos = cuidadosEspecificos;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(String contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getCarteiraConvenio() {
        return carteiraConvenio;
    }

    public void setCarteiraConvenio(String carteiraConvenio) {
        this.carteiraConvenio = carteiraConvenio;
    }

    public LocalDate getValidadeConvenio() {
        return validadeConvenio;
    }

    public void setValidadeConvenio(LocalDate validadeConvenio) {
        this.validadeConvenio = validadeConvenio;
    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }
}
