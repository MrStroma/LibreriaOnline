package com.example.libreriaonlinejpa.dtos;

import java.util.List;

import com.example.libreriaonlinejpa.entities.Libro;

public class AutoreDTO {

	private int autoreId;

	private String nome;

	private String cognome;

	private List<Libro> libri;

	public int getAutoreId() {
		return autoreId;
	}

	public void setAutoreId(int autoreId) {
		this.autoreId = autoreId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}

}
