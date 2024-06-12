package com.pessoas.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoas.api.models.Aluno;
import com.pessoas.api.models.dtos.AlunoDTO;
import com.pessoas.api.repositories.AlunoRepository;
import com.pessoas.api.services.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService{

    @Autowired
    private AlunoRepository alunoRepository;
    
	@Override
    public AlunoDTO createAluno(AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setEmail(alunoDTO.getEmail());
        aluno.setCurso(alunoDTO.getCurso());
        aluno.setMatricula(alunoDTO.getMatricula());
        aluno.setDataNascimento(alunoDTO.getDataNascimento());
        return convertToDTO(alunoRepository.save(aluno));
    }

    private AlunoDTO convertToDTO(Aluno aluno) {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setId(aluno.getId());
        alunoDTO.setNome(aluno.getNome());
        alunoDTO.setEmail(aluno.getEmail());
        alunoDTO.setCurso(aluno.getCurso());
        alunoDTO.setMatricula(aluno.getMatricula());
        alunoDTO.setDataNascimento(aluno.getDataNascimento());
        return alunoDTO;
    }

}
