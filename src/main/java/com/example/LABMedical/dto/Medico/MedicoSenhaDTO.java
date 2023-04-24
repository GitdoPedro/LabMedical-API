package com.example.LABMedical.dto.Medico;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class MedicoSenhaDTO {
    @NotNull(message = "O campo senha é obrigatório")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "A senha deve ser alfanumérica de no mínimo 8 caracteres")
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
