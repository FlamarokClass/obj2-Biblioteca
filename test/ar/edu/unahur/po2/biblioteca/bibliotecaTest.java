package ar.edu.unahur.po2.biblioteca;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class bibliotecaTest {

	@Test
	public void queSeCreaVacia() {
		Biblioteca biblio = new Biblioteca("Nombre");
		Integer esperado = 0;
		assertEquals(esperado,biblio.getCantidadDeLibros());
	}
	
	@Test
	public void queSePuedaAgregarUnLibro() {
		Biblioteca biblio = new Biblioteca("Nombre");
		Integer nroPaginas = 123;
		Integer isbn = nroPaginas;
		String titulo = "Titulo";
		String autor = "Autor";
		Libro libro1 = new Libro(isbn,titulo, autor,nroPaginas);
		
		biblio.agregarLibro(libro1);
		Integer esperado = 1;
		assertEquals(esperado,biblio.getCantidadDeLibros());
	}
	
	@Test
	public void queSePuedanAgregarVariosLibro() {
		Biblioteca biblio = new Biblioteca("Nombre");
		Integer nroPaginas = 123;
		Integer isbn = nroPaginas;
		String titulo = "Titulo";
		String autor = "Autor";
		Libro libro1 = new Libro(isbn,titulo, autor,nroPaginas);
		Libro libro2 = new Libro(isbn+1,titulo, autor,nroPaginas);
		Libro libro3 = new Libro(isbn+2,titulo, autor,nroPaginas);
		
		biblio.agregarLibro(libro1);
		biblio.agregarLibro(libro2);
		biblio.agregarLibro(libro3);
		
		Integer esperado = 3;
		Integer obtenido = biblio.getLibros().size();
		
		assertEquals(esperado, biblio.getCantidadDeLibros()); // pide cantidad
		assertEquals(esperado, obtenido); // tambien pide la cantidad del conjunto mejor aplicado
	}
	
	@Test
	public void queNoSePuedaAgregarLibroRepetido() {
		Biblioteca biblio = new Biblioteca("Nombre");
		Integer nroPaginas = 123;
		Integer isbn = nroPaginas;
		String titulo = "Titulo";
		String autor = "Autor";
		Libro libro1 = new Libro(isbn,titulo, autor,nroPaginas);
		Libro libro2 = new Libro(isbn,titulo, autor,nroPaginas);
		
		biblio.agregarLibro(libro1);
		biblio.agregarLibro(libro2);
		
		Integer esperado = 1;
		Integer obtenido = biblio.getLibros().size();
		
		assertEquals(esperado, biblio.getCantidadDeLibros()); // pide cantidad
		assertEquals(esperado, obtenido); // tambien pide la cantidad del conjunto mejor aplicado
	}
	
	@Test
	public void queSePuedaListarLibrosOrdenadosPorTitulo() {
		Biblioteca biblio = new Biblioteca("Nombre");
		Integer nroPaginas = 123;
		Integer isbn = nroPaginas;
		String autor = "Autor";
		Libro libro1 = new Libro(isbn,"Libro C", autor,nroPaginas);
		Libro libro2 = new Libro(isbn+1,"Libro A", autor,nroPaginas);
		Libro libro3 = new Libro(isbn+2,"Libro B", autor,nroPaginas);
		
		
		LinkedList<Libro> esperado= new LinkedList<Libro>();
		esperado.add(libro2);
		esperado.add(libro3);
		esperado.add(libro1);
		
		biblio.agregarLibro(libro1);
		biblio.agregarLibro(libro2);
		biblio.agregarLibro(libro3);
		
		assertEquals(esperado, biblio.getLibrosOrdenadosPorTitulo()); 
	}
	
}
