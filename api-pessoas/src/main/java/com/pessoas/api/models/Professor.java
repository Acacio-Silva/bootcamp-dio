package com.pessoas.api.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Professor extends Pessoa {
    private String departamento;
    private Double salario;
    private LocalDate dataContratacao;
}