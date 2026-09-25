package com.project.Api_spring.Controller;

import com.project.Api_spring.Model.Atendente;
import com.project.Api_spring.Service.AtendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private AtendenteService atendenteService;

    @GetMapping
    public List<Atendente> listarTodos() {
        return atendenteService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atendente> buscarPorId(@PathVariable long id) {
        return ResponseEntity.ok(atendenteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Atendente> criar(@RequestBody Atendente atendente) {
        Atendente novoAtendente = atendenteService.salvar(atendente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAtendente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atendente> atualizar(@PathVariable long id, @RequestBody Atendente atendente) {
        return ResponseEntity.ok(atendenteService.atualizar(id, atendente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable long id) {
        atendenteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}