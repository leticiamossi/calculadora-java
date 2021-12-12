package entities;

public class Menu {
	
	public static void mostrarCabecalho(){
		System.out.print("Aluna: Let�cia Mossi Cardoso\n");
		System.out.print("Curso: Ci�ncia da Computa��o\n");
		System.out.println("Fase: 2� fase\n");
	}
	
	public static void mostrarMenu() {
		
		System.out.print("\n========================\n");
		System.out.print(">>>  Menu de Op��es  <<<");
		System.out.print("\n========================\n");
		System.out.print("1 - Adi��o\n");
		System.out.print("2 - Subtra��o\n");
		System.out.print("3 - Multiplica��o\n");
		System.out.print("4 - Divis�o\n");
		System.out.print("5 - Resto da Divis�o\n");
		System.out.print("========================\n");
		
	}
	
	public static int verificarOperacao(int escolha) {
		switch(escolha) {
		case 1: 
			System.out.println("Voc� escolheu: Adi��o");
			break;
		case 2: 
			System.out.println("Voc� escolheu: Subtra��o");
			break;
		case 3: 
			System.out.println("Voc� escolheu: Multiplica��o");
			break;
		case 4: 
			System.out.println("Voc� escolheu: Divis�o");
			break;
		case 5: 
			System.out.println("Voc� escolheu: Resto da Divis�o");
			break;
		default:
			System.out.println("Op��o Inv�lida");
			break;
		}
		return escolha;
	}
}
