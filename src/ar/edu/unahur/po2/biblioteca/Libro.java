package ar.edu.unahur.po2.biblioteca;

import java.util.Objects;

public class Libro implements Comparable<Libro> {
	private Integer isbn;
	private String titulo;
	private String autor;
	private int nroPaginas;

	public Libro(Integer isbn, String titulo, String autor, Integer nroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.nroPaginas = nroPaginas;
	}
	

	public String getTitulo() {
		return this.titulo;
	}
	
	
	// Indica que por cual atributo 2 obj tipo Libros pueden ser comparados e igualados.
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public int compareTo(Libro otro) {
		return this.isbn.compareTo(otro.isbn);
	}

	// Para que se pueda comparar Segun el criterio de igualdad. Ver Test Biblioteca (libro repetido)

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + "]";
	}

}
