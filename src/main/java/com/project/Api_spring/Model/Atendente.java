package com.project.Api_spring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter 
@Entity
@Table(name = "Atendentes")
public class Atendente {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    public Atendente() {
    }

    public Atendente(String nome, String email, String password) {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }
}
