package com.HTFsolarPicadinhos.business.UsuarioDTO;

import com.HTFsolarPicadinhos.infrastructure.entity.Endereco;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioCreateDTO {
    private String nome;
    private String sobrenome;
    private String email;
    private String ddd;
    private String numTelefone;

    private List<Endereco> enderecos;
}
