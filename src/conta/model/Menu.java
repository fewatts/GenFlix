package conta.model;

import java.util.ArrayList;
import java.util.Scanner;
import conta.util.Conta;

public class Menu {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta c_1 = new Conta("teste", "123");
		contas.add(c_1);
		
		String usuario, senha;
		int opcao, resp;
		
		while(true) {
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                     BEM-VINDE À GENFLIX                           ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                   1- Fazer login                                  ");
			System.out.println("                   2- Criar uma conta                              ");
			System.out.println("                   3- Encerrar                                     ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("¬¬¬Digite sua opção:                                               ");
			System.out.println("                                                                   ");
			opcao = leia.nextInt();
			if(opcao == 3) {
				System.out.println("Sistema encerrado com sucesso!");
				System.out.println("Volte sempre!\n\n");
				System.exit(0);
			}
			switch(opcao){
			case 1 ->{
				System.out.println("Fazer login\n\n");
				System.out.println("Usuário: ");
				leia.skip("\\R?");
				usuario = leia.nextLine();
				
				System.out.println("Senha: ");
				leia.skip("\\R?");
				senha = leia.nextLine();
				
				if(usuario.equals(contas.get(0).getUsuario()) && senha.equals(contas.get(0).getSenha())) { 
					System.out.println("Logado! \n");
					//usar contas.get(0)
					System.out.println("Menu usuário:\n\n");
				}
				}
			case 2 ->{
				System.out.println("Criar conta:\n\n");
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
						Conta c_2 = new Conta(usuario, senha);
						contas.add(c_2);
						System.out.printf("Conta %s criada com sucesso!\n\n", c_2.getUsuario());
						break;
					}
			
				}
				
			}
			default ->System.out.println("Opção inválida, tente novamente...");
		 }
		
	  }
	
   }
	
}
