package conta.model;

import java.util.Scanner;

public class MenuLogin {
	public void init() {
	Scanner leia = new Scanner(System.in);
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
		if(opcao == 3) {
			System.out.println("Sistema encerrado com sucesso!");
			System.out.println("Volte sempre!\n\n");
			leia.close();
			System.exit(0);
		}
		switch(opcao){
		case 1 ->{
			System.out.println("Fazer login\n\n");
		}
		case 2 ->{
			System.out.println("Criar conta\n\n");
		}
		default ->System.out.println("Opção inválida, tente novamente...");
		}
		
	  }
	
   }

}
