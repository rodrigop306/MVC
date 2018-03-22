package View;
import java.util.Scanner;

import Conexao.Conexao;
public class Principal {

	public static void main(String[] args) throws Exception {
		Conexao conn = new Conexao();
		conn.abrir();
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
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.exit(0);
			break;
			}		
		}
	}
}