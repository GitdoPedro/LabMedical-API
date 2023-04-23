package com.example.LABMedical.model;

import java.time.LocalDate;

public abstract class Pessoa {
    private Integer id;
    private String nomeCompleto;
    private String genero;
    private LocalDate dataNascimento;
    private String CPF;
    private String RG;
    private String estadoCivil;
    private String telefone;
    private String email;
    private String Naturalidade;

    public Pessoa(Integer id, String nomeCompleto, String genero, LocalDate dataNascimento, String CPF, String RG, String estadoCivil, String telefone, String email, String naturalidade) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.RG = RG;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        Naturalidade = naturalidade;
    }

}
