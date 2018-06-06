package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//import br.com.bytebank.banco.modelo.*;

public class TesteObject {

	public static void main(String[] args) throws SaldoInsuficienteException{
					
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 55);
		
		System.out.println(cc);
		System.out.println(cp);
	}
}
