package br.unipe.mplll.filme.modelo;

public class Autor {
	protected String autorFilme;
	
	public Autor(){
		
	}

	public Autor(String autorFilme) {
		super();
		this.autorFilme = autorFilme;
	}

	public String getAutorFilme() {
		return autorFilme;}

	public void setAutorFilme(String autorFilme) {
		this.autorFilme = autorFilme;
	}

	@Override
	public String toString() {
		return "Autor [autorFilme=" + autorFilme + "]";
	}
	
	
	
	
	
	

}
