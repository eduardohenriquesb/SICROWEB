package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Setor;

public class SetorDAO extends AbstractDAO<Setor> {
	
	private List<Setor> lista = new ArrayList<Setor>();
	
	public SetorDAO(){
		super();
		lista = new ArrayList<Setor>();
	}

	@Override
	public List<Setor> getLista(Setor setor) {
		try {
			PreparedStatement ptmt = conn.prepareStatement("select * from setor where idSetor = ?");
			ptmt.setInt(1, + setor.getCodigo());
			ResultSet rs = ptmt.executeQuery();
			lista.clear();
			while (rs.next()) {
				setor = new Setor();
				setor.setCodigo(rs.getInt(1));
				setor.setNome(rs.getString(2));
				lista.add(setor);
			}
			rs.close();
			ptmt.close();
		} catch (SQLException e) {
		throw new RuntimeException(e);
	}
		return lista;
	}

	
	public List<Setor> getLista() {
		try {
			PreparedStatement ptmt = conn.prepareStatement("select * from setor");
			ResultSet rs = ptmt.executeQuery();
			lista.clear();
			while (rs.next()){
				Setor setor = new Setor();
				setor.setCodigo(rs.getInt(1));
				setor.setNome(rs.getString(2));
				lista.add(setor);
			}
			rs.close();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
			return lista;
	}

	
	public void adicionar(Setor setor) {
		try {
			PreparedStatement ptmt = conn.prepareStatement("insert into setor(nome) values (?)");
			ptmt.setString(1, setor.getNome());		
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		lista.add(setor);
		
	}
	
	
	public void remover (Setor setor){
		try {
			PreparedStatement ptmt = conn.prepareStatement("delete from setor where idSetor = ?");
			ptmt.setInt(1, setor.getCodigo());					
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void atualizar(Setor setor){
		try {
			PreparedStatement ptmt = conn.prepareStatement("UPDATE setor set nome = ? where idSetor = ?");								
			
			ptmt.setString(1, setor.getNome());
			ptmt.setInt(2, setor.getCodigo());		
						
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);			
		}
	}
	
	public void setLista(List<Setor> lista) 
	{
		this.lista = lista;
	}
	

}

