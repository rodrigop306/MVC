package View;
import java.util.Scanner;
import Model.Pessoa;

public class Cadastro {
	public Pessoa TelaCadastro() {
		Scanner ler = new Scanner(System.in);
		Pessoa p = new Pessoa();
		System.out.println("Nome: ");
		p.setNome(ler.nextLine());
		System.out.println("Idade: ");
		p.setIdade(ler.nextInt());
		System.out.println("CPF: ");
		p.setCpf(ler.nextInt());
		return p;
	}
}
