package Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Pessoa;
import Model.PessoaDAO;
import View.Cadastro;
import View.Exclusao;
import View.Visualizacao;

//
//http://programadorprofissional.blogspot.com.es/2012/09/crud-no-banco-de-dados-com-java-e-jdbc.html
public class PessoaController {
	Scanner ler = new Scanner(System.in);
	public PessoaController() {
		super();
	}
	public void cadastroPessoaController() throws Exception{
		Cadastro c = new Cadastro();
		Pessoa p = c.TelaCadastro();
		System.out.println(p.getNome() +" || "+ p.getCpf()+" || "+ p.getIdade());
		PessoaDAO pd = new PessoaDAO();
		pd.cadastrarPessoa(p);
	}
	
	public void excluiPessoaController() throws Exception{
		 Exclusao e = new Exclusao();
		 int id = e.Excluir();
		 PessoaDAO pd = new PessoaDAO();
		 pd.excluirPessoa(id);
		 
	}
	
	public void visualizaPessoaController() throws Exception{
		PessoaDAO pd = new PessoaDAO();
		//List<Pessoa>pl = pd.buscarPessoas();
		Visualizacao v = new Visualizacao();
		//v.dados(pl);
		v.dados(pd.buscarPessoas());
	}
}