package View;
import java.util.Scanner;
public class Exclusao {
	public int Excluir(){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o ID da pessoa a ser excluída: ");
		int id = ler.nextInt();
		return id;
	}
}
