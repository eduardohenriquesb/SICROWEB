package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Esc_Bol_Set;
import model.Escala;
import model.Bolsista;
import model.Setor;



public class Esc_Bol_SetMB {
	private Esc_Bol_Set objeto;
	private List<Esc_Bol_Set> objetos;
	private List<Bolsista> bolsistas;
	private List<Bolsista> bolsistasManha;
	private List<Setor> setores;
	private List<Escala> escalas;

	public Esc_Bol_SetMB(){
		objeto = new Esc_Bol_Set();
		objetos = new ArrayList<Esc_Bol_Set>();

	}

	public Esc_Bol_Set getObjeto() {
		return objeto;
	}

	public void setObjeto(Esc_Bol_Set objeto) {
		this.objeto = objeto;
	}

	public List<Esc_Bol_Set> getObjetos() {
		return objetos;
	}

	public void setObjetos(ArrayList<Esc_Bol_Set> objetos) {
		this.objetos = objetos;
	}

	public void separarTurno(){
		for (Bolsista b: bolsistas){
			
			String turnoBolsista = b.getTurno();

			if(turnoBolsista == "Matutino")
			{
				bolsistasManha.add(b);
			}
			
			else if (turnoBolsista == "Vespertino")
			{
				
			}
			
			else{
				
				
			}
		}
	}


	public void gerarAtividadeManha(){
		
		if (escalas.size() == 0 ){

			Random r = new Random();
			int f = bolsistasManha.size();
	
			int sorteio = r.nextInt(f);
		
		}
		
		

	}

	public List<Setor> getSetores() {
		return setores;
	}

	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}

	public List<Escala> getEscalas() {
		return escalas;
	}

	public void setEscalas(List<Escala> escalas) {
		this.escalas = escalas;
	}


}
