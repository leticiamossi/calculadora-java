package entities;

public class Menu {
	
	public static void mostrarCabecalho(){
		System.out.print("Aluna: Letícia Mossi Cardoso\n");
		System.out.print("Curso: Ciência da Computação\n");
		System.out.println("Fase: 2ª fase\n");
	}
	
	public static void mostrarMenu() {
		
		System.out.print("\n========================\n");
		System.out.print(">>>  Menu de Opções  <<<");
		System.out.print("\n========================\n");
		System.out.print("1 - Adição\n");
		System.out.print("2 - Subtração\n");
		System.out.print("3 - Multiplicação\n");
		System.out.print("4 - Divisão\n");
		System.out.print("5 - Resto da Divisão\n");
		System.out.print("========================\n");
		
	}
	
	public static int verificarOperacao(int escolha) {
		switch(escolha) {
		case 1: 
			System.out.println("Você escolheu: Adição");
			break;
		case 2: 
			System.out.println("Você escolheu: Subtração");
			break;
		case 3: 
			System.out.println("Você escolheu: Multiplicação");
			break;
		case 4: 
			System.out.println("Você escolheu: Divisão");
			break;
		case 5: 
			System.out.println("Você escolheu: Resto da Divisão");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		return escolha;
	}
}
