package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import Conexao.Conexao;
import java.util.ArrayList;

public class PessoaDAO {
	Conexao conn;
	public PessoaDAO(Conexao conn) {
		this.conn = conn;
	}
	
	public void cadastrarPessoa(Pessoa p){
		
	}
	
	public Pessoa excluirPessoa(Pessoa p){
		return p;
	}
	
	public List<Pessoa> buscarPessoas(){
		return null;
		
	}

}
