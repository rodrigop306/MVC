package Controller;

import Conexao.Conexao;

public class PessoaController {
	Conexao conn;
	
	public PessoaController() {
		super();
	}
	public void cadastroPessoaController() throws Exception{
		conn = new Conexao();
		conn.abrir();
		conn.fechar();
	}
	
	public void excluiPessoaController() throws Exception{
		conn = new Conexao();
		conn.abrir();
		conn.fechar();
	}
	
	public void visualizaPessoaController() throws Exception{
		conn = new Conexao();
		conn.abrir();
		conn.fechar();
	}
}
