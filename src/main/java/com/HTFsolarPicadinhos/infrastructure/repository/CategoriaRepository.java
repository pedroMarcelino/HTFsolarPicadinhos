package com.HTFsolarPicadinhos.infrastructure.repository;

import com.HTFsolarPicadinhos.infrastructure.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
