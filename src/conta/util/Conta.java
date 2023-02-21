package conta.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	private String usuario;
	private String senha;
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
	public static void criarConta() {
		String usuario, senha;
		int resp;
		Scanner leia = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<Conta>();
		while(true) {
			System.out.println("Usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();
			
			System.out.println("Senha: ");
			leia.skip("\\R?");
			senha = leia.nextLine();
			
			System.out.printf("\nUsuário: %s\nSenha: %s\nConfirma os dados? [1- sim/2-não]\n", usuario, senha);
			resp = leia.nextInt();
			if(resp == 1) {
				Conta c_1 = new Conta(usuario, senha);
				contas.add(c_1);
				System.out.printf("Conta %s criada com sucesso!\n\n", c_1.getUsuario());
				break;
			}
	
		}
		
	}
	public static boolean verificaLogin(String user, String senha){
		Conta c_2 = new Conta("teste", "123");
		if(user.equals(c_2.usuario) && senha.equals(c_2.senha)) 
			return true;
		else
			return false;			
	}
	
}