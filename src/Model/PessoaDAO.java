package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import Conexao.Conexao;
import java.util.ArrayList;

public class PessoaDAO {
	Conexao conn;
	public PessoaDAO() {
		super();
	}
	
	public void cadastrarPessoa(Pessoa p) throws Exception{
		conn = new Conexao();
		conn.abrir();
		conn.fechar();
	}
	
	public Pessoa excluirPessoa(Pessoa p) throws Exception{
		conn = new Conexao();
		conn.abrir();
		conn.fechar();
		return p;
	}
	
	public List<Pessoa> buscarPessoas() throws Exception{
		conn = new Conexao();
		conn.abrir();
		conn.fechar();
		return null;
		
	}

}