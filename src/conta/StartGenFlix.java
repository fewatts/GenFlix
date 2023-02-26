package conta;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;

public class StartGenFlix {
	private static ContaController contaController = new ContaController();
	private static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();

		int opcao;
		do {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                     BEM-VINDE À GENFLIX                           ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                   1- Criar uma conta                              ");
			System.out.println("                   2- Fazer login                                  ");
			System.out.println("                   3- Editar conta                                 ");
			System.out.println("                   4- Deletar conta                                ");
			System.out.println("                   5- Encerrar                                     ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("Digite uma opção:                                                  ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Apenas números inteiroa!");
				leia.nextLine();
				opcao = 0;
			}
			switch (opcao) {
			case 1 -> {
				Conta conta = criarConta();
				contaController.criarConta(conta);
			}
			case 2 -> login(contas);
			case 3 -> atualizarConta(contas);
			case 4 -> apagarConta(contas);
			case 5 -> {
				System.out.println("Sistema encerrado com sucesso!");
				System.out.println("Volte sempre!\n\n");
			}
			default -> System.out.println("Opção inválida, tente novamente!\n");
			}

		} while (opcao != 5);

	}

	private static void atualizarConta(ArrayList<Conta> contas) {
		String usuario, senha;
		int resposta, continuar = 0;
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("               ATUALIZAR CONTAS              ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

		if (contas.isEmpty()) {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("         NÃO HÁ CONTAS CADASTRADAS...        ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			return;
		}
		do {
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			senha = leia.nextLine();
			// contaController.
			for (Conta c : contas) {
				if (c.getUsuario().equalsIgnoreCase(usuario) && c.getSenha().equalsIgnoreCase(senha)) {
					do {
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						System.out.printf("\nUsuário: %s\nSenha: %s\n", c.getUsuario(), c.getSenha());
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.skip("\\R?");
						usuario = leia.nextLine();
						System.out.println("Nova senha: ");
						senha = leia.nextLine();
						System.out.println("Novo usuário: " + usuario + "\nNova senha: " + senha);
						do {
							System.out.println("Você confirma essa alteração? [1 - Sim | 2 - Não]");
							resposta = leia.nextInt();
							if (resposta == 2)
								return;
						} while (resposta != 1 && resposta != 2);

					} while (resposta != 1);
					c.setUsuario(usuario);
					c.setSenha(senha);
				} else {
					do {
						System.out.println("Usuário inválido! Deseja tentar novamente? [1 - Sim | 2 - Não]");
						continuar = leia.nextInt();
					} while (continuar != 1 && continuar != 2);
				}

			}

		} while (continuar == 1);

	}

	private static void apagarConta(ArrayList<Conta> contas) {
		if (contas.isEmpty()) {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("         NÃO HÁ CONTAS CADASTRADAS...        ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			return;
		}
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("                   APAGAR                    ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		String usuario, senha;
		int resp;
		int continuar = 0;
		do {
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			senha = leia.nextLine();

			for (Conta c : contas) {
				if (c.getUsuario().equalsIgnoreCase(usuario) && c.getSenha().equalsIgnoreCase(senha)) {
					do {
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						System.out.printf("\nUsuário: %s\nSenha: %s\n", c.getUsuario(), c.getSenha());
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						do {
							System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
							System.out.printf("\nDeseja apagar a conta? [1- Sim | 2- Não]\n");
							System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
							resp = leia.nextInt();
							if (resp == 2)
								return;
						} while (resp != 1 && resp != 2);
					} while (resp != 1);
					contas.remove(c);
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					System.out.println("                    Conta apagada com sucesso!                      ");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					break;
				} else {
					do {
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						System.out.println("   Usuário ou senha inválido. Tentar Novamente? [1- Sim | 2- Não]   ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						continuar = leia.nextInt();
					} while (continuar != 1 && continuar != 2);

				}

			}

		} while (continuar == 1);
	}

	private static void login(ArrayList<Conta> contas) {
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("             LOGIN               ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

		Scanner leia = new Scanner(System.in);
		String usuario, senha;
		boolean acesso = false;

		do {
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			leia.skip("\\R?");
			senha = leia.nextLine();

			acesso = contaController.login(usuario, senha);

			if (!acesso) {
				int continuar;
				do {
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					System.out.println("   Usuário ou senha inválido. Tentar Novamente? (1 - Sim | 2 - Não) ");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					continuar = leia.nextInt();
				} while (continuar != 1 && continuar != 2);
				if (continuar == 2)
					acesso = true;
			}

		} while (!acesso);

	}

	private static Conta criarConta() {
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("          CRIAR CONTA            ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

		Scanner leia = new Scanner(System.in);
		String usuario, senha;
		int resp = 0;
		Conta conta = null;

		do {
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			leia.skip("\\R?");
			senha = leia.nextLine();

			do {
				System.out.printf("\nConfirma os dados? [1- Sim | 2- Não]\n");
				resp = leia.nextInt();
			} while (resp != 1 && resp != 2);
			if (resp == 1) {
				conta = new Conta(usuario, senha);
				System.out.printf("Conta %s criada com sucesso!\n\n", usuario);
			} else {
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				System.out.println("  Digite os dados novamente:     ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			}
		} while (resp != 1);
		return conta;
	}

}
