package br.com.composicao;

public class ContaCorrente {
	public float Saldo;
	
	public void saque() {
		Saldo -= 100.0f;
		System.out.println("Novo Saldo: " + Saldo);
	}
	
}
