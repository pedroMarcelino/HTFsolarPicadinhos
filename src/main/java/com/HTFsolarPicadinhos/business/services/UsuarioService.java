package com.HTFsolarPicadinhos.business.services;

import com.HTFsolarPicadinhos.business.converter.UsuarioConverter;
import com.HTFsolarPicadinhos.business.dto.usuario.UsuarioCreateDTO;
import com.HTFsolarPicadinhos.infrastructure.entity.Usuario;
import com.HTFsolarPicadinhos.infrastructure.exceptions.ConflictException;
import com.HTFsolarPicadinhos.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final UsuarioConverter usuarioConverter;

    public UsuarioCreateDTO salvaUsuario(UsuarioCreateDTO dto){
        emailExiste(dto.getEmail());
        dto.setSenha(passwordEncoder.encode(dto.getSenha()));

        Usuario usuario = usuarioConverter.toEntityUsuario(dto);
        usuario = usuarioRepository.save(usuario);
        return usuarioConverter.toDTOUsuarioCreate(usuario);
    }

    public void emailExiste(String email){
        try {
            boolean existe = verificaEmailExistente(email);
            if(existe){
                throw new ConflictException("Esse email já existe no sistema; emailExiste(); email -> " + email);
            }
        }catch (ConflictException e){
            throw new ConflictException("getMessage: " + e.getMessage() + "/n getCause: " + e.getCause());
        }
    }

    public boolean verificaEmailExistente(String email){
        return usuarioRepository.existsByEmail(email);
    }
}
