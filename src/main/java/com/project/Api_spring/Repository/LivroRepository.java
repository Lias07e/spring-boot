package com.project.Api_spring.Repository;

import com.project.Api_spring.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}