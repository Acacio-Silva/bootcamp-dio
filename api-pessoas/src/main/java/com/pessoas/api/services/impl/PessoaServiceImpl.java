package com.pessoas.api.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoas.api.exceptions.ResourceNotFoundException;
import com.pessoas.api.models.Aluno;
import com.pessoas.api.models.Pessoa;
import com.pessoas.api.models.Professor;
import com.pessoas.api.models.dtos.AlunoDTO;
import com.pessoas.api.models.dtos.PessoaDTO;
import com.pessoas.api.models.dtos.ProfessorDTO;
import com.pessoas.api.repositories.PessoaRepository;
import com.pessoas.api.services.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{
	
    @Autowired
    private PessoaRepository pessoaRepository;

	@Override
    public List<PessoaDTO> getAllPessoas() {
        return pessoaRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

	@Override
    public PessoaDTO getPessoaById(Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pessoa not found with id " + id));
        return convertToDTO(pessoa);
    }

    private PessoaDTO convertToDTO(Pessoa pessoa) {
        if (pessoa instanceof Aluno) {
            Aluno aluno = (Aluno) pessoa;
            AlunoDTO alunoDTO = new AlunoDTO();
            alunoDTO.setId(aluno.getId());
            alunoDTO.setNome(aluno.getNome());
            alunoDTO.setEmail(aluno.getEmail());
            alunoDTO.setCurso(aluno.getCurso());
            alunoDTO.setMatricula(aluno.getMatricula());
            alunoDTO.setDataNascimento(aluno.getDataNascimento());
            return alunoDTO;
        } else if (pessoa instanceof Professor) {
            Professor professor = (Professor) pessoa;
            ProfessorDTO professorDTO = new ProfessorDTO();
            professorDTO.setId(professor.getId());
            professorDTO.setNome(professor.getNome());
            professorDTO.setEmail(professor.getEmail());
            professorDTO.setDepartamento(professor.getDepartamento());
            professorDTO.setSalario(professor.getSalario());
            professorDTO.setDataContratacao(professor.getDataContratacao());
            return professorDTO;
        } else {
            PessoaDTO pessoaDTO = new PessoaDTO();
            pessoaDTO.setId(pessoa.getId());
            pessoaDTO.setNome(pessoa.getNome());
            pessoaDTO.setEmail(pessoa.getEmail());
            return pessoaDTO;
        }
    }

}
