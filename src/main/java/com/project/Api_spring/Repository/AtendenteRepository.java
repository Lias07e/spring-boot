package com.project.Api_spring.Repository;

import com.project.Api_spring.Model.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendenteRepository extends JpaRepository<Atendente, Long> {
}