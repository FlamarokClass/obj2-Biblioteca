package ar.edu.unahur.po2.biblioteca;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Biblioteca {
	private String nombre;
	LinkedList<Libro> libros = new LinkedList<Libro>();

	public Biblioteca(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadDeLibros() {
		return this.libros.size();
	}

	public void agregarLibro(Libro libro) {
		if (!this.libros.contains(libro)) { // el contains se basa el equals/hashCode y el atributo de igualdad que
											// definimos
			this.libros.add(libro);
		}
	}

	public LinkedList<Libro> getLibros() {
		LinkedList<Libro> otro = new LinkedList<Libro>();
		for (Libro cada : this.libros) {// recorrer
			otro.add(cada);
		}
		return otro; // Ordenados por orden natural(ISBN) indicado en Libro.
	}

	/*
	public TreeSet<Libro> getLibrosOrdenadosPorTitulo() {
		TreeSet<Libro> tituloOrdenado = new TreeSet<Libro>(new PorTituloComparator());
		tituloOrdenado.addAll(libros);
		return tituloOrdenado;
	}
	*/
	
	public LinkedList<Libro> getLibrosOrdenadosPorTitulo() {
		LinkedList<Libro> tituloOrdenado = new LinkedList<Libro>();
		for (Libro unLibro : this.libros) {
			tituloOrdenado.add(unLibro);
		}
		Collections.sort(tituloOrdenado, new PorTituloComparator());
		return tituloOrdenado;
	}
	

}
