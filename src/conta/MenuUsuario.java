package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.Filme;

public class MenuUsuario {
	static Scanner scan = new Scanner(System.in);

	public static void init(Conta conta) {
		int opcao;
		do {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                     BEM-VINDE " + conta.getUsuario() + "          ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("          Meus Filmes:                                             ");
			System.out.println("                   1 - Lista Filmes                                ");
			System.out.println("                   2 - Adicionar Filme                             ");
			System.out.println("                   3 - Deletar Filme                               ");
			System.out.println("                                                                   ");
			System.out.println("                   4 - Sair da conta                               ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("¬¬¬Digite sua opção:                                               ");
			System.out.println("                                                                   ");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1 -> {
				conta.listaFilmes();
				}
			case 2 ->{
				Filme filme = addFilme();
				conta.addFilme(filme);
				
			}
			case 3 -> {
				deletarFilme(conta);
				
			}

			case 4 -> {
				System.out.println("Você saiu da sua conta.");

			}

			default -> System.out.println("Opção inválida, tente novamente...");
			}

		} while (opcao != 4);
	}

	/// Metodos de filme
	private static Filme addFilme() {
		String titulo,genero;
		Integer classificacao,status,duracao;
		
		System.out.println("Digite o nome do filme:");
		scan.skip("\\R?");
		titulo = scan.nextLine();

		System.out.println("Digite o genero do filme:");
		scan.skip("\\R?");
		genero = scan.nextLine();

		System.out.println("Digite a duracao do filme(em minutos):");

		duracao = scan.nextInt();

		System.out.println("Qual o status do filme?");
		System.out.println("   0 - Não assistido");
		System.out.println("   1 - Assistido");
		status = scan.nextInt();

		if (status == 0) {
			classificacao = 0;
		} else {

			boolean opcaoInvalida = true;
			do {
		System.out.println("Com quantas estrelas você classifica esse filme?");
		System.out.println("   0 - ☆☆☆☆☆ | 1 - ★☆☆☆☆ | 2 - ★★☆☆☆");
		System.out.println("   3 - ★★★☆☆ | 4 - ★★★★☆ | 5 - ★★★★★");
		System.out.println("   ");
		classificacao = scan.nextInt();
		
		
		
		if(classificacao < 0 || classificacao > 5) {
			
			System.out.println("Classificação invalida! Digite novamente");
		}else opcaoInvalida = false;
		
			}while(opcaoInvalida);
		}
		 	Filme filme = new Filme(titulo, genero,duracao,status,classificacao);
			return filme;
		
	}

	private static void deletarFilme(Conta conta) {
		boolean finalizado = false, temFilme = false;

		while (!finalizado) {
			String nome;
			
		//conta.visualizarFilmes();
			
		System.out.println("Digite o nome do filme a ser deletado:");
		scan.skip("\\R?");
		nome = scan.nextLine();
		
		temFilme=conta.existeFilme(nome);
		
		
		if(temFilme) {
			
			conta.deletaFilme(nome);
			System.out.println("Filme deletado com sucesso!");
			
			}else {
				int continuar;
				boolean pararElse = false;

				while (!pararElse) {
					System.out.println("Filme não encontrado. Deseja tentar novamente? ( 1 - Sim | 2 - Não)");
					continuar = scan.nextInt();

					if (continuar < 1 || continuar > 2) {
						System.out.println("Opção invalida...");
					}
					if (continuar == 2) {
						pararElse = true;
						finalizado=true;
					}else {
						
						pararElse = true;
					}
				}

			}

		}
	}
}
