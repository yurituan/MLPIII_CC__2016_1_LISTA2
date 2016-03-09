package br.unipe.mpllll.google.modelo;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	public Data(){
		
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
		if (dia > 31 || dia < 1){
			System.out.println("Data invalida");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
		if (mes > 12 || mes < 1){
			System.out.println("Data invalida");
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
		if (ano < 0){
			System.out.println("Data invalida");
		}
	}   
	

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	
	

}
