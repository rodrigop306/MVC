package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import Conexao.Conexao;
import java.util.ArrayList;
//
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
	
	public Pessoa excluirPessoa(Pessoa p) throws Exception{
		
		return p;
	}
	
	public List<Pessoa> buscarPessoas() throws Exception{
		return null;
		
	}

}