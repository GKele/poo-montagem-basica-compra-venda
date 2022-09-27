package br.com.agregacao;

public class Produto {
	private float preco;
	private int tamanho;
	
	//get and set
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void vendido() {
		System.out.println("Vendido.");
	}
}
