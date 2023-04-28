package com.example.LABMedical.respository;

import com.example.LABMedical.model.Consulta;
import com.example.LABMedical.model.Exame;
import com.example.LABMedical.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExameRepository extends JpaRepository<Exame,Integer> {



}
