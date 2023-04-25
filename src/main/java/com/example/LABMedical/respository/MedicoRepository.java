package com.example.LABMedical.respository;

import com.example.LABMedical.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {

    @Query("SELECT m FROM Medico m WHERE m.CPF = :cpf")
    Optional<Medico> findByCpf(@Param("cpf") String cpf);

}
