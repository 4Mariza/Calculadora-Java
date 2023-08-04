package br.senai.sp.jandira;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("--------------------------------------");
		System.out.println("          Calculadora Básica          ");
		System.out.println("--------------------------------------");
		
		double valorA, valorB;
		int operacao;
		
		System.out.println("");
		System.out.print("Digite um valor: ");
		valorA = teclado.nextDouble();
		System.out.println("");
		
		System.out.print("Digite outro valor: ");
		valorB = teclado.nextDouble();
		System.out.println("");
		
		System.out.println("Qual operação deseja fazer?");
		System.out.println("1 - Soma \n2 - Subtração \n3 - Divisão \n4 - Multiplicação");
		operacao = teclado.nextInt();
		System.out.println("");
		
		Calculadora calculo = new Calculadora();
		
		if (operacao == 1) {
			calculo.somar(valorA, valorB);
			System.out.println("O resultado da soma é: " + calculo.verificarResultado());
		} else if (operacao == 2) {
			calculo.subtrair(valorA, valorB);
			System.out.println("O resultado da subtração é: " + calculo.verificarResultado());
		} else if (operacao == 3) {
			calculo.dividir(valorA, valorB);
			System.out.println("O resultado da divisão é: " + formatador.format(calculo.verificarResultado()));
		} else {
			calculo.multiplicar(valorA, valorB);
			System.out.println("O resultado da multiplicação é: " + calculo.verificarResultado());
		}
		
		
	}

}
