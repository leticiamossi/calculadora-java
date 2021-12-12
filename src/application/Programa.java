package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculadora;
import entities.Menu;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Menu.mostrarCabecalho();
		
		System.out.print("Quantas operações você deseja realizar? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			Menu.mostrarMenu();
			
			int operacao = Menu.verificarOperacao(sc.nextInt());
			
			if(operacao > 0 && operacao < 6) {
				System.out.print("\nInforme o primeiro valor: ");
				double valor1 = sc.nextDouble();
				System.out.print("Informe o segundo valor: ");
				double valor2 = sc.nextDouble();
				
				Calculadora calc = new Calculadora(valor1, valor2);
				double resultado = calc.calcular(operacao);
				
				System.out.printf("\nO resultado é %.2f\n", resultado);
				
				System.out.print("\nPrecione enter para continuar/sair ");
				for(int j = 0; j < 2; j++) {
					sc.nextLine();
				}
			}
		}
		
		sc.close();
	}

}
