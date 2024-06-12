package com.pessoas.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoas.api.models.Professor;
import com.pessoas.api.models.dtos.ProfessorDTO;
import com.pessoas.api.repositories.ProfessorRepository;
import com.pessoas.api.services.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService{

    @Autowired
    private ProfessorRepository professorRepository;
    
	@Override
    public ProfessorDTO createProfessor(ProfessorDTO professorDTO) {
        Professor professor = new Professor();
        professor.setNome(professorDTO.getNome());
        professor.setEmail(professorDTO.getEmail());
        professor.setDepartamento(professorDTO.getDepartamento());
        professor.setSalario(professorDTO.getSalario());
        professor.setDataContratacao(professorDTO.getDataContratacao());
        return convertToDTO(professorRepository.save(professor));
    }
    
    private ProfessorDTO convertToDTO(Professor professor) {
        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setId(professor.getId());
        professorDTO.setNome(professor.getNome());
        professorDTO.setEmail(professor.getEmail());
        professorDTO.setDepartamento(professor.getDepartamento());
        professorDTO.setSalario(professor.getSalario());
        professorDTO.setDataContratacao(professor.getDataContratacao());
        return professorDTO;
    }
	
}
