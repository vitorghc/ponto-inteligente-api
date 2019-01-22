package com.feltrin.pontointeligente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.feltrin.pontointeligente.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {

	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);

}
