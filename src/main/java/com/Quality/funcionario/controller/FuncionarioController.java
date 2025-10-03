package com.Quality.funcionario.controller;

import com.Quality.funcionario.dto.input.FuncionarioInput;
import com.Quality.funcionario.dto.output.FuncionarioOutput;
import com.Quality.funcionario.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/funcionario")
@RequiredArgsConstructor
public class FuncionarioController {

    public final FuncionarioService service;

    @PostMapping
    public ResponseEntity<Resource> inserir(FuncionarioInput input) {
        service.inserir(input);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resource> atualizar(@PathVariable Long id, FuncionarioInput input) {
        service.atualizar(id, input);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{nome}")
    public FuncionarioOutput find(@PathVariable String nome) {
        return service.find(nome);
    }

    @DeleteMapping("/{nome}")
    public ResponseEntity<Resource> remover(@PathVariable String nome) {
        service.remover(nome);
        return ResponseEntity.ok().build();
    }
}
