package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorFolha {

	public static void main(String[] args) {
		String valor;
		String registro;

		




		String path = "C:\\temp\\folha.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			

			while (line != null) {
				
				valor = line.substring(1, 9).trim();
				registro = line.substring(10, 16).trim();
				
/*
				System.out.printf("update bases set totalproventos = '" + valor + "', liquido = '" + valor + "', adto13eventual = '" + valor + "' where empresa = '001' and referencia ='514' and registro = '" );
				System.out.printf(registro + ";");
				System.out.println("");
				
				*/
				/*
				System.out.printf("update movimento set VALOR = '" +valor);
				System.out.printf(registro + ";");
				System.out.println("");
				*/
				
				/*
				System.out.printf("update bases set totalproventos = '" + valor + "', liquido = '" + valor + "', adto13eventual = '" + valor + "' where empresa = '001' and referencia ='514' and registro = '" + registro+"';");
				System.out.println("");
				*/
				
				System.out.printf("update movimento set VALOR = '" + valor + "', REFHOLLERIT = '6/12'  WHERE referencia = '514' and evento = '912' and empresa = '001' and registro = '" + registro +"';");
				System.out.println("");

								
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
