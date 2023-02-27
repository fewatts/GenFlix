package conta.model;

import java.util.ArrayList;

import conta.util.Cores;

public class Conta {
	private String usuario;
	private String senha;
	private ArrayList<Filme> filmes = new ArrayList<>();

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
		if (filmes.isEmpty()) {
			System.out.println("                  Sua lista de filmes está vazia!                  ");
			System.out.println("                                                                   ");
			return;
		}
		System.out.print(Cores.TEXT_YELLOW);
		System.out.println("                          LISTA DE FILMES                          ");
		System.out.print(Cores.TEXT_RESET);
		for (Filme filme : filmes) {
			filme.visualizar();
		}
	}

	public void addFilme(Filme filme) {
		for (Filme f : this.getFilmes()) {
			if (f.getTitulo().equals(filme.getTitulo())) {
				System.out.println("   Filme já cadastrado  ");
				return;
			}
		}
		this.getFilmes().add(filme);
		System.out.println("   Filme adicionado com sucesso!  ");
	}

	public boolean existeFilme(String nome) {

		for (Filme filme : filmes) {
			String titulo = filme.getTitulo();
			if (titulo.toUpperCase().equalsIgnoreCase(nome.toUpperCase())) {
				return true;
			}
		}

		return false;
	}

	public void deletaFilme(String nome) {
		Filme filme = null;
		for (Filme f : filmes) {
			if (f.getTitulo().equalsIgnoreCase(nome)) {
				filme = f;
			}

		}
		filmes.remove(filme);
	}

}