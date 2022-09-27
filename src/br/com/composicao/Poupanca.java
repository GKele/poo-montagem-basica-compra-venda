package br.com.composicao;

public class Poupanca {
	private float Saldo;
	
	public void saque() {
		Saldo -= 10.0f;
		System.out.println("Novo Saldo: " + Saldo);
	}
	
	public void deposito() {
		Saldo += 10.0f;
		System.out.println("Novo Saldo: " + Saldo);
	}
}
