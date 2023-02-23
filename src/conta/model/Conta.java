package conta.model;

import java.util.ArrayList;
import java.util.Scanner;

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

	public void visualizaFilmes() {
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
