package Controller;
import java.util.Scanner;
import java.sql.Connection;

import Conexao.Conexao;
import Model.Pessoa;
import Model.PessoaDAO;
import View.Cadastro;

//
//http://programadorprofissional.blogspot.com.es/2012/09/crud-no-banco-de-dados-com-java-e-jdbc.html
public class PessoaController {
	Conexao conn;
	Scanner ler = new Scanner(System.in);
	public PessoaController() {
		super();
	}
	public void cadastroPessoaController() throws Exception{
		Cadastro c = new Cadastro();
		Pessoa p = c.TelaCadastro();
		System.out.println(p.getNome() +""+ p.getCpf()+""+ p.getIdade());
		//Connection cp = conn.abrir();
		PessoaDAO pd = new PessoaDAO();
		pd.cadastrarPessoa(p);
	}
	
	public void excluiPessoaController() throws Exception{
		
	}
	
	public void visualizaPessoaController() throws Exception{
	}
}