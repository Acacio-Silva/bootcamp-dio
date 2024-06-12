package com.pessoas.api.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Aluno extends Pessoa {
    private String curso;
    private String matricula;
    private LocalDate dataNascimento;
}