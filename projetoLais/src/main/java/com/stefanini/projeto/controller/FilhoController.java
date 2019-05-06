package com.stefanini.projeto.controller;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Filho;
import com.stefanini.projeto.service.FilhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@Controller
@RequestMapping(value = "/filho")
public class FilhoController {

	@Autowired
	FilhoService service;

	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}, value = "/salvar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Filho> salvar(@RequestBody Filho filho) throws TreinaException{
		return new ResponseEntity<>(service.salvar(filho), HttpStatus.OK);
	}
}