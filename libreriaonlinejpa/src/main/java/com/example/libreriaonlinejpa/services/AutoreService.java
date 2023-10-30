package com.example.libreriaonlinejpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreriaonlinejpa.dtos.AutoreDTO;
import com.example.libreriaonlinejpa.dtos.LibroDTO;
import com.example.libreriaonlinejpa.entities.Autore;
import com.example.libreriaonlinejpa.entities.Libro;
import com.example.libreriaonlinejpa.repositories.AutoreRepository;
import com.example.libreriaonlinejpa.repositories.LibroRepository;

@Service
public class AutoreService {

	@Autowired
	private AutoreRepository ar;

	public List<AutoreDTO> getAll() {
		List<AutoreDTO> autori = new ArrayList<>();
		List<Autore> entities = ar.findAll();

		for (int i = 0; i < entities.size(); i++) {
			Autore entity = entities.get(i);
			AutoreDTO autore = new AutoreDTO();
			autore.setAutoreId(entity.getId());
			autore.setNome(entity.getNome());
			autore.setCognome(entity.getCognome());
			autore.setLibri(entity.getLibri());
			autori.add(autore);

		}

		return autori;
	}

	public void save(AutoreDTO autore) {
		Autore autoreentity = new Autore();
		autoreentity.setId(autore.getAutoreId());
		autoreentity.setNome(autore.getNome());
		autoreentity.setCognome(autore.getCognome());
		autoreentity.setLibri(autore.getLibri());
		ar.save(autoreentity);

	}

	public AutoreDTO getByName(String nome) {
		AutoreDTO autoreDTO = new AutoreDTO();
		Optional<Autore> autore = ar.getAutoreByName(nome);
		if (autore.isPresent()) {
			Autore entity = autore.get();
			autoreDTO.setAutoreId(entity.getId());
			autoreDTO.setNome(entity.getNome());
			autoreDTO.setCognome(entity.getCognome());
			autoreDTO.setLibri(entity.getLibri());
		}

		return autoreDTO;
	}
}
