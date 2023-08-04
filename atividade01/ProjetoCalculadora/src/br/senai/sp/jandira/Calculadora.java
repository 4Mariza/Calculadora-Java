package br.senai.sp.jandira;

public class Calculadora {
	
	double valorA, valorB, resultado;
	
	public Calculadora() {}

	public Calculadora (double valorA, double valorB, double resultado) {
		this.valorA = valorA;
		this.valorB = valorB;
		this.resultado = resultado;
	}
	
	public void somar (double valorA, double valorB) {
		this.resultado = valorA + valorB;
	}
	
	public void subtrair (double valorA, double valorB) {
		this.resultado = valorA - valorB;
	}
	
	public void multiplicar (double valorA, double valorB) {
		this.resultado = valorA * valorB;
	}
	
	public void dividir (double valorA, double valorB) {
		this.resultado = valorA / valorB;
	}
	
	public double verificarResultado() {
		return resultado;
	}
	
}
