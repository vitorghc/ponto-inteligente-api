package com.feltrin.pontointeligente.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feltrin.pontointeligente.entities.Empresa;
import com.feltrin.pontointeligente.repositories.EmpresaRepository;
import com.feltrin.pontointeligente.services.EmpresasService;

@Service
public class EmpresaServiceImpl implements EmpresasService {

	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("buscando uma empresa dado um cnpj {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistino empresa: {}", empresa);
		return this.empresaRepository.save(empresa);
	}

}
