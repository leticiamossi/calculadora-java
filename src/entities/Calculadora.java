package entities;

public class Calculadora {
	
	private double valor1;
	private double valor2;
	
	public Calculadora() {
	}
	
	public Calculadora(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public double calcular(int operacao) {
		
		double resultado=0.0;
		
		switch(operacao) {
		case 1: 
			resultado = valor1 + valor2;
			break;
		case 2:
			resultado = valor1 - valor2;
			break;
		case 3:
			resultado = valor1 * valor2;
			break;
		case 4:
			resultado = valor1 / valor2;
			break;
		case 5:
			resultado = valor1 % valor2;
			break;
		}
		
		return resultado;
	}
	
	
}
