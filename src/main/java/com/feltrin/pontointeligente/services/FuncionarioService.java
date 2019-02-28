package com.feltrin.pontointeligente.services;

import java.util.Optional;

import com.feltrin.pontointeligente.entities.Funcionario;

public interface FuncionarioService {
	
	
	/**
	 * Persistir um funcionário
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir (Funcionario funcionario);
	
	
	/**
	 * Buscar um funcionário por cpf
	 * 
	 * @param cpf
	 * @return Funcionario
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	
	/**
	 * Buscar um funcionário por email
	 * 
	 * @param email
	 * @return Funcionário
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	
	/**
	 * Buscar um funcionário por id
	 * 
	 * @param id
	 * @return Funcionario
	 */
	Optional<Funcionario> buscarPorId(String id);

}
