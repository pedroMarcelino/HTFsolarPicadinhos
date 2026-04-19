package com.HTFsolarPicadinhos.business.converter;

import com.HTFsolarPicadinhos.business.dto.usuario.UsuarioCreateDTO;
import com.HTFsolarPicadinhos.infrastructure.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioConverter {

    private final EnderecoConverter enderecoConverter;

    public Usuario toEntityUsuario(UsuarioCreateDTO dto){
        return Usuario.builder()
                .nome(dto.getNome())
                .sobrenome(dto.getSobrenome())
                .email(dto.getEmail())
                .senha(dto.getSenha())
                .ddd(dto.getDdd())
                .numTelefone(dto.getNumTelefone())
                .enderecos(enderecoConverter.toEntityListEndereco(dto.getEnderecos()))
                .build();
    }


    public UsuarioCreateDTO toDTOUsuarioCreate(Usuario entity){
        return UsuarioCreateDTO.builder()
                .nome(entity.getNome())
                .sobrenome(entity.getSobrenome())
                .email(entity.getEmail())
                .senha(entity.getSenha())
                .ddd(entity.getDdd())
                .numTelefone(entity.getNumTelefone())
                .enderecos(enderecoConverter.toDTOListEndereco(entity.getEnderecos()))
                .build();
    }

}
