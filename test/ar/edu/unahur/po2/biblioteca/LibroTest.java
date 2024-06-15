package ar.edu.unahur.po2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroTest {

	@Test
	public void queDosLibrosSeanIdenticosMAL() {
		Integer nroPaginas = 123;
		Integer isbn = nroPaginas;
		String titulo = "Titulo";
		String autor = "Autor";
		Libro libro1 = new Libro(isbn,titulo, autor,nroPaginas);
		Boolean esperado = true;
		Libro libro2 = new Libro(isbn,titulo, autor,nroPaginas);
		Boolean obtenido = libro1.equals(libro2);
		assertEquals(esperado,obtenido);
	} // dará error ya que el new apunta a otro registro de memora, haciendo 2 obj !=
	
	@Test
	public void queDosLibrosSeanIdenticos() {
		Integer nroPaginas = 123;
		Integer isbn = nroPaginas;
		String titulo = "Titulo";
		String autor = "Autor";
		Libro libro1 = new Libro(isbn,titulo, autor,nroPaginas);
		Boolean esperado = true;
		Libro libro2 = libro1;
		Boolean obtenido = libro1.equals(libro2);
		assertEquals(esperado,obtenido);
	}
	
	@Test
	public void QueDosLibrosSeanIGualesCuandoTenganElMismoISBM() {
		Integer nroPaginas = 123;
		Integer isbn = nroPaginas;
		String titulo = "Titulo";
		String autor = "Autor";
		Libro libro1 = new Libro(isbn,titulo, autor,nroPaginas);
		Boolean esperado = true;
		Libro libro2 = new Libro(isbn+1,titulo, autor,nroPaginas);
		Boolean obtenido = libro1.equals(libro2);
		assertEquals(esperado,obtenido);
	} 
	
}
