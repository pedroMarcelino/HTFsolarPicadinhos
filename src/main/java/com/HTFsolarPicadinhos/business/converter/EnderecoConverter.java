package com.HTFsolarPicadinhos.business.converter;

import com.HTFsolarPicadinhos.business.dto.usuario.EnderecoCreateDTO;
import com.HTFsolarPicadinhos.infrastructure.entity.Endereco;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoConverter {

    public Endereco toEntityEndereco(EnderecoCreateDTO dto){
        return Endereco.builder()
                .cep(dto.getCep())
                .rua(dto.getRua())
                .numero(dto.getNumero())
                .bairro(dto.getBairro())
                .complemento(dto.getComplemento())
                .cidade(dto.getCidade())
                .estado(dto.getEstado())
                .obsEntrega(dto.getObsEntrega())
                .build();
    }

    public List<Endereco> toEntityListEndereco(List<EnderecoCreateDTO> enderecoDTOS){
        if (enderecoDTOS == null) return List.of();
        return enderecoDTOS.stream().map(this::toEntityEndereco).toList();
    }




    public EnderecoCreateDTO toDTOEndereco(Endereco entity){
        return EnderecoCreateDTO.builder()
                .cep(entity.getCep())
                .rua(entity.getRua())
                .numero(entity.getNumero())
                .bairro(entity.getBairro())
                .complemento(entity.getComplemento())
                .cidade(entity.getCidade())
                .estado(entity.getEstado())
                .obsEntrega(entity.getObsEntrega())
                .build();
    }


    public List<EnderecoCreateDTO> toDTOListEndereco(List<Endereco> entity){
        if (entity == null) return List.of();
        return entity.stream().map(this::toDTOEndereco).toList();
    }
}
