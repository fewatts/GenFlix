package conta;

import java.util.Scanner;

import conta.model.Conta;

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
			System.out.println("                                                                   ");
			System.out.println("          Minhas Series:                                           ");
			System.out.println("                   4 - Lista Series                                ");
			System.out.println("                   5 - Adicionar Serie                             ");
			System.out.println("                   6 - Deletar Serie                               ");
			System.out.println("                                                                   ");
			System.out.println("                   7 - Sair da conta                               ");
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
				String nome;
				System.out.println("Digite o nome do filme a ser deletado:");
				scan.skip("\\R?");
				nome = scan.nextLine();
				//conta.deletarFilme(nome);
				
			}
			case 4 -> {
				// Listagem de series
				//conta.listaSeries();
			}
			case 5 ->{
				//Serie serie= addSerie();
				//conta.addSerie(Serie)
				
			}
			case 6 ->{
				
				String nome;
				System.out.println("Digite o nome da serie a ser deletada:");
				scan.skip("\\R?");
				nome = scan.nextLine();
				//conta.deletarSerie(nome);
				
			}
			
			case 7 ->{
				System.out.println("Você saiu da sua conta.");
				
			}
			
			default ->System.out.println("Opção inválida, tente novamente...");
			}
			
			
		}while(opcao!=7);
	}

	private void addFilme() {
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
	private void addSerie() {
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
