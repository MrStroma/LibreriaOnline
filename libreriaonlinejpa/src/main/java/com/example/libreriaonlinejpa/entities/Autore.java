package com.example.libreriaonlinejpa.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "autori")
public class Autore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "autore_id", updatable = false, insertable = false) // qui dico che la colonna come si chiama ecc
	private int id;

	@Column(name = "nome", length = 255, nullable = false)
	private String nome;

	@Column(name = "cognome", length = 255, nullable = false)
	private String cognome;

	@ManyToMany(mappedBy = "autori")
	private List<Libro> libri;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
