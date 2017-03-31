package model;

public class Socio {

	private String nome, localidade, contacto;

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
	
	public String toString(){
		return "\n Nome: " + getNome()
				+ "\n Localidade: " + getLocalidade()
				+ "\n Contacto: " + getContacto();
	}
}
