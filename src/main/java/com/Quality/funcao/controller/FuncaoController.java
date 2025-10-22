package com.quality.funcao.controller;

import com.quality.funcao.dto.input.FuncaoInput;
import com.quality.funcao.dto.output.FuncaoOutput;
import com.quality.funcao.service.FuncaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/funcao")
@RequiredArgsConstructor
public class FuncaoController {

    private final FuncaoService service;

    @PostMapping
    public ResponseEntity<Resource> inserir(@RequestBody FuncaoInput input) {
        service.inserir(input);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resource> atualizar(@PathVariable Long id, @RequestBody FuncaoInput input) {
        service.atualizar(id, input);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{funcao}")
    public FuncaoOutput find(@PathVariable String funcao) {
        return service.find(funcao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Resource> remover(@PathVariable Long id) {
        service.remover(id);
        return ResponseEntity.ok().build();
    }
}
