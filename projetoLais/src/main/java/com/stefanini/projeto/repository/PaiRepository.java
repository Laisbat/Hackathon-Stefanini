package com.stefanini.projeto.repository;
import org.springframework.data.repository.CrudRepository;

import com.stefanini.projeto.model.Pai;

import java.util.List;

public interface PaiRepository extends CrudRepository<Pai, Long>{

    List<Pai> findByNome(String nome);

}