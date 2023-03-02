package conta.model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

import conta.util.Cores;

public class Conta {
	private String usuario;
	private String senha;
	private ArrayList<Filme> filmes = new ArrayList<>();
	
	Scanner leia = new Scanner(System.in);

	public Conta(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<Filme> filmes) {
		this.filmes = filmes;
	}

	public void listaFilmes() {
		int opcaoListaFilme, count = 0;
		do{
			try{
				System.out.println("Qual lista de filme deseja ver? ");
				System.out.println("[1- Não assistidos | 2- Assistidos]");
				opcaoListaFilme = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("                    Digite apenas números inteiros!      ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				leia.nextLine();
				opcaoListaFilme = 0;
			}
		}while(opcaoListaFilme != 1 && opcaoListaFilme != 2);

		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                          LISTA DE FILMES                                 ");
		System.out.println(Cores.TEXT_RESET);
		for(Filme filme : filmes){
			if(filme.getStatus() == opcaoListaFilme){
				count++;
			}

		}
		if(count == 0){
			System.out.println("                    Essa lista de filmes está vazia!                   ");
			System.out.println("                                                                       ");
		}else{
			for(Filme filme : filmes){
			if(filme.getStatus() == opcaoListaFilme)
				filme.visualizar();

			}

		}
		keyPress();
	}

	public boolean existeFilme(String nome){
		for(Filme filme : filmes){
			String titulo = filme.getTitulo();
			if(titulo.toUpperCase().equalsIgnoreCase(nome.toUpperCase())){
				return true;
			}

		}
		return false;
	}

	public void adicionarFilme(Filme filme){
		this.getFilmes().add(filme);
	}

	public void deletarFilme(String nome){
		Filme filme = null;
		for(Filme f : filmes){
			if(f.getTitulo().equalsIgnoreCase(nome))
				filme = f;
		}
		filmes.remove(filme);
	}

	public void mudarStatus(String nome, int status, int classificacao){
		Filme filme = null;
		for(Filme f : filmes){
			if(f.getTitulo().equalsIgnoreCase(nome))
				filme = f;
		}
		filme.setStatus(status);
		filme.setClassificacao(classificacao);
	}

	public void tempoAssistido(){
		int opcaoListaFilme = 2, count = 0, tempo = 0, seg = 0, min = 0, hora = 0;
		System.out.println(Cores.TEXT_YELLOW);
		System.out.println("                          TEMPO DE TELA                                ");
		System.out.println(Cores.TEXT_RESET);
		for(Filme filme : filmes){
			if(filme.getStatus() == opcaoListaFilme){
				count++;
			}

		}
		if(count == 0){
			System.out.println("                  Você ainda não assistiu nenhum filme!                   ");
			System.out.println("                                                                       ");
		}else{
			for(Filme filme : filmes){
				if(filme.getStatus() == opcaoListaFilme){
					tempo += filme.getDuracao();
				}
	
			}
			seg = tempo * 60;
			while(seg > 60) {
				if(seg > 60) {
					seg -= 60;
					min += 1;
				}
				if(min == 60) {
					min -= 60;
					hora += 1;
				}
				
			}
			System.out.printf("                     Horas : Minutos : Segundos\n");
			System.out.printf("                       %d   :    %d   :   %d\n\n", hora, min, seg);
		}
		keyPress();
	}


	public static void keyPress() {
		try{
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		}catch(IOException e){
			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
		
	}

}
