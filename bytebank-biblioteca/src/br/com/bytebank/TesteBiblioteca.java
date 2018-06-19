package br.com.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * Classe que testa a biblioteca bytebank-herdado-conta-1.0.jar
 * @author 03977493175
 *
 */
public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(40.5);
		
		System.out.println("Saldo da conta: " + c.getSaldo());
	}
}
