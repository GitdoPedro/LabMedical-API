package com.example.LABMedical.mapper;

import com.example.LABMedical.dto.Consulta.ConsultaCadastroDTO;
import com.example.LABMedical.dto.Consulta.ConsultaExclusaoDTO;
import com.example.LABMedical.dto.Consulta.ConsultaIdentificadorDTO;
import com.example.LABMedical.dto.Paciente.PacienteExclusaoDTO;
import com.example.LABMedical.dto.Paciente.PacienteIdentificadorDTO;
import com.example.LABMedical.model.Consulta;
import com.example.LABMedical.model.Paciente;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ConsultaMapper {
   // Consulta mapToModel (ConsultaCadastroDTO source);

    ConsultaIdentificadorDTO maptoIdDTO(Consulta source);
    ConsultaExclusaoDTO maptoExclusaoDTO(Consulta source);
}
