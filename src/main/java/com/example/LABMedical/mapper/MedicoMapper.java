package com.example.LABMedical.mapper;

import com.example.LABMedical.dto.Medico.MedicoCadastroDTO;
import com.example.LABMedical.model.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface  MedicoMapper {
    Medico map(MedicoCadastroDTO source);
}
