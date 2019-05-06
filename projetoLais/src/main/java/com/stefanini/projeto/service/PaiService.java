package com.stefanini.projeto.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Pai;
import com.stefanini.projeto.repository.PaiRepository;

@Service
@Transactional
public class PaiService {

	@Autowired
	private PaiRepository repository;

	@Transactional
	public Pai salvar(Pai pai) throws TreinaException {
		return repository.save(pai);
	}

	/*
	 * public Pessoa obter(Long numeroProjeto) throws PocException { return
	 * repository.findById(numeroProjeto).get(); }
	 */

	public List<Pai> consultar() throws TreinaException {
		return (List<Pai>) repository.findAll();
	}

	public String excluir(Long id) throws TreinaException {
		repository.deleteById(id);
		return "Excluído com sucesso!";
	}

}