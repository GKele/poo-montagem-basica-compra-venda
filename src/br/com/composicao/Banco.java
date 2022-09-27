package br.com.composicao;

public class Banco{
	Poupanca[] poups;
	ContaCorrente [] cc;
	int numConta, numPoupanca;
	
	public void iniciarBanco() {
		poups = new Poupanca[100];
		cc = new ContaCorrente[100];
		numConta = 1;
		numPoupanca = 1;
	}
	
	public void abreConta() {
		cc[numConta] = new ContaCorrente();
		numConta++;
	}
	
	public void abrePoupanca() {
		poups[numConta] = new Poupanca();
		numPoupanca++;
	}
	
	public void falencia() {
		for(int i= 0; i< 100; i++) {
			poups[i] = null;
			cc[i] = null;
		}
	}
	
}