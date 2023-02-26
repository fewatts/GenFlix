package conta.controller;

import java.util.ArrayList;

import java.util.Scanner;
import conta.MenuUsuario;
import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	static Scanner leia = new Scanner(System.in);

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
		contas.add(conta);
		MenuUsuario.init(conta);
	}
	public void deletarConta(String usuario, String senha){
		Conta conta = null;
		for (Conta c : contas) {
			if (c.getUsuario().equalsIgnoreCase(usuario) && c.getSenha().equalsIgnoreCase(senha)){
				conta = c;
			}
				
		}
		contas.remove(conta);
	}
	public void atualizarConta(String usuario, String senha, String newUsuario, String newSenha){
		for (Conta c : contas) {
			if (c.getUsuario().equalsIgnoreCase(usuario) && c.getSenha().equalsIgnoreCase(senha))
				c.setUsuario(newUsuario);
				c.setSenha(newSenha);
		}
	}
	public boolean existeConta(){
		return contas.isEmpty();
	}
	public boolean existeConta(String usuario, String senha){
		for (Conta c : contas) {
			if (c.getUsuario().equalsIgnoreCase(usuario) && c.getSenha().equalsIgnoreCase(senha))
				return true;
		}
		return false;
	}

}
