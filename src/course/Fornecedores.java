package course;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Fornecedores {
	public static void main(String[] args) {
		

		
		String cpfCnpj;
		String nomeRazao;
		String tipoCredor;
		String estado;
		String municipio;
		
		String cidade = "itaiba";
		String ano = "2021";
		String mesImport = "05";
		String codEntidadeImport = "077002";



		String path = "C:\\temp\\"+ cidade + "\\" + ano + "\\"  + mesImport +"\\" + codEntidadeImport + mesImport + ano +"Fornecedores.txt";
	
	//	try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
			
						
			String line = br.readLine();
			
			System.out.println("INSERT INTO `fornecedor`(`cpf_cnpj_fornecedor`, `nome`, `tipoCredor_cod_credor`, `uf_fornecedor`, `municipio`) VALUES");
			
			while (line != null) {
				
				cpfCnpj = line.substring(6, 20).trim();
				nomeRazao = line.substring(20,100).trim();
				tipoCredor = line.substring(100, 101).trim();
				estado = line.substring(101, 103).trim();
				municipio = line.substring(103, 163).trim();
				
				System.out.printf("("+ "'" + cpfCnpj + "'" + ",");
				System.out.printf("'" + nomeRazao + "'" + ",");
				System.out.printf("'" + tipoCredor + "'" + ",");
				System.out.printf("'" + estado + "'" + ",");
				System.out.println("'" + municipio + "'" +"),");
				
				line = br.readLine();
			}
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}
}
