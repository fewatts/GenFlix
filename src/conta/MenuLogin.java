package conta;

import java.util.Scanner;

class MenuLogin {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
		
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
			if(opcao == 9) {
				System.out.println("Sistema encerrado com sucesso!");
				System.out.println("Volte sempre!\n\n");
				System.exit(0);
			}
			switch(opcao){
			case 1 ->{
				System.out.println("Criar conta\n\n");
			}
			case 2 ->{
				System.out.println("Listar todas as contas\n\n");
			}
			case 3 ->{
				System.out.println("Consultar dados da conta por número\n\n");
			}
			case 4 ->{
				System.out.println("Atualizar dados da conta\n\n");
			}
			case 5 ->{
				System.out.println("pagar conta\n\n");
			}
			case 6 ->{
				System.out.println("Saque\n\n");
			}
			case 7 ->{
				System.out.println("Depósito\n\n");
			}
			case 8 ->{
				System.out.println("Transferência entre contas\n\n");
			}
			default ->System.out.println("Opção inválida, tente novamente...");
			}
			
		}

	}

}
