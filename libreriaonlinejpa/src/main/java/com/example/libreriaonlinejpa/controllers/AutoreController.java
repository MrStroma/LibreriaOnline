package com.example.libreriaonlinejpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreriaonlinejpa.dtos.AutoreDTO;
import com.example.libreriaonlinejpa.dtos.LibroDTO;
import com.example.libreriaonlinejpa.services.AutoreService;
import com.example.libreriaonlinejpa.services.LibroService;

@RestController
@RequestMapping("/autori")
public class AutoreController {

	@Autowired
	AutoreService as;

	@GetMapping("/autori")
	public ResponseEntity<List<AutoreDTO>> getAutori() throws Exception {
		List<AutoreDTO> autori = as.getAll();

		return new ResponseEntity<>(autori, HttpStatus.OK);
	}

	@PostMapping("/autore")
	public ResponseEntity<AutoreDTO> addAutore(@RequestBody AutoreDTO autore) throws Exception {
		as.save(autore);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	@GetMapping("/autore/{name}")
	public ResponseEntity<AutoreDTO> getAutoreByName(@PathVariable String name) throws Exception {
		AutoreDTO autore = as.getByName(name);

		return new ResponseEntity<>(autore, HttpStatus.OK);
	}

}
