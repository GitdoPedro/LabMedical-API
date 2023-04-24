package com.example.LABMedical.mapper;

import com.example.LABMedical.dto.Endereco.EnderecoCadastroDTO;
import com.example.LABMedical.dto.Endereco.EnderecoListagemDTO;
import com.example.LABMedical.model.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EnderecoMapper {
    Endereco map(EnderecoCadastroDTO source);

    EnderecoListagemDTO map(Endereco source);
    List<EnderecoListagemDTO> toDto(List<Endereco> models);
}
