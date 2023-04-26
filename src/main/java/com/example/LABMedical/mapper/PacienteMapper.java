package com.example.LABMedical.mapper;

import com.example.LABMedical.dto.Endereco.EnderecoListagemDTO;
import com.example.LABMedical.dto.Paciente.PacienteListagemDTO;
import com.example.LABMedical.model.Endereco;
import com.example.LABMedical.model.Paciente;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PacienteMapper {

    PacienteListagemDTO map(Paciente source);
    List<PacienteListagemDTO> toDto(List<Paciente> models);
}
