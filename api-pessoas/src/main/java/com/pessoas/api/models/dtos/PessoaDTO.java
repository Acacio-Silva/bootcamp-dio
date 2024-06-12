package com.pessoas.api.models.dtos;

import lombok.Data;

@Data
public class PessoaDTO {
    private Long id;
    private String nome;
    private String email;
}