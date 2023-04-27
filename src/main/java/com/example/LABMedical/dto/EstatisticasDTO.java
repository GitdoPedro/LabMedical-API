package com.example.LABMedical.dto;

public class EstatisticasDTO {
    private long quantidadePacientes;
    private long quantidadeConsultas;
    private long quantidadeExames;

    public EstatisticasDTO(long quantidadePacientes, long quantidadeConsultas, long quantidadeExames) {
        this.quantidadePacientes = quantidadePacientes;
        this.quantidadeConsultas = quantidadeConsultas;
        this.quantidadeExames = quantidadeExames;
    }

    public long getQuantidadePacientes() {
        return quantidadePacientes;
    }

    public void setQuantidadePacientes(long quantidadePacientes) {
        this.quantidadePacientes = quantidadePacientes;
    }

    public long getQuantidadeConsultas() {
        return quantidadeConsultas;
    }

    public void setQuantidadeConsultas(long quantidadeConsultas) {
        this.quantidadeConsultas = quantidadeConsultas;
    }

    public long getQuantidadeExames() {
        return quantidadeExames;
    }

    public void setQuantidadeExames(long quantidadeExames) {
        this.quantidadeExames = quantidadeExames;
    }

    @Override
    public String toString() {
        return "Estatísticas: \n" +
                "Quantidade de pacientes: " + quantidadePacientes + "\n" +
                "Quantidade de consultas: " + quantidadeConsultas + "\n" +
                "Quantidade de exames: " + quantidadeExames;
    }
}

