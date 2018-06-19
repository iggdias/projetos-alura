package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals extends Object {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<>();
				
		Conta cc1 = new ContaCorrente(123, 321);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(123, 321);
//		lista.add(cc2);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		boolean existeConta = cc1.equals(cc2);
		
		System.out.println("Ja existe? " + existeConta);
		
	}

}
