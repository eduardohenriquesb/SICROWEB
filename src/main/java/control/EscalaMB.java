package control;
import java.util.*;

import model.Escala;
import model. Esc_Bol_Set;

public class EscalaMB {
	
	private Escala escala;
	private List<Escala> escalas;
	private List<Esc_Bol_Set> objetos;
	
	public EscalaMB(){
		escala = new Escala();
		escalas = new ArrayList<Escala>();
		setObjetos(new ArrayList<Esc_Bol_Set>());
		
	}
	
	public Escala getEscala() {
		return escala;
	}
	
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	public List<Escala> getEscalas() {
		return escalas;
	}
	
	public void setEscalas(ArrayList<Escala> escalas) {
		this.escalas = escalas;
	}
	
	public void gerarEscala(){
		
	}

	public List<Esc_Bol_Set> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<Esc_Bol_Set> objetos) {
		this.objetos = objetos;
	}
	

}
