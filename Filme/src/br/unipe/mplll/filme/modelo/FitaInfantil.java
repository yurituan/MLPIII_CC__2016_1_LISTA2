package br.unipe.mplll.filme.modelo;

public class FitaInfantil extends Fita {
	
	public FitaInfantil (String titulo, double precoDeLocacao, categoria genero,Autor autor1) {
		super(titulo, precoDeLocacao, genero , autor1);
		
	}
	
	public FitaInfantil() {
		// TODO Auto-generated constructor stub
	}

	public double locacao ( float precoFita) {
		return (Fita.precoDeLocacao = precoDeLocacao - precoDeLocacao * 0.4);
		
		
	}

	@Override
	public String toString() {
		return "FitaInfantil [titulo=" + titulo + ", precoDeLocacao=" + precoDeLocacao + ", genero=" + genero
				+ ", autor1=" + autor1 + "]";
	}

	
	
	
	
	
	

}
