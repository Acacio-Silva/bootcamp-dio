package com.pessoas.api.services;

import java.util.List;

import com.pessoas.api.models.dtos.PessoaDTO;

public interface PessoaService {

	List<PessoaDTO> getAllPessoas();
	PessoaDTO getPessoaById(Long id);
	
	
}
