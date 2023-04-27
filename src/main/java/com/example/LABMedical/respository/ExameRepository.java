package com.example.LABMedical.respository;

import com.example.LABMedical.model.Consulta;
import com.example.LABMedical.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameRepository extends JpaRepository<Exame,Integer> {

}
