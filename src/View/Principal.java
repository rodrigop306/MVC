package View;
import java.util.Scanner;
import Controller.PessoaController;
public class Principal {

	public static void main(String[] args) throws Exception {
		
		PessoaController p = new PessoaController();
		int opc=0;
		Scanner ler = new Scanner(System.in);
		while(opc!=4) {
			System.out.println("*----- Menu Principal -----*");
			System.out.println("1 - Adicionar cadastro \n"
					+ "2 - Remover cadastro \n"
					+ "3 - Visualizar cadastros \n"
					+ "4 - Sair");
			opc = ler.nextInt();
			switch(opc) {
			case 1:
				p.cadastroPessoaController();
				break;
				
			case 2:
				p.excluiPessoaController();
				break;
			case 3:
				p.visualizaPessoaController();
				break;
			case 4:
				System.exit(0);
			break;
			}		
		}
	}
}