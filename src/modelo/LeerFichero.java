package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {
		
		Scanner miScan = new Scanner(System.in);
		System.out.println("Path: ");
		String pat = miScan.nextLine();
		
		String texto = read(pat);
		System.out.println(texto);
		
		miScan.close();
		
	}
	
	private static String read(String path) {
	
		BufferedReader bR = null;
		StringBuilder contenido = new StringBuilder();
		
		try {
			
			bR = new BufferedReader(new FileReader(path));
			String linea;
			
			while((linea = bR.readLine()) != null) {
				
				contenido.append(linea).append("\n");
				
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}finally {
			
			try {
				
				if(bR != null) bR.close();
				
			}catch(Exception ex) {
				
				ex.printStackTrace();
				
			}
			
		}
		
		return contenido.toString();
		
	}
	
	private static String write(String path, String toAdd) {
		
		BufferedReader bR = null;
		BufferedWriter bW = null;
		StringBuilder sB = new StringBuilder();
		
		try {
			
			bR = new BufferedReader(new FileReader(path));
			bW = new BufferedWriter(new FileWriter(path, true));
			
		}catch(IOException e) {
			
			
			
		}
		
		return "";
		
	}

}
