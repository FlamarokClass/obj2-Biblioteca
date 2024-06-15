package ar.edu.unahur.po2.biblioteca;

import java.util.Comparator;

public class PorTituloComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro unLibro, Libro otroLibro) {
		return unLibro.getTitulo().compareTo(otroLibro.getTitulo());
	}

}
