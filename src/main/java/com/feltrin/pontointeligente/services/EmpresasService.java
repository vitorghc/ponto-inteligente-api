package com.feltrin.pontointeligente.services;

import java.util.Optional;

import com.feltrin.pontointeligente.entities.Empresa;

public interface EmpresasService {

	/**
	 * Retorna uma empresa dado um cnpj
	 * 
	 * @param cnpj
	 * @return Optional
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Persisti dados de uma empresa
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir (Empresa empresa);
}
