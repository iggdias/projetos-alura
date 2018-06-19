package br.com.bytebank.banco.modelo;

public class TestaGuardadorDeContas {

	public static void main(String[] args) {
		
		GuardadorDeContas gc = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 55);
		
		gc.adiciona(cc);
		
		Conta cp = new ContaPoupanca(43, 23);
		gc.adiciona(cp);
		
		int tam = gc.getQuantidadeDeElementos();
		System.out.println("Tamanho do array: " + tam);
		
		Conta outraConta = gc.getReferencia(1);
		System.out.println(outraConta);
				
	}

}
