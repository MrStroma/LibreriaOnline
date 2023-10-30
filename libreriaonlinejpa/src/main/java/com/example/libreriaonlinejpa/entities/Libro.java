package com.example.libreriaonlinejpa.entities;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.*;

@Entity
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id",updatable=false, insertable=false)//qui dico che la colonna come si chiama ecc
	private int id;
	
	@Column(name = "title", length = 255, nullable= false)
	private String titolo;
	
	@Column(name = "genere", length = 255, nullable= false)
	private String genere;
	
	@Column(name = "price", nullable=false)//qui dico che la colonna come si chiama ecc
	private float prezzo;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "libreria_online",
            joinColumns = @JoinColumn(name ="book_id", referencedColumnName = "book_id"),
            inverseJoinColumns = @JoinColumn(name="autore_id", referencedColumnName = "autore_id")
    )
	private List<Autore> autori;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public List<Autore> getAutori() {
		return autori;
	}

	public void setAutori(List<Autore> autori) {
		this.autori = autori;
	}
	
	
}
