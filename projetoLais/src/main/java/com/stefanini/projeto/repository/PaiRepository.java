package com.stefanini.projeto.repository;
import com.stefanini.projeto.exception.TreinaException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.stefanini.projeto.model.Pai;

import java.util.List;

public interface PaiRepository extends CrudRepository<Pai, Long>{

    List<Pai> findByNome(String nome);

}