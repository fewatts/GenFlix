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
		System.out.println("\n**********************************");
		System.out.println("          Lista de filmes         ");
		System.out.println("**********************************\n");
		for (Filme filme : filmes) {
			System.out.println("               FILME                ");
			System.out.println("------------------------------------");
			System.out.println("\nTitulo: " + filme.getTitulo());
			System.out.println("\nGenero: " + filme.getGenero());
			System.out.println("\nDuração: " + filme.getDuracao());

			if (filme.getStatus() != 0) {
				switch (filme.getClassificacao()) {
				case 0 -> {
					System.out.println("\nClassificação: ☆☆☆☆☆");
				}
				case 1 -> {
					System.out.println("\nClassificação: ★☆☆☆☆");
				}
				case 2 -> {
					System.out.println("\nClassificação: ★★☆☆☆");
				}
				case 3 -> {
					System.out.println("\nClassificação: ★★★☆☆");
				}
				case 4 -> {
					System.out.println("\nClassificação: ★★★★☆");
				}
				case 5 -> {
					System.out.println("\nClassificação: ★★★★★");
					System.out.println("\n**********************************\n");
				}
				}

			}
			else {
				System.out.println("\nStatus: Não Assistido \n\n");
			}
		}
	}

	public void addFilme(Filme filme) {
		filmes.add(filme);
		listaFilmes();
	}

	public boolean existeFilme(String nome) {

		// percorrendo a lista de filmes pra verificar se o filme existe nessa lista
		for (Filme filme : filmes) {
			String titulo = filme.getTitulo();
			// toUpperCase para identificar o filme independente da forma que o usuário digitar
			if (titulo.toUpperCase() == nome.toUpperCase()) {
				return true;
			}
		}

		return false;
	}

	public void deletaFilme(String nome) {

	}

}