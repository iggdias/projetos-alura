package br.com.alura.java.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		 
		String s = "E";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length);
		System.out.println(Integer.toBinaryString(bytes[0]));
		
		bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length);
		System.out.println(Integer.toBinaryString(bytes[0]));
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length);
		System.out.println(Integer.toBinaryString(bytes[0]));
		
		System.out.println("--------------");
		
		Charset utf8 = StandardCharsets.US_ASCII;
		String s1 = "13º Órgão Oficial";
		
		System.out.println("codepoint do Ó: " + s1.codePointAt(4));
		
		bytes = s1.getBytes(utf8);
		System.out.println(bytes.length);
		String s2 = new String(bytes, utf8);
		System.out.println(s2);
		bytes = s1.getBytes(utf8);
		System.out.println(bytes.length);
		
		System.out.println("codepoint do Ó: " + s2.codePointAt(4));
		
	}

}
