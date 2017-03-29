package model;

import java.util.ArrayList;

public class Socio {

	private String nome, localidade, contacto;
	private ArrayList<Rendimento> rend;

	public Socio(String nome, String localidade, String contacto) {
		this.nome = nome;
		this.localidade = localidade;
		this.contacto = contacto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	public ArrayList<Rendimento> getRend() {
		return rend;
	}

	public void setRend(ArrayList<Rendimento> rend) {
		this.rend = rend;
	}

	public String toString(){
		return "\n Nome: " + getNome()
				+ "\n Localidade: " + getLocalidade()
				+ "\n Contacto: " + getContacto();
	}
}
