package com.example.LABMedical.mapper;

import com.example.LABMedical.dto.Consulta.ConsultaExclusaoDTO;
import com.example.LABMedical.dto.Consulta.ConsultaIdentificadorDTO;
import com.example.LABMedical.dto.Exame.ExameExclusaoDTO;
import com.example.LABMedical.dto.Exame.ExameIdentificadorDTO;
import com.example.LABMedical.model.Consulta;
import com.example.LABMedical.model.Exame;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ExameMapper {

    ExameIdentificadorDTO maptoIdDTO(Exame source);

    ExameExclusaoDTO maptoExclusaoDTO(Exame source);
}
