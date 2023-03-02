package conta;

import java.util.Scanner;
import java.util.InputMismatchException;

import conta.model.Conta;
import conta.model.Filme;
import conta.util.Cores;

public class MenuUsuario {
	static Scanner leia = new Scanner(System.in);

	public static void init(Conta conta) {
		int opcao;
		do {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println(Cores.TEXT_YELLOW_BOLD);
			System.out.println("                     BEM-VINDE, " + conta.getUsuario() + "!        ");
			System.out.println(Cores.TEXT_RESET);
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                        Meus Filmes:                               ");
			System.out.println("                                                                   ");
			System.out.println("                       1 - Adicionar Filme                         ");//ok
			System.out.println("                       2 - Listar Filmes                           ");//ok
			System.out.println("                       3 - Deletar Filme                           ");//ok
			System.out.println("                       4 - Mudar status do filme                   ");//ok
			System.out.println("                       5 - Sair da conta                           ");//ok
			System.out.println("                                                                   ");
			System.out.println("                        Digite sua opção:                          ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("                  Digite apenas números inteiros!                  ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				leia.nextLine();
				opcao = 0;
			}

			switch (opcao) {
			case 1 -> adicionarFilme(conta);
			case 2 -> conta.listaFilmes();
			case 3 -> deletar_filme(conta);
			case 4 -> mudarStatus(conta);
			case 5 -> System.out.println("                Logout realizado!                   ");


			default -> {
				System.out.println("                   Opção inválida, tente novamente!                ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

			}
			}

		} while (opcao != 5);

	}

	private static void adicionarFilme(Conta conta){
		System.out.print(Cores.TEXT_YELLOW);
		System.out.println("                          ADICIONAR FILME                          ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		String titulo, genero;
		int continuar;
		Integer classificacao, status, duracao;

		do{
			System.out.println("Digite o nome do filme: ");
			leia.skip("\\R?");
			titulo = leia.nextLine();

			System.out.println("Digite o gênero do filme: ");
			genero = leia.nextLine();
			do{
				try{
					System.out.println("Digite a duração do filme em minutos: ");
					duracao = leia.nextInt();
				}catch(InputMismatchException e){
					System.out.println("                    Digite apenas números inteiros!      ");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					leia.nextLine();
					duracao = 0;
				}
			}while(duracao == 0);
			do{
				try{
					System.out.println("Qual o status do filme? ");
					System.out.println("   1-Não assistido");
					System.out.println("   2-Assistido");
					status = leia.nextInt();
					if(status != 1 && status != 2)
						System.out.println("                   Opção inválida, tente novamente!                ");
				}catch(InputMismatchException e){
					System.out.println("                    Digite apenas números inteiros!      ");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					leia.nextLine();
					status = 0;
				}
			}while(status != 1 && status != 2);
			if(status == 1)
				classificacao = 0;
			else{
				do{
					try{
						System.out.println("Qual sua classificação para o filme? ");
						System.out.println("Com quantas estrelas você classifica esse filme?");
						System.out.println("   0 - ☆☆☆☆☆ | 1 - ★☆☆☆☆ | 2 - ★★☆☆☆");
						System.out.println("   3 - ★★★☆☆ | 4 - ★★★★☆ | 5 - ★★★★★");
						System.out.println("   ");
						classificacao = leia.nextInt();
						if(classificacao > 5 || classificacao < 0)
							System.out.println("                   Opção inválida, tente novamente!                ");
					}catch(InputMismatchException e){
						System.out.println("                    Digite apenas números inteiros!      ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.nextLine();
						classificacao = 6;
					}

				}while(classificacao > 5 || classificacao < 0);
		
			}
			do{
				try{
					System.out.println("          Confirma os dados do filme? [1 - Sim | 2 - Não]          ");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					continuar = leia.nextInt();
					if(continuar != 1 && continuar != 2)
						System.out.println("                   Opção inválida, tente novamente!                ");
				}catch(InputMismatchException e){
					System.out.println("                    Digite apenas números inteiros!      ");
					System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
					leia.nextLine();
					continuar = 0;
				}
			}while(continuar != 1 && continuar != 2);
		}while(continuar == 2);

		Filme filme = new Filme(titulo, genero, classificacao, duracao, status);
		
		if(!conta.existeFilme(titulo)){
			conta.adicionarFilme(filme);
			System.out.println("                            Filme cadastrado!");
		}else{
			System.out.println("                            Esse filme já foi cadastrado!");
			return;
		}

	}

	private static void deletar_filme(Conta conta){
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                   APAGAR FILME                   ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("                                                   ");
		int resp, continuar = 0;
		String nome;
		do{
			try{
				System.out.println("Deseja listar os filmes?");
				System.out.println("   [1 - Sim | 2 - Não]  ");
				resp = leia.nextInt();
				if(resp != 1 && resp != 2)
					System.out.println("                   Opção inválida, tente novamente!                ");
			}catch(InputMismatchException e){
				System.out.println("                    Digite apenas números inteiros!      ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				leia.nextLine();
				resp = 0;
			}
		}while(resp != 1 && resp != 2);
		if(resp == 1)
			conta.listaFilmes();
		
		do{

			System.out.println("\nDigite o nome do filme a ser deletado: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			nome = leia.nextLine();
			
			if(conta.existeFilme(nome)){
				do{
					try{
						System.out.printf("             %s                   \n", nome);
						System.out.println("                                   ");
						System.out.println("Deseja realmente apagar esse filme?");
						System.out.println("   [1 - Sim | 2 - Não]  ");
						resp = leia.nextInt();
						if(resp != 1 && resp != 2)
							System.out.println("                   Opção inválida, tente novamente!                ");
					}catch(InputMismatchException e){
						System.out.println("                    Digite apenas números inteiros!      ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.nextLine();
						resp = 0;
					}
				}while(resp != 1 && resp != 2);
				if(resp == 1){
					conta.deletarFilme(nome);
					System.out.println("                   Filme apagado!         ");
					break;
				}
			}else{
				System.out.println("Filme não encontrado. Deseja tentar novamente? [1 - Sim | 2 - Não]");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				continuar = leia.nextInt();
				if(continuar != 1 && continuar != 2)
					System.out.println("                   Opção inválida, tente novamente!                ");
			}

		}while(continuar == 1);

	}
	private static void mudarStatus(Conta conta){
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                EDITAR STATUS DO FILME                   ");
		System.out.println(Cores.TEXT_RESET);
		System.out.println("                                                   ");
		int resp, classificacao ,continuar = 0;
		int status;
		String nome;
		do{
			try{
				System.out.println("Deseja listar os filmes?");
				System.out.println("   [1 - Sim | 2 - Não]  ");
				resp = leia.nextInt();
				if(resp != 1 && resp != 2)
					System.out.println("                   Opção inválida, tente novamente!                ");
			}catch(InputMismatchException e){
				System.out.println("                    Digite apenas números inteiros!      ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				leia.nextLine();
				resp = 0;
			}
		}while(resp != 1 && resp != 2);
		if(resp == 1)
			conta.listaFilmes();

		do{

			System.out.println("\nDigite o nome do filme que quer alterar o status: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			nome = leia.nextLine();
			
			if(conta.existeFilme(nome)){
				do{
					try{
						System.out.printf("             %s                   \n", nome);
						System.out.println("                                   ");
						System.out.println("Qual status deseja definir?");
						System.out.println("[1 - Não assistido | 2 - Assistido]  ");
						status = leia.nextInt();
						if(status != 1 && status != 2)
							System.out.println("                   Opção inválida, tente novamente!                ");
					}catch(InputMismatchException e){
						System.out.println("                    Digite apenas números inteiros!      ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.nextLine();
						status = 0;
					}
				}while(resp != 1 && resp != 2);
				do{
					try{
						System.out.println("Qual sua classificação para o filme? ");
						System.out.println("Com quantas estrelas você classifica esse filme?");
						System.out.println("   0 - ☆☆☆☆☆ | 1 - ★☆☆☆☆ | 2 - ★★☆☆☆");
						System.out.println("   3 - ★★★☆☆ | 4 - ★★★★☆ | 5 - ★★★★★");
						System.out.println("   ");
						classificacao = leia.nextInt();
						if(classificacao > 5 || classificacao < 0)
							System.out.println("                   Opção inválida, tente novamente!                ");
					}catch(InputMismatchException e){
						System.out.println("                    Digite apenas números inteiros!      ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.nextLine();
						classificacao = 6;
					}

				}while(classificacao > 5 || classificacao < 0);
				do{
					try{
						System.out.printf("             %s                   \n", nome);
						System.out.println("                                   ");
						System.out.println("Deseja realmente alterar o status desse filme?");
						System.out.println("   [1 - Sim | 2 - Não]  ");
						resp = leia.nextInt();
						if(resp != 1 && resp != 2)
							System.out.println("                   Opção inválida, tente novamente!                ");
					}catch(InputMismatchException e){
						System.out.println("                    Digite apenas números inteiros!      ");
						System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
						leia.nextLine();
						resp = 0;
					}
				}while(resp != 1 && resp != 2);
				if(resp == 1){
					conta.mudarStatus(nome, status, classificacao);
					System.out.println("           Status alterado!         ");
					break;
				}
			}else{
				System.out.println("Filme não encontrado. Deseja tentar novamente? [1 - Sim | 2 - Não]");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				continuar = leia.nextInt();
				if(continuar != 1 & continuar != 2)
					System.out.println("                   Opção inválida, tente novamente!                ");
			}

		}while(continuar == 1);
	
	}
	
}
