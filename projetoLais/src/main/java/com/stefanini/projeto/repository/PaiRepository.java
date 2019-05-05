package com.stefanini.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import com.stefanini.projeto.model.Pai;

public interface PaiRepository extends CrudRepository<Pai, Long>{
	
}