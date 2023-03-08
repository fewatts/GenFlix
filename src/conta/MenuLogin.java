package conta;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.util.Cores;

public class MenuLogin {

	static Scanner leia = new Scanner(System.in);

	private static ContaController contaController = new ContaController();

	public static void main(String[] args) {
		System.out.println(Cores.TEXT_BLUE_BOLD);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬    ¬¬    ¬  ¬¬¬ ¬    ¬¬ ¬¬¬¬¬ ¬ ¬¬¬ ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ¬¬¬¬¬ ¬¬¬¬ ¬ ¬¬ ¬ ¬¬¬¬¬ ¬¬¬¬¬ ¬¬ ¬ ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ¬¬ ¬¬    ¬ ¬¬ ¬ ¬    ¬¬ ¬¬¬¬¬ ¬¬¬ ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ¬¬¬ ¬ ¬¬¬¬ ¬¬¬  ¬ ¬¬¬¬¬ ¬¬¬¬¬ ¬¬ ¬¬ ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬     ¬    ¬ ¬¬¬¬ ¬ ¬¬¬¬¬     ¬ ¬ ¬¬¬¬ ¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println(Cores.TEXT_RESET);
		int opcao;

		do{
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println(Cores.TEXT_YELLOW_BOLD);
			System.out.println("                     BEM-VINDE À GENFLIX                           ");
			System.out.println(Cores.TEXT_RESET);
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                        1- Criar uma conta                         ");// ok
			System.out.println("                        2- Fazer login                             ");// ok
			System.out.println("                        3- Atualizar conta                         ");// ok
			System.out.println("                        4- Deletar conta                           ");// ok
			System.out.println("                        5- Encerrar                                ");// ok
			System.out.println("                                                                   ");
			System.out.println("                        Digite uma opção:                          ");    			
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

			try{
				opcao = leia.nextInt();
			}catch (InputMismatchException e){
				System.out.println("                    Digite apenas números inteiros!             ");
				leia.nextLine();
				opcao = 0;
			}
			switch (opcao) {
				case 1 -> criarConta();
				case 2 -> login();
				case 3 -> atualizarConta();
				case 4 -> apagarConta();
				case 5 -> {
					System.out.println("                    Sistema encerrado com sucesso!                 ");
					System.out.print(Cores.TEXT_YELLOW);
					System.out.println("                       Volte sempre à Genflix!\n\n                 ");
					System.out.print(Cores.TEXT_RESET);
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				}
				default -> System.out.println("                   Opção inválida, tente novamente!          ");
			}

		}while(opcao != 5);

	}

	private static void criarConta() {
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                         CRIAR CONTA                               ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

		String usuario, senha;
		int resp = 0;
		Conta conta = null;

		do{
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			leia.skip("\\R?");
			senha = leia.nextLine();

			do{
				try{
					System.out.printf("\n                Confirma os dados? [1- Sim | 2- Não]            \n");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					resp = leia.nextInt();
					if(resp != 1 && resp != 2)
						System.out.println("                   Opção inválida, tente novamente!            ");
				}catch(InputMismatchException e){
					System.out.println("                    Digite apenas números inteiros!                ");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					leia.nextLine();
					resp = 0;
				}
			}while(resp != 1 && resp != 2);
			if(resp == 1){
				conta = new Conta(usuario, senha);
				if(!contaController.existeConta(usuario, senha)){
					System.out.printf("\nConta %s criada com sucesso!\n", usuario);
					contaController.criarConta(conta);
				}else
					System.out.println("                Conta já cadastrada, tente novamente!          ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

			}else{
				System.out.println("                       Digite os dados novamente:                  ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			}

		}while(resp != 1);

	}

	private static void login() {
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                               LOGIN                               ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		String usuario, senha;
		boolean acesso = false;
		
		do{
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			leia.skip("\\R?");
			senha = leia.nextLine();

			acesso = contaController.login(usuario, senha);

			if(!acesso){
				int continuar;
				do{
					try{
						System.out.println("  Usuário ou senha inválido. Tentar Novamente? [1 - Sim | 2 - Não] ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						continuar = leia.nextInt();
						if(continuar != 1 && continuar != 2)
							System.out.println("                   Opção inválida, tente novamente!            ");
					}catch(InputMismatchException e){
						System.out.println("                    Digite apenas números inteiros!                ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.nextLine();
						continuar = 0;
					}
				}while(continuar != 1 && continuar != 2);
				if(continuar == 2)
					acesso = true;
			}

		} while (!acesso);

	}

	private static void atualizarConta() {
		if(contaController.existeConta()){
			System.out.println("                    Não há contas cadastradas.                     ");
			System.out.println("                                                                   ");
			return;
		}
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                          ATUALIZAR CONTA                          ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		String usuario, senha, newUsuario, newSenha;
		boolean existe = false;
		int continuar = 0, resp;
		
		do{
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			senha = leia.nextLine();		

			existe = contaController.existeConta(usuario, senha);

			if(existe){
				do{
					System.out.printf("Usuário atual: %s\nSenha atual: %s\n", usuario, senha);
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					System.out.println("Novo usuário: ");
					leia.skip("\\R?");
					newUsuario = leia.nextLine();

					System.out.println("Nova senha: ");
					newSenha = leia.nextLine();
					System.out.printf("Usuário atualizado: %s\nSenha atualizada: %s\n", newUsuario, newSenha);
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					do{
						try{
							System.out.printf("\n                  Confirma os dados? [1- Sim | 2- Não]          \n");
							System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
							resp = leia.nextInt();
							if(resp != 1 && resp != 2)
								System.out.println("                   Opção inválida, tente novamente!            ");
						}catch(InputMismatchException e){
							System.out.println("                    Digite apenas números inteiros!                ");
							System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
							leia.nextLine();
							resp = 0;
						}
					}while(resp != 1 && resp != 2);
				}while(resp != 1);
				contaController.atualizarConta(usuario, senha, newUsuario, newSenha);
				System.out.println("               Usuário e senha mudados com sucesso!                ");
				break;
			}else{
				do{
					try{
						System.out.println("   Usuário ou senha inválido. Tentar Novamente? [1- Sim | 2- Não]  ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						continuar = leia.nextInt();
						if(continuar != 1 && continuar != 2)
							System.out.println("                   Opção inválida, tente novamente!            ");
					}catch(InputMismatchException e){
						System.out.println("                    Digite apenas números inteiros!                ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.nextLine();
						continuar = 0;
					}
					if(continuar == 2)
						return;
				}while(continuar != 1 && continuar != 2);

			}

		}while(continuar == 1);

	}

	private static void apagarConta() {
		if(contaController.existeConta()){
			System.out.println("                    Não há contas cadastradas.                     ");
			System.out.println("                                                                   ");
			return;
		}
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                            DELETAR CONTA                          ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		String usuario, senha;
		int continuar = 0, resp;
		boolean existe;
		do{
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			senha = leia.nextLine();
			existe = contaController.existeConta(usuario, senha);

			if(existe){
				do{
					System.out.printf("\nUsuário: %s\nSenha: %s\n", usuario, senha);
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					do{
						try{
							System.out.printf("\nDeseja deletar a conta? [1- Sim | 2- Não]\n");
							System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
							resp = leia.nextInt();
							if(resp != 1 && resp != 2)
								System.out.println("                   Opção inválida, tente novamente!            ");
						}catch(InputMismatchException e){
							System.out.println("                    Digite apenas números inteiros!                ");
							System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
							leia.nextLine();
							resp = 0;
						}
						if(resp == 2)
							return;
					}while(resp != 1 && resp != 2);
				}while(resp != 1);
				contaController.deletarConta(usuario, senha);
				System.out.println("                    Conta deletada com sucesso!                    ");
				break;
			}else{
				do{
					try{
						System.out.println("   Usuário ou senha inválido. Tentar Novamente? [1- Sim | 2- Não]  ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						continuar = leia.nextInt();
						if(continuar != 1 && continuar != 2)
							System.out.println("                   Opção inválida, tente novamente!                ");
					}catch(InputMismatchException e){
						System.out.println("                    Digite apenas números inteiros!                ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.nextLine();
						continuar = 0;
					}
					if(continuar == 2)
						return;
				}while(continuar != 1 && continuar != 2);

			}

		}while(continuar == 1);

	}

}
