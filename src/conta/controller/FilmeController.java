package conta.controller;

import java.util.ArrayList;

import conta.model.Filme;
import conta.repository.FilmeRepository;

public class FilmeController implements FilmeRepository{
	private ArrayList<Filme> filmes = new ArrayList<Filme>();
	@Override
	public void cadastrar(Filme filme) {
		filmes.add(filme);
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("   Filme adicionado com sucesso!  ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
	}

}
