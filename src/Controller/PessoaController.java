package Controller;
import java.util.Scanner;
import Conexao.Conexao;
import Model.Pessoa;
import Model.PessoaDAO;
import View.Cadastro;

public class PessoaController {
	Conexao conn;
	Scanner ler = new Scanner(System.in);
	public PessoaController() {
		super();
	}
	public void cadastroPessoaController() throws Exception{
		Cadastro c = new Cadastro();
		Pessoa p = c.TelaCadastro();
		PessoaDAO pd = new PessoaDAO();
		pd.cadastrarPessoa(p);
	}
	
	public void excluiPessoaController() throws Exception{
		
	}
	
	public void visualizaPessoaController() throws Exception{
	}
}