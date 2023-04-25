package com.example.LABMedical.respository;

import com.example.LABMedical.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    @Query("SELECT p FROM Paciente p WHERE p.CPF = :cpf")
    Optional<Paciente> findByCpf(@Param("cpf") String cpf);

}
