package View;

import java.util.List;
import Model.Pessoa;

public class Visualizacao {
	public void dados(List<Pessoa> pessoas) throws Exception{
		for(Pessoa pessoa : pessoas){
			System.out.println(pessoa.getId() +" || "+ pessoa.getNome() + " || "+pessoa.getCpf()+ " || "+pessoa.getIdade());
			
		}
	}
}
