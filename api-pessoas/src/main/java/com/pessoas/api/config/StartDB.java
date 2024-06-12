package com.pessoas.api.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pessoas.api.models.Aluno;
import com.pessoas.api.models.Professor;
import com.pessoas.api.repositories.AlunoRepository;
import com.pessoas.api.repositories.ProfessorRepository;

@Configuration
public class StartDB implements CommandLineRunner{

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		aluno.setNome("Acácio");
		aluno.setCurso("Sistemas de informação");
		aluno.setEmail("acacio@email.com");
		aluno.setMatricula("202012345");
		aluno.setDataNascimento(LocalDate.of(2000, 10, 10));
		
		professor.setNome("Francisco");
		professor.setDepartamento("Professor de TI");
		professor.setEmail("francisco@email.com");
		professor.setSalario(100000.0);
		professor.setDataContratacao(LocalDate.of(2020, 1, 15));
		
		alunoRepository.save(aluno);
		
		professorRepository.save(professor);
	}

}
