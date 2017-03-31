package controller;

import java.util.ArrayList;
import java.util.function.Consumer;

import model.Receita;
import model.Socio;

public class GestaoClube {

	ArrayList<Receita> lR;
	
	public GestaoClube(ArrayList<Receita> arReceitas) {
		this.lR = arReceitas;
	}

	public GestaoClube(){
		this.lR = new ArrayList<>();
	}

	public ArrayList<Receita> getArReceitas() {
		return lR;
	}

	public void setArReceitas(ArrayList<Receita> arReceitas) {
		this.lR = arReceitas;
	}
	
	public Socio topS(){
		
		Socio s = lR.get(0).getSocio();
		double qt = lR.get(0).getPreco();
		
		for(Receita rc : this.lR){
			if(qt > rc.getPreco()){
				qt = rc.getPreco();
				s = rc.getSocio();
			}
		}
		
		return s;
		
	}
	
}
