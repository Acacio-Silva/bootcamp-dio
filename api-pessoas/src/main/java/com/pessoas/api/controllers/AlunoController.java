package com.pessoas.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.api.models.dtos.AlunoDTO;
import com.pessoas.api.services.impl.AlunoServiceImpl;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @Operation(summary = "Realiza o cadastro de um aluno", method = "POST")
    @PostMapping
    public AlunoDTO createAluno(@RequestBody AlunoDTO alunoDTO) {
        return alunoService.createAluno(alunoDTO);
    }


}

