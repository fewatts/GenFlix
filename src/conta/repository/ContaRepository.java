package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	public boolean login(String usuario, String senha);
	public void criarConta(Conta conta);
	public void deletarConta(String usuario, String senha);
	public void atualizarConta(String usuario, String senha, String newUsuario, String newSenha);
	public boolean existeConta();

}
