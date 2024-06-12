package com.pessoas.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.api.models.dtos.ProfessorDTO;
import com.pessoas.api.services.impl.ProfessorServiceImpl;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorServiceImpl professorService;

    @Operation(summary = "Realiza o cadastro de um professor", method = "POST")
    @PostMapping
    public ProfessorDTO createProfessor(@RequestBody ProfessorDTO professorDTO) {
        return professorService.createProfessor(professorDTO);
    }

}
