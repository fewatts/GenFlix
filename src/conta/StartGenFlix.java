package conta;


import java.util.ArrayList;
import java.util.Scanner;
import conta.model.Conta;

public class StartGenFlix {

	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                     BEM-VINDE À GENFLIX                           ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                   1- Fazer login                                  ");
			System.out.println("                   2- Criar uma conta                              ");
			System.out.println("                   3- Encerrar                                     ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("Digite sua opção:                                                  ");
			System.out.println("                                                                   ");
			opcao = leia.nextInt();
			switch (opcao) {
			case 1 -> {
				System.out.println("Fazer login\n\n");

			}
			case 2 -> {
				Conta conta = criarConta();
				boolean verificar = false;

				for (Conta c : contas) {
					if (c.getUsuario().equals(conta.getUsuario())) {
						verificar = true;
						System.out.println("Usuario ja cadastrado tente novamente!!");
						break;
					}
				}

				if (!verificar) {
					contas.add(conta);
					menuUsuario(conta);
				}

			}
			case 3 -> {
				System.out.println("Sistema encerrado com sucesso!");
				System.out.println("Volte sempre!\n\n");
				
			}
			default -> System.out.println("Opção inválida, tente novamente...\n");
			}

		} while (opcao != 3);

	}

	private static Conta criarConta() {
		Scanner leia = new Scanner(System.in);
		String usuario, senha;

		System.out.println("Digite o nome de usuario: ");
		leia.skip("\\R?");
		usuario = leia.nextLine();

		System.out.println("Digite a sua senha ");
		leia.skip("\\R?");
		senha = leia.nextLine();

		Conta conta = new Conta(usuario, senha);
		
        leia.close();
		return conta;
		
	}

	private static void menuUsuario(Conta conta) {
		int opcao = 0;
		do {
			System.out.println("Bem vinde " + conta.getUsuario());
			opcao = 5;
		} while (opcao != 5);
	}

}
