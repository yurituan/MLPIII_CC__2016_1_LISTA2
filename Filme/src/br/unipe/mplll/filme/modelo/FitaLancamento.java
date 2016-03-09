package br.unipe.mplll.filme.modelo;

public class FitaLancamento extends Fita{

		
	public FitaLancamento(String titulo, double precoDeLocacao, categoria genero, Autor autor1) {
		super(titulo, precoDeLocacao, genero, autor1);

	}

	public FitaLancamento() {
	
	}

	public double locacao ( float precoFita) {
			return (Fita.precoDeLocacao = precoDeLocacao - precoDeLocacao * 0.2);
			
		}

	@Override
	public String toString() {
		return "FitaLancamento [titulo=" + titulo + ", precoDeLocacao=" + precoDeLocacao + ", genero=" + genero
				+ ", autor1=" + autor1 + "]";
	}

		
		
	
}
