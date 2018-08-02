package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
	
		/*
		 * Fluxo de entrada com arquivo
		 */
		FileInputStream fis = new FileInputStream("lorem ipsum.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String texto = br.readLine();
	
		System.out.println(texto);
		
		br.close();
	}

}
