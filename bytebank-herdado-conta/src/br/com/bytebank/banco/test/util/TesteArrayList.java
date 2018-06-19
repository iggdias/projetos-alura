package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<>();
		
//		Cliente c1 = new Cliente("igor", "03977493175");
//		lista.add(c1);
		
//		Cliente c2 = new Cliente("lauane", "03413126148");
//		lista.add(c2);
		
		Conta cc = new ContaCorrente(123, 321);
		lista.add(cc);
		
		System.out.println(lista);
		
		System.out.println("tamanho da lista: " + lista.size());
		
//		Conta ref = (Conta) lista.get(0);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		System.out.println("-----------------");
		
		for(Object ob : lista) {
			System.out.println(ob);
		}
		
	}

}
