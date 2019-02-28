package com.feltrin.pontointeligente.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.feltrin.pontointeligente.entities.Lancamento;
import com.feltrin.pontointeligente.repositories.LancamentoRepository;
import com.feltrin.pontointeligente.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {

	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo um lancamento: {}", lancamento);
		return this.lancamentoRepository.save(lancamento);
	}

	public Page<Lancamento> buscarPorFuncionarioId(Long id, PageRequest pageRequest) {
		log.info("buscando uma lancamento pelo ID {}", id);
		return this.lancamentoRepository.findByFuncionarioId(id, pageRequest);
	}

	public Optional<Lancamento> buscarPorId(Long id) {
		log.info("buscando uma empresa dado um cnpj {}", id);
		return Optional.ofNullable(this.lancamentoRepository.findOne(id));
	}

	public void remover(Long id) {
		log.info("Removendo o lançamento ID {}", id);
		this.lancamentoRepository.delete(id);
	}

}
