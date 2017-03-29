package controller;

import database.MockupData;
import model.Rendimento;
import model.Socio;

public class GestaoClube {

	MockupData db = new MockupData();
	
	public void addSocio(String nome, String local, String tlm){
		
		db.socio.add(new Socio(nome,local,tlm));
		
	}
	
	public void print(){
		
		int i=0;
		
		for(Socio o : db.socio){
			System.out.println(o.toString());
			if(o.getRend().get(i).getTipo() != 1){
				System.out.println(" " + o.getRend().get(i).toString());
			}
			i++;
		}
	}
	
	public void addDonativo(int id, int tipo,float preco, int mes){
		
		Rendimento e = new Rendimento(preco, tipo, mes);
		
		db.socio.get(id).getRend().add(e);
	}
	
	public void DarMais(){
		
		int id=0;
		float preco=0;
		
		for(Socio o : db.socio){
			if(o.getRend().get(id).getPreco() > preco){
				
			}
		}
	}
	
}
