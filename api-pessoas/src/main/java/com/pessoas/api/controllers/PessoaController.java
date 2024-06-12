package com.pessoas.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.api.models.dtos.PessoaDTO;
import com.pessoas.api.services.impl.PessoaServiceImpl;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaServiceImpl pessoaService;

    @Operation(summary = "Realiza a busca de todas as pessoas cadastradas (alunos ou professores)", method = "GET")
    @GetMapping
    public ResponseEntity<List<PessoaDTO>> getAllPessoas() {
        return ResponseEntity.ok(pessoaService.getAllPessoas());
    }
    @Operation(summary = "Realiza a busca de ums pessoa especifica (alunos ou professores)", method = "GET")
    @GetMapping("/{id}")
    public ResponseEntity<PessoaDTO> getPessoaById(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaService.getPessoaById(id));
    }
}


