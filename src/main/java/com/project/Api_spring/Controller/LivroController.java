package com.project.Api_spring.Controller;

import com.project.Api_spring.Model.Livro;
import com.project.Api_spring.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController{

    @Autowired
    private  LivroService LivroService;

    @GetMapping
    public List<Livro> listarTodos (){
        return LivroService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable long id ){
        return ResponseEntity.ok(LivroService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Livro> criar(@RequestBody Livro livro){
        Livro novoLivro = LivroService.salvar(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
    }
   
    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable long id , @RequestBody Livro livro){
        return ResponseEntity.ok(LivroService.atualizar(id , livro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable long id){
        LivroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
