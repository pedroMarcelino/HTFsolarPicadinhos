package com.HTFsolarPicadinhos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Endereco")
@Builder

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nmProduto", length = 50)
    private String nmProduto;

    @Column(name = "preco", length = 6)
    private Double preco;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "urlProduto")
    private String urlProduto;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
