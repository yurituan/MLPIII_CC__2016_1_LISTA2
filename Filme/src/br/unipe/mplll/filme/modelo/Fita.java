package br.unipe.mplll.filme.modelo;

public class Fita {
	
	protected String titulo;
	protected static double precoDeLocacao;
	protected categoria genero;
	protected Autor autor1;
	
	public Fita(){
		
	}
	
	
	public Fita(String titulo, double precoDeLocacao, categoria genero, Autor autor1) {
		super();
		this.titulo = titulo;
		this.precoDeLocacao = precoDeLocacao;
		this.genero = genero;
		this.autor1 = autor1;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getPrecoDeLocacao() {
		return precoDeLocacao;
	}


	public void setPrecoDeLocacao(double precoDeLocacao) {
		this.precoDeLocacao = precoDeLocacao;
	}


	public categoria getGenero() {
		return genero;
	}


	public void setGenero(categoria genero) {
		this.genero = genero;
	}


	public Autor getAutor1() {
		return autor1;
	}


	public void setAutor1(Autor autor1) {
		autor1 = autor1;
	}
}
	
	
	
	
	