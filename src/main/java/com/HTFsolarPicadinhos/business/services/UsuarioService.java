package com.HTFsolarPicadinhos.business.services;

import com.HTFsolarPicadinhos.business.UsuarioDTO.UsuarioCreateDTO;
import com.HTFsolarPicadinhos.infrastructure.entity.Usuario;
import com.HTFsolarPicadinhos.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioCreateDTO salvaUsuario(UsuarioCreateDTO dto){

        Usuario usuario = usuarioRepository.save();
        return
    }
}
