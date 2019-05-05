package com.stefanini.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Pai;
import com.stefanini.projeto.service.PaiService;

@CrossOrigin
@Controller
@RequestMapping(value = "/pai")
public class PaiController {

	@Autowired
	PaiService service;
	
	/*@RequestMapping(value="/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Pai> findAll() throws TreinaException {
		return paiservice.findAll();
	}*/
	
	@RequestMapping(method = RequestMethod.GET, value = "/consultar", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Pai> consultar()  throws TreinaException{
		return service.consultar();
	}
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}, value = "/salvar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pai> salvar(@RequestBody Pai pai) throws TreinaException{
		return new ResponseEntity<>(service.salvar(pai), HttpStatus.OK);
	}
	
	/*@PostMapping
	public Pai create(@RequestBody Pai pai) throws TreinaException{
	   return service.salvar(pai);
	}*/
		
	@RequestMapping(method = RequestMethod.DELETE, value = "/excluir", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> excluir(@RequestParam(value = "pai") Long id) throws TreinaException{
		service.excluir(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}