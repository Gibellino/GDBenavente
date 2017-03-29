package model;

public class Rendimento {

	private float preco;
	private int tipo;
	private int mes;

	public Rendimento(float preco, int tipo, int mes) {
		this.preco = preco;
		this.tipo = tipo;
		this.mes = mes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	} 
	
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String toString(){
		String type = "";
		
		switch(getTipo()){
		
		case 0: type = "Donativo"; break;
		case 1: type = "Bilheteira"; break;
		case 2: type = "Quota"; break;
		
		}
		
		return " " + type + " - " + getPreco() + ";\n";
	}
	
	
}
