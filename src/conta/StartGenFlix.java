package conta;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;

public class StartGenFlix {

	static Scanner leia = new Scanner(System.in);

	private static ContaController contaController = new ContaController();

	public static void main(String[] args) {
		// remover apos muda todos os metodos de conta para controle
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
			case 1 -> criarConta();
			case 2 -> login();
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
		if (contas.isEmpty()) {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("         NÃO HÁ CONTAS CADASTRADAS...        ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		}
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("                 ATUALIZAR                   ");
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
						System.out.printf("Usuário atual: %s\nSenha atual: %s\n", c.getUsuario(), c.getSenha());
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						System.out.println("Novo usuário: ");
						leia.skip("\\R?");
						usuario = leia.nextLine();
						
						System.out.println("Nova senha: ");
						senha = leia.nextLine();
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						System.out.printf("Usuário atualizado: %s\nSenha atualizada: %s\n", usuario, senha);
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						do {
							System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
							System.out.printf("\n   Confirma os dados? [1- Sim | 2- Não]   \n");
							System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
							resp = leia.nextInt();
						} while (resp != 1 && resp != 2);
					} while (resp != 1);
					c.setUsuario(usuario);
					c.setSenha(senha);
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					System.out.println("             Usuário e senha mudados com sucesso!                   ");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					break;
				} else {
					do {
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						System.out.println("   Usuário ou senha inválido. Tentar Novamente? [1- Sim | 2- Não]   ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						continuar = leia.nextInt();
						if (continuar == 2)
							return;
					} while (continuar != 1 && continuar != 2);
			 
				}
				
			}
			
		}while(continuar == 1);

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

	private static void login() {
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("             LOGIN               ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

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
				if (continuar == 2) {					
					acesso = true;
				}

			}

		} while (!acesso);

	}

	private static void criarConta() {
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("          CRIAR CONTA            ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

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
		contaController.criarConta(conta);
	}

}
