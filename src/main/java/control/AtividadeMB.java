package control;

import java.util.ArrayList;

import model.Bolsista;

public class AtividadeMB {
	
	private BolsistaMB bolsista;
	private ArrayList<Bolsista> atividadesManha1;
	private ArrayList<Bolsista> atividadesManha2;
	private ArrayList<Bolsista> atividadesManha3;
	private ArrayList<Bolsista> atividadesManha4;
	
	private ArrayList<Bolsista> atividadesManha11;
	private ArrayList<Bolsista> atividadesManha12;
	private ArrayList<Bolsista> atividadesManha13;
	private ArrayList<Bolsista> atividadesManha14;
	
	private ArrayList<Bolsista> atividadesManha21;
	private ArrayList<Bolsista> atividadesManha22;
	private ArrayList<Bolsista> atividadesManha23;
	private ArrayList<Bolsista> atividadesManha24;
	
	private ArrayList<Bolsista> atividadesManha31;	
	private ArrayList<Bolsista> atividadesManha32;
	private ArrayList<Bolsista> atividadesManha33;
	private ArrayList<Bolsista> atividadesManha34;
	
	public AtividadeMB(){
		
		bolsista = new BolsistaMB();
		atividadesManha1 = new ArrayList<Bolsista>();
		atividadesManha2 = new ArrayList<Bolsista>();
		atividadesManha3 = new ArrayList<Bolsista>();
		atividadesManha4 = new ArrayList<Bolsista>();
		
		atividadesManha11 = new ArrayList<Bolsista>();
		atividadesManha12 = new ArrayList<Bolsista>();
		atividadesManha13 = new ArrayList<Bolsista>();
		atividadesManha14 = new ArrayList<Bolsista>();
		
		atividadesManha21 = new ArrayList<Bolsista>();
		atividadesManha22 = new ArrayList<Bolsista>();
		atividadesManha23 = new ArrayList<Bolsista>();
		atividadesManha24 = new ArrayList<Bolsista>();
		
		atividadesManha31 = new ArrayList<Bolsista>();
		atividadesManha32 = new ArrayList<Bolsista>();
		atividadesManha33 = new ArrayList<Bolsista>();
		atividadesManha34 = new ArrayList<Bolsista>();
		
		
		atividadesManha1 = bolsista.getBolsistasManha();
		gerarAtividades(atividadesManha1,atividadesManha2,atividadesManha3,atividadesManha4);
		atividadesManha11 = atividadesManha2;
		gerarAtividades(atividadesManha11,atividadesManha12,atividadesManha13,atividadesManha14);
		atividadesManha21 = atividadesManha12;
		gerarAtividades(atividadesManha21,atividadesManha22,atividadesManha23,atividadesManha24);
		atividadesManha31 = atividadesManha22;
		gerarAtividades(atividadesManha31,atividadesManha32,atividadesManha33,atividadesManha34);
	}
		
	
	public String gerar(){
		return "gerarEscala";
	}
	
	
	public void gerarAtividades(ArrayList<Bolsista> atividades1,ArrayList<Bolsista> atividades2,ArrayList<Bolsista> atividades3,ArrayList<Bolsista> atividades4){
		//atividades1 = bolsista.getBolsistasManha();
		for(int i=1;i<atividades1.size();i++){
			atividades2.add(atividades1.get(i));
		}
		atividades2.add(atividades1.get(0));
		
		atividades3.add(atividades2.get(1));
		atividades3.add(atividades2.get(2));
		atividades3.add(atividades2.get(0));
		atividades3.add(atividades2.get(3));
		
		atividades4.add(atividades3.get(1));
		atividades4.add(atividades3.get(2));
		atividades4.add(atividades3.get(0));
		atividades4.add(atividades3.get(3));
	}

	public ArrayList<Bolsista> getAtividadesManha1() {
		return atividadesManha1;
	}

	public void setAtividadesManha1(ArrayList<Bolsista> atividadesManha1) {
		this.atividadesManha1 = atividadesManha1;
	}

	public ArrayList<Bolsista> getAtividadesManha2() {
		return atividadesManha2;
	}

	public void setAtividadesManha2(ArrayList<Bolsista> atividadesManha2) {
		this.atividadesManha2 = atividadesManha2;
	}

	public ArrayList<Bolsista> getAtividadesManha3() {
		return atividadesManha3;
	}

	public void setAtividadesManha3(ArrayList<Bolsista> atividadesManha3) {
		this.atividadesManha3 = atividadesManha3;
	}

	public ArrayList<Bolsista> getAtividadesManha4() {
		return atividadesManha4;
	}

	public void setAtividadesManha4(ArrayList<Bolsista> atividadesManha4) {
		this.atividadesManha4 = atividadesManha4;
	}
	
	public ArrayList<Bolsista> getAtividadesManha11() {
		return atividadesManha11;
	}
	
	public ArrayList<Bolsista> getAtividadesManha12() {
		return atividadesManha12;
	}
	
	public ArrayList<Bolsista> getAtividadesManha13() {
		return atividadesManha13;
	}
	
	public ArrayList<Bolsista> getAtividadesManha14() {
		return atividadesManha14;
	}
	
	public ArrayList<Bolsista> getAtividadesManha21() {
		return atividadesManha21;
	}
	
	public ArrayList<Bolsista> getAtividadesManha22() {
		return atividadesManha22;
	}
	
	public ArrayList<Bolsista> getAtividadesManha23() {
		return atividadesManha23;
	}
	public ArrayList<Bolsista> getAtividadesManha24() {
		return atividadesManha24;
	}
	
	public ArrayList<Bolsista> getAtividadesManha31() {
		return atividadesManha31;
	}
	
	public ArrayList<Bolsista> getAtividadesManha32() {
		return atividadesManha32;
	}
	
	public ArrayList<Bolsista> getAtividadesManha33() {
		return atividadesManha33;
	}
	
	public ArrayList<Bolsista> getAtividadesManha34() {
		return atividadesManha34;
	}
	
	
}
