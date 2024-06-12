package com.pessoas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoas.api.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Long>{

}
