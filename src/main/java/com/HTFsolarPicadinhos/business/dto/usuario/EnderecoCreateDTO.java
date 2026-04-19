package com.HTFsolarPicadinhos.business.dto.usuario;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoCreateDTO {

    private String cep;
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String obsEntrega;

}
