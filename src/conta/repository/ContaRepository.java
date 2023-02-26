package conta.repository;

import conta.model.Conta;
import conta.model.Filme;

public interface ContaRepository {
	public boolean login(String usuario, String senha);
	public void criarConta(Conta conta);

}
