package model;

import java.util.Date;

public class Receita {

	private Socio socio;
	private double preco;
	private int tipo;
	private Date mes;

	public static final int DONATIVO=0;
	public static final int QUOTA=1;
	public static final int BILHETEIRA=2;
	
	public Receita(Socio socio, double preco, int tipo, Date mes) {
		this.socio = socio;
		this.preco = preco;
		this.tipo = tipo;
		this.mes = mes;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Date getMes() {
		return mes;
	}

	public void setMes(Date mes) {
		this.mes = mes;
	}
	 
}
