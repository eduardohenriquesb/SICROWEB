package control;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dao.BolsistaDAO;
import model.Bolsista;


public class BolsistaMB {
	
	private Bolsista bolsista;
	private List<Bolsista> bolsistas;
	private BolsistaDAO bolsistaDAO;
	private ArrayList<Bolsista> bolsistasManha;
	private ArrayList<Bolsista> bolsistasTarde;
	private ArrayList<Bolsista> bolsistasNoite;
	
	public BolsistaMB(){
		bolsista = new Bolsista();
		bolsistas = new ArrayList<Bolsista>();
		bolsistaDAO = new BolsistaDAO();
		bolsistasManha = new ArrayList<Bolsista>();
		bolsistasTarde = new ArrayList<Bolsista>();
		bolsistasNoite = new ArrayList<Bolsista>();
		bolsistas = bolsistaDAO.getLista();
		separarTurno();
		
	}
	
	public Bolsista getBolsista() {
		return bolsista;
	}
	
	public void setBolsista(Bolsista bolsista) {
		this.bolsista = bolsista;
	}
	
	public List<Bolsista> getBolsistas() {
		return bolsistas;
	}
	
	public void setBolsistas(ArrayList<Bolsista> bolsistas) {
		this.bolsistas = bolsistas;
	}
		
	public String salvar(){	
		bolsistaDAO.adicionar(bolsista);
		return "salvar";
	}
	
	public String voltar(){
		return "voltar";
	}
	
	public String voltarExibir(){
		bolsistas = bolsistaDAO.getLista();
		return "voltar";
	}
	
	public String cadastrar(){
		return "cadastrarBolsista";
	}
	
	public String pesquisar(){
		bolsistas = bolsistaDAO.getLista(bolsista);
		return "pesquisarBolsista";
	}
	
	public String exibir(){
		bolsistas = bolsistaDAO.getLista();
		return "exibirBolsistas";
	}
		
	public String alterar(){
		return "alterarBolsista";
	}
	
	public  String alterar2(){
		
		for (Bolsista b: bolsistas)
	    {
			bolsista = b;
			bolsistaDAO.atualizar(bolsista);					
		}	
		return "alterar2";
	}
	
	public  String remover(){
		for (Bolsista b: bolsistas)
	    {
			bolsista = b;
			bolsistaDAO.remover(bolsista);	
					
		}
		return "remover";
	}

	public BolsistaDAO getBolsistaDAO() {
		return bolsistaDAO;
	}

	public void setBolsistaDAO(BolsistaDAO bolsistaDAO) {
		this.bolsistaDAO = bolsistaDAO;
	}

	public ArrayList<Bolsista> getBolsistasManha() {
		return bolsistasManha;
	}

	public void setBolsistasManha(ArrayList<Bolsista> bolsistasManha) {
		this.bolsistasManha = bolsistasManha;
	}
	
	public  void separarTurno(){
		for (Bolsista b: bolsistas){

			String turnoBolsista = b.getTurno();
			
			if(turnoBolsista.equals("Matutino") )
			{
					bolsistasManha.add(b);					
			}
			else if(turnoBolsista.equals("Vespertino"))
			{
				bolsistasTarde.add(b);
			}
			else {
				bolsistasNoite.add(b);
			}
			
		}	
		
		bolsistasManha = sorteioBolsista(bolsistasManha);
	}
	
	public ArrayList<Bolsista> sorteioBolsista(ArrayList<Bolsista> bolsistasTurno){
		
		Random r = new Random();
		int f = bolsistasTurno.size();
		int posicao = r.nextInt(f);
		
		ArrayList<Integer> posicaoSorteadas = new ArrayList<Integer>();
		posicaoSorteadas.add(posicao);
		ArrayList<Bolsista> bT = new ArrayList<Bolsista>();
		for(int i = 1; i<bolsistasTurno.size();i++){
			while(posicaoSorteadas.contains(posicao)){
				
				 posicao = r.nextInt(f);
				
			}
			posicaoSorteadas.add(posicao);
		}

		for(int i = 0; i<bolsistasTurno.size();i++){
			bT.add(bolsistasTurno.get(posicaoSorteadas.get(i)));
		}
		return bT;
		
	}
}