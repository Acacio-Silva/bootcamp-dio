package com.pessoas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoas.api.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Long>{

}
