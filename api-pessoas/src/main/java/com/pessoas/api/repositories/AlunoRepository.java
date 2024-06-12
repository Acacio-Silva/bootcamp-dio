package com.pessoas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoas.api.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Long>{

}
