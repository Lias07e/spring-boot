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
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String password;


    // Constructor
    public Cliente() {
    }

    public Cliente(String nome, String email, String telefone, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.password = senha;
    }

    

}