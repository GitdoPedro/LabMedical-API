package com.example.LABMedical.mapper;

import com.example.LABMedical.dto.Consulta.ConsultaCadastroDTO;
import com.example.LABMedical.model.Consulta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ConsultaMapper {
   // Consulta mapToModel (ConsultaCadastroDTO source);
}
