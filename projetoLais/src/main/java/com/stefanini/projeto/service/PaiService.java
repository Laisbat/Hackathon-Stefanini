package com.stefanini.projeto.service;

import java.util.List;
import javax.transaction.Transactional;

import com.stefanini.projeto.model.Filho;
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
	    try {
            return repository.save(pai);
        } catch (Exception e) {
            throw new TreinaException(e.getMessage());
        }
	}


	public Pai obter(Long idPai) throws TreinaException {
		return repository.findById(idPai).get();
	}

	public List<Pai> consultar() throws TreinaException {
		return (List<Pai>) repository.findAll();
	}


	public String excluir(Long id) throws TreinaException {
		repository.deleteById(id);
		return "Excluído com sucesso!";
	}

}