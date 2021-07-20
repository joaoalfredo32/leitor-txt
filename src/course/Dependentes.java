package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Dependentes {
	public static void main(String[] args) throws ParseException {
		//String dataAdmissao;
		String dataNascimento;
		//String empresa;
		//String Item;
		String registro;

		String path = "C:\\temp\\DEPENDENTES.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			

			while (line != null) {
				
				dataNascimento = line.substring(0, 8).trim();
				registro = line.substring(10, 16).trim();
				
				System.out.println("Data de Nascimento: " + dataNascimento);
				System.out.println("Registro: " + registro);
				
				/*
				System.out.printf("update movimento set VALOR = '" + valor + "', REFHOLLERIT = '6/12'  WHERE referencia = '514' and evento = '912' and empresa = '001' and registro = '" + registro +"';");
				System.out.println("");
				*/
								
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
