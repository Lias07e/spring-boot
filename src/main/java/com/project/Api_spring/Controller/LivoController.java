package com.project.Api_spring.Controller;

import com.project.Api_spring.Model.Livro;
import com.project.Api_spring.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
RequestMapping("/livros")
public class LivroController{

    @Autowired
    private  LivroService LivroService;

    @GetMapping
    public List<Livro> listarTodos (){
        return LivroService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable long id ){
        return ResponseEntity.ok(livroService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Livro> criar(@resquestBody Livro livro){
        Livro novoLivro = livroService.salvar(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
    }
   
    @putMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable long id , @resquestBody Livro){
        return ResponseEntity.ok(livroService.atualizar(id , livro));
    }

    @deleteMapping("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable long id){
        livroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
