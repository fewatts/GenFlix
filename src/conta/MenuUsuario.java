package conta;

import java.util.ArrayList;
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
			System.out.println("                     BEM-VINDE "+conta.getUsuario()+"              ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("          Meus Filmes:                                             ");
			System.out.println("                   1 - Lista Filmes                                ");
			System.out.println("                   2 - Adicionar Filme                             ");
			System.out.println("                   3 - Deletar Filme                               ");
			System.out.println("                   4 - Editar Filme                                ");
			System.out.println("                                                                   ");
			System.out.println("          Minhas Series:                                           ");
			System.out.println("                   5 - Lista Series                                ");
			System.out.println("                   6 - Adicionar Serie                             ");
			System.out.println("                   7 - Deletar Serie                               ");
			System.out.println("                   8 - Editar Serie                                ");
			System.out.println("                                                                   ");
			System.out.println("                   9 - Sair da conta                               ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("¬¬¬Digite sua opção:                                               ");
			System.out.println("                                                                   ");
			opcao = scan.nextInt();
			
			
			switch(opcao){
			case 1 -> {
				// Listagem de filmes
				//conta.listaFilmes();
				}
			case 2 ->{
			//Filme filme = addFilme();
			//conta.addFilme(filme)
				
			}
			case 3 ->{
				deletarFilme(conta);
				//conta.deletarFilme(nome);
				
			}
			case 4 ->{
				menuFilme(conta);
				
			}
			case 5 -> {
				// Listagem de series
				//conta.listaSeries();
			}
			case 6 ->{
				//Serie serie= addSerie();
				//conta.addSerie(Serie)
				
			}
			case 7 ->{
				
				String nome;
				System.out.println("Digite o nome da serie a ser deletada:");
				scan.skip("\\R?");
				nome = scan.nextLine();
				//conta.deletarSerie(nome);
				
			}
			
			case 8 ->{
				System.out.println("Você saiu da sua conta.");
				
			}
			case 9 ->{
				System.out.println("Você saiu da sua conta.");
				
			}
			
			default ->System.out.println("Opção inválida, tente novamente...");
			}
			
			
		}while(opcao!=7);
	}
	
	private static void menuFilme(Conta conta) {
		
		int opcao;
		do {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                          Menu filmes                              ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("          Opções:                                                  ");
			System.out.println("                   1 - Editar titulo                               ");
			System.out.println("                   2 - Editar genero                               ");
			System.out.println("                   3 - Editar status                               ");
			System.out.println("                   4 - Editar classificação                        ");
			System.out.println("                   5 - Editar duração                              ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("¬¬¬Digite sua opção:                                               ");
			System.out.println("                                                                   ");
			opcao = scan.nextInt();
			
			
			switch(opcao){
			case 1 -> {
				 String nome;
				 conta.getFilmes();
				
				System.out.println("Qual o nome do filme a ser editado?");
				scan.skip("\\R?");
				nome = scan.nextLine();
				}
			case 2 ->{
			//Filme filme = addFilme();
			//conta.addFilme(filme)
				
			}
			}
			
			
		}while(opcao!=7);
		
	}

	
	/// Metodos de filme
	private static void addFilme() {
		String titulo,genero;
		Integer classificacao,status,duracao;
		
		System.out.println("Digite o nome do filme:");
		scan.skip("\\R?");
		titulo = scan.nextLine();
		
		System.out.println("Digite o genero do filme:");
		scan.skip("\\R?");
		genero = scan.nextLine();
		
		System.out.println("Digite a duracao do filme(em minutos):");
		
		duracao= scan.nextInt();
		
		System.out.println("Qual o status do filme?");
		System.out.println("   0 - Não assistido");
		System.out.println("   1 - Assistido");
		status = scan.nextInt();
		
		if(status == 0) {
			classificacao = 0;
		}else {
			
			boolean opcaoInvalida=true;
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
		
			//return Filme filme = new Filme(titulo, genero,duracao,status,classificacao);
		
	}
	
	
	private static void deletarFilme(Conta conta){
		boolean finalizado = false,temFilme=false;
		
		
		while(!finalizado) {
			String nome;
			
		conta.visualizaFilmes();
			
		System.out.println("Digite o nome do filme a ser deletado:");
		scan.skip("\\R?");
		nome = scan.nextLine();
		
		temFilme=conta.existeFilme(nome);
		
		
		if(temFilme) {
			
			conta.deletaFilme(nome);
			System.out.println("Filme deletado com sucesso!");
			
			}else {
				int continuar;
				boolean pararElse=false;
				
				while(!pararElse) {
				System.out.println("Filme não encontrado. Deseja tentar novamente? ( 1 - Sim | 2 - Não)");
				continuar = scan.nextInt();
				
					if(continuar < 1 || continuar > 2) {
						System.out.println("Opção invalida...");	
					}
					else if(continuar == 2) {
						pararElse = true;
					}
				}
				
			}
		
		}
	}
	
	
	
	
	
	
	///Metodos de serie
	private static void addSerie() {
		String titulo,genero;
		Integer classificacao,status,temporadas,capitulos;
		
		System.out.println("Digite o nome da serie:");
		scan.skip("\\R?");
		titulo = scan.nextLine();
		
		System.out.println("Digite o genero da serie:");
		scan.skip("\\R?");
		genero = scan.nextLine();
		
		System.out.println("Digite o numero de temporadas da serie:");
		temporadas= scan.nextInt();
		
		System.out.println("Digite o numero de capitulos totais da serie:");
		temporadas= scan.nextInt();
		
		System.out.println("Qual o status da serie?");
		System.out.println("   0 - Não assistido");
		System.out.println("   1 - Assistido");
		status = scan.nextInt();
		
		if(status == 0) {
			classificacao = 0;
		}else {
			
			boolean opcaoInvalida=true;
			do {
				System.out.println("Com quantas estrelas você classifica essa serie?");
				System.out.println("   0 - ☆☆☆☆☆ | 1 - ★☆☆☆☆ | 2 - ★★☆☆☆");
				System.out.println("   3 - ★★★☆☆ | 4 - ★★★★☆ | 5 - ★★★★★");
				System.out.println("   ");
				classificacao = scan.nextInt();
				
				if(classificacao < 0 || classificacao > 5) {
					
					System.out.println("Classificação invalida! Digite novamente");
				}else opcaoInvalida = false;
				
			}while(opcaoInvalida);
		}
		
		//return Serie serie = new Serie(titulo, genero,temporadas,capitulos,status,classificacao);
		
	}
}
