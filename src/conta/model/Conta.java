package conta.model;

import java.util.ArrayList;

public class Conta {
	private String usuario;
	private String senha;
	private ArrayList<Filme> filmes = new ArrayList<>();
	// colocar filmes dentro do new Arraylist;

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
		System.out.println("**********************************");
		System.out.println("          Lista de filmes         ");
		System.out.println("**********************************");
		for(Filme filme : filmes) {
			System.out.println("               FILME                ");
			System.out.println("\nTitulo: " + filme.getTitulo());
			System.out.println("\nGenero: " + filme.getGenero());
			System.out.println("\nDuração: " + filme.getDuracao());
			System.out.println("\nStatus: " + filme.getStatus());
			
			switch(filme.getClassificacao()) {
			case 1 ->{
				System.out.println("\nClassificação:");
				System.out.println("\n0 - ☆☆☆☆☆");
			}
			case 2 ->{
				System.out.println("\nClassificação:");
				System.out.println("\n1 - ★☆☆☆☆");
			}
			case 3 ->{
				System.out.println("\nClassificação:");
				System.out.println("\n2 - ★★☆☆☆");
			}
			case 4 ->{
			System.out.println("\nClassificação:");
				System.out.println("\n3 - ★★★☆☆");
			}
			case 5 ->{
			System.out.println("\nClassificação:");
				System.out.println("\n4 - ★★★★☆");
			}
			case 6 ->{
			System.out.println("\nClassificação:");
				System.out.println("\n5 - ★★★★★");
			}
		}
			//System.out.println("\nClassificação: " + filme.getClassificacao(avaliar));
			System.out.println("**********************************\n");
		}
	}

	public void addFilme(Filme filme) {
		filmes.add(filme);
		listaFilmes();
	}

	public boolean existeFilme(String nome) {

		return false;
	}

	public void deletaFilme(String nome) {
	}

}