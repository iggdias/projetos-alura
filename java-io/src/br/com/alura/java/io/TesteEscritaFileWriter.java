package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
	
		/*
		 * Fluxo de saída com arquivo
		 */
//		OutputStream os = new FileOutputStream("lorem ipsum2.txt");
//		Writer osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);

		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem ipsum2.txt"));
		
		bw.write("igor lindao");
		bw.newLine();
		bw.write("demais da conta");
				
		bw.close();
	}

}
