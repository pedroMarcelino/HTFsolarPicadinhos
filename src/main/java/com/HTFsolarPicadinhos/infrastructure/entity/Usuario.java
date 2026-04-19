package com.HTFsolarPicadinhos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
@Builder

public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "ddd", length = 3)
    private String ddd;

    @Column(name = "numTelefone", length = 9)
    private String numTelefone;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private List<Endereco> enderecos;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public @Nullable String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }
}
