package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
	}

	public void adiciona(Conta ref) {
		this.referencias[posicaoLivre] = ref;
		posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {

		return this.posicaoLivre;
	}

	public Conta getReferencia(int ref) {
		
		return this.referencias[ref];	
	}

}
