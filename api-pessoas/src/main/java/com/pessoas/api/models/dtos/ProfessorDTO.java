package com.pessoas.api.models.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ProfessorDTO extends PessoaDTO {
    private String departamento;
    private Double salario;
    private LocalDate dataContratacao;
}