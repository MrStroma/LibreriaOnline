package com.example.libreriaonlinejpa.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.libreriaonlinejpa.entities.Autore;

public interface AutoreRepository extends JpaRepository<Autore, Integer> {
	
	@Query(value="SELECT a FROM Autore a WHERE a.nome =:nome")
    public Optional<Autore> getAutoreByName(@Param("nome")String nome);

}
