package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import Conexao.Conexao;
import java.util.ArrayList;

public class PessoaDAO {
	Connection conn;
	public PessoaDAO() {
		super();
	}
	
	public void cadastrarPessoa(Pessoa pe) throws Exception{
		Conexao c = new Conexao();
		conn = c.abrir();
		PreparedStatement p =
				   conn.prepareStatement("insert into pessoa (nomePessoa, cpfPessoa, idadePessoa) values (?,?,?)");
				   p.setString(1, pe.getNome());
				   p.setInt(2, pe.getCpf());
				   p.setInt(3, pe.getIdade());
				   p.executeUpdate();
				   p.close();
	}
	
	public void excluirPessoa(int id) throws Exception{
		Conexao c = new Conexao();
		conn = c.abrir();
		try{
			PreparedStatement p = conn.prepareStatement("delete from pessoa where idPessoa = ?");
			p.setInt(1, id);
			p.executeUpdate();
			p.close();
		}catch(Exception ex){
			System.out.println("ERRO: Pessoa inválida");
		}
	}
	
	public List<Pessoa> buscarPessoas() throws Exception{
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Conexao c = new Conexao();
		conn = c.abrir();
		PreparedStatement p = conn.prepareStatement("select * from pessoa");
		ResultSet rs = p.executeQuery();
		while(rs.next()){
			Pessoa pe = new Pessoa();
			pe.setId(rs.getInt("idPessoa"));
			pe.setNome(rs.getString("nomePessoa"));
			pe.setCpf(rs.getInt("cpfPessoa"));
			pe.setIdade(rs.getInt("idadePessoa"));
			pessoas.add(pe);
		}
		rs.close();
		p.close();
		return pessoas;		
	}

}