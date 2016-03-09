package br.unipe.mplll.filme.ui;

import br.unipe.mplll.filme.modelo.Autor;
import br.unipe.mplll.filme.modelo.FitaInfantil;
import br.unipe.mplll.filme.modelo.FitaLancamento;
import br.unipe.mplll.filme.modelo.categoria;

public class Executar {

	public static void main(String[] args) {
		
		FitaInfantil fitaTest = new FitaInfantil ();
		Autor autor2 = new Autor ("Joe Oriolo");
		
		FitaLancamento testFita = new FitaLancamento ();
		Autor autor3 = new Autor ("Ray Parker Jr");
		
		fitaTest.setTitulo("Gasparzinho");
		fitaTest.setPrecoDeLocacao(5.00);
		fitaTest.setGenero(categoria.INFANTIL);
		fitaTest.setAutor1(autor2);
		
		testFita.setTitulo(" Os caça fantasmas");
		testFita.setPrecoDeLocacao(5.00);
		testFita.setGenero(categoria.COMEDIA);
		testFita.setAutor1(autor3);
		
		System.out.println(fitaTest);
		System.out.println(testFita);
		
		

	}

}
