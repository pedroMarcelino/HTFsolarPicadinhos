package com.HTFsolarPicadinhos.controller;

import com.HTFsolarPicadinhos.business.dto.usuario.UsuarioCreateDTO;
import com.HTFsolarPicadinhos.business.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioCreateDTO> createUsuario(@RequestBody UsuarioCreateDTO dto){
        return ResponseEntity.ok(usuarioService.salvaUsuario(dto));
    }

}
