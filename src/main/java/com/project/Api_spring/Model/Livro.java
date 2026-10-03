package com.project.Api_spring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = false)
    private String editora;

    @Column(nullable = false)
    private int anoPublicacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;

    // Constructor
    public Livro() {
    }   
    public Livro(String titulo, String autor, String editora, 
                int anoPublicacao, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

}