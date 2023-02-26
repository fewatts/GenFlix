package conta.controller;

import java.util.ArrayList;

import conta.MenuUsuario;
import conta.model.Conta;
import conta.model.Filme;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> contas = new ArrayList<Conta>();

	@Override
	public boolean login(String usuario, String senha) {
		boolean acesso = false;
		for (Conta c : contas) {
			if (c.getUsuario().equals(usuario) && c.getSenha().equals(senha)) {
				acesso = true;
				MenuUsuario.init(c);
				break;
			}
		}
		return acesso;
	}

	@Override
	public void criarConta(Conta conta) {

		for (Conta c : contas) {
			if (c.getUsuario().equals(conta.getUsuario())) {
				System.out.println("     Conta já cadastrado tente novamente!   ");
				return;
			}
		}
		contas.add(conta);
		MenuUsuario.init(conta);

	}

	@Override
	public void cadastrarFilme(Filme filme, Conta conta) {
		for (Filme f : conta.getFilmes()) {
			if (f.getTitulo().equals(filme.getTitulo())) {
				System.out.println("   Filme já cadastrado  ");
				return;
			}
		}
		conta.getFilmes().add(filme);
		System.out.println("   Filme adicionado com sucesso!  ");

	}

	@Override
	public void listaFilmes(Conta conta) {
		conta.getFilmes().forEach(filme -> filme.visualizar());
	}

}
