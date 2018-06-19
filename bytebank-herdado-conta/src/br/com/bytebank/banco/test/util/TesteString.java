package br.com.bytebank.banco.test.util;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Igor";
		String outroNome = new String("Dias");
		
		System.out.println("nome = " + nome + ", outro nome = " + outroNome);
		System.out.println(nome.replace("g", "x").toUpperCase() );
		
		System.out.println(outroNome.charAt(2));
		
		System.out.println(nome.indexOf("gor"));
		
		System.out.println(outroNome.substring(0));
		
		for(int i = 0; i < outroNome.length(); i++) {
			System.out.println(outroNome.charAt(i));
		}
	}

}
