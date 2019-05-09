package com.stefanini.projeto.service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Filho;
import com.stefanini.projeto.repository.FilhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FilhoService {

	@Autowired
	private FilhoRepository repository;

	@Transactional
	public Filho salvar(Filho filho) throws TreinaException {
		return repository.save(filho);
	}

	public String excluir(Long id) throws TreinaException {
		repository.deleteById(id);
		return "Excluído com sucesso!";
	}

}