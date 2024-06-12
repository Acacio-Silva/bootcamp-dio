package com.pessoas.api.models.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AlunoDTO extends PessoaDTO {
    private String curso;
    private String matricula;
    private LocalDate dataNascimento;
}
