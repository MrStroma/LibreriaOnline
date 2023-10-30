package com.example.libreriaonlinejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libreriaonlinejpa.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
