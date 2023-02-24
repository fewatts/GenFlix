package conta;

import java.util.ArrayList;
import java.util.Scanner;

import conta.model.Conta;

public class StartGenFlix {

	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		do{
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                     BEM-VINDE À GENFLIX                           ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("                                                                   ");
			System.out.println("                   1- Fazer login                                  ");
			System.out.println("                   2- Criar uma conta                              ");
			System.out.println("                   3- Editar conta                                 ");
			System.out.println("                   4- Deletar conta                                ");
			System.out.println("                   5- Encerrar                                     ");
			System.out.println("                                                                   ");
			System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			System.out.println("Digite uma opção:                                                  ");
			opcao = leia.nextInt();
			switch(opcao){
			case 1 -> login(contas);
			
			case 2 ->{
				Conta conta = criarConta();
				boolean verificar = false;

				for(Conta c : contas){
					if (c.getUsuario().equals(conta.getUsuario())) {
						verificar = true;
						System.out.println("Usuario já cadastrado, tente novamente!");
						break;
					}
				}

				if(!verificar){
					contas.add(conta);
					MenuUsuario.init(conta);
				}

			}
			case 3 ->{
				System.out.println("Editar conta!");
			}
			case 4 ->{
				System.out.println("Deletar conta!");
				
			}
			case 5 ->{
				System.out.println("Sistema encerrado com sucesso!");
				System.out.println("Volte sempre!\n\n");
				
			}
			default -> System.out.println("Opção inválida, tente novamente!\n");
			}

		}while (opcao != 5);

	}

	private static void login(ArrayList<Conta> contas) {
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("             LOGIN               ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

		Scanner leia = new Scanner(System.in);
		String usuario, senha;
		boolean acesso = false;

		do {
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			leia.skip("\\R?");
			senha = leia.nextLine();

			for (Conta c : contas) {
				if (c.getUsuario().equals(usuario) && c.getSenha().equals(senha)) {
					acesso = true;
					MenuUsuario.init(c);
					break;
				}
			}
			
			if(!acesso){
				int continuar;
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				System.out.println("   Usuário ou senha inválido. Tentar Novamente? (0 - Não | 1 - Sim) ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				continuar = leia.nextInt();
				if(continuar == 0) 
					acesso = true;
			}

		}while(!acesso);

	}

	private static Conta criarConta(){
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("          CRIAR CONTA            ");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

		Scanner leia = new Scanner(System.in);
		String usuario, senha;
		int resp = 0;
		Conta conta = null;

		do{
			System.out.println("Digite o nome de usuário: ");
			leia.skip("\\R?");
			usuario = leia.nextLine();

			System.out.println("Digite sua senha: ");
			leia.skip("\\R?");
			senha = leia.nextLine();

			System.out.printf("\nConfirma os dados? [1- Sim | 2- Não]\n");
			resp = leia.nextInt();

			if(resp == 1){
				conta = new Conta(usuario, senha);
				System.out.printf("Conta %s criada com sucesso!\n\n", usuario);
			}else{

				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
				System.out.println("  Digite os dados novamente:     ");
				System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
			}
		}while(resp != 1);
		return conta;
	}

}
