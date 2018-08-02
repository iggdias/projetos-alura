package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeituraEscritaGenerica {

	public static void main(String[] args) throws IOException {
	
		/*
		 * Fluxo de entrada
		 */
		InputStream is =  System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		/*
		 * Fluxo de saída
		 */
		OutputStream os = System.out; //new FileOutputStream("lorem ipsum2.txt");
		Writer osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null && linha.isEmpty() != true) {

			//System.out.println("Copiando a linha: " + linha + " ...");	
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();			
		}
			System.out.println("Fim do arquivo!");
		
		br.close();
		bw.close();
	}

}
