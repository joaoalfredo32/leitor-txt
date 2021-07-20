package course;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReceitaExtra {
	public static void main(String[] args) {
		

		
		String valor;
		String codReceita;
		
		String cidade = "tupanatinga";
		String ano = "2020";
		String mesImport = "05";
		String codEntidadeImport = "161002";
		String descricao = "Sem descrição";



		String path = "C:\\temp\\"+ cidade + "\\" + ano + "\\"  + mesImport +"\\" + codEntidadeImport + mesImport + ano +"ReceitaExtra.txt";
	
	//	try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
			
						
			String line = br.readLine();
			
		//	System.out.println("INSERT INTO `fornecedor`(`cpf_cnpj_fornecedor`, `nome`, `tipoCredor_cod_credor`, `uf_fornecedor`, `municipio`) VALUES");
			
			while (line != null) {
				
				valor = line.substring(8, 23).trim();
				codReceita = line.substring(30,37).trim();
				
				String buscaCodigo = codReceita;
		        switch (buscaCodigo) {
		            case "0000051":
		                descricao = "Serviços da Dívida a Pagar";
		                break;
		            case "0000052":
		            	descricao = "Débitos de Tesouraria";
		                break;
		            case "0000053":
		            	descricao = "Consignações - ISS";
		                break;
		            case "0000054":
		            	descricao = "Consignações - IR";
		                break;
		            case "0000055":
		            	descricao = "Consignações - Outras";
		                break;
		            case "0000056":
		            	descricao = "Depósitos";
		                break;
		            case "0000057":
		            	 descricao = "Outras Operações";
		                break;
		            case "0000061":
		            	 descricao = "Restos a Pagar – Educação (FUNDEB)";
		                break;
		            case "0000062":
		            	 descricao = "Restos a Pagar – Educação (Demais)";
		                break;
		            case "0000063":
		            	 descricao = "Restos a Pagar – Câmara Municipal";
		                break;
		            case "0000064":
		            	 descricao = "Restos a Pagar – Demais";
		                break;
		            case "0000065":
		            	 descricao = "Consignações – INSS (Saúde)";
		                break;
		            case "0000066":
		            	 descricao = "Consignações – INSS (FUNDEB 60%)";
		                break;
		            case "0000067":
		            	 descricao = "Consignações – INSS (Educação – demais)";
		                break;
		            case "0000068":
		            	 descricao = "Consignações – INSS (Câmara)";
		                break;
		            case "0000069":
		            	 descricao = "Consignações – INSS (Demais)";
		                break;
		            case "0000070":
		            	 descricao = "Consignações Previdenciárias – Saúde";
		                break;
		            case "0000071":
		            	 descricao = "Consignações – Previdência Própria (FUNDEB 60%)";
		                break;
		            case "0000072":
		            	 descricao = "Consignações – Previdência Própria (Educação – demais)";
		                break;
		            case "0000073":
		            	 descricao = "Consignações – Previdência Própria (Câmara)";
		                break;
		            case "0000074":
		            	 descricao = "Consignações – Previdência Própria (Demais)";
		                break;
		            case "0000076":
		            	 descricao = "Outras transferências";
		                break;
		            case "0000077":
		            	 descricao = "Consignações Empréstimos";
		                break;
		            case "0000078":
		            	 descricao = "Consignações Pensões Alimentícias";
		                break;
		            default :
		            	descricao = "Este não é um código válido!";
		         }
				
				
				System.out.printf("("+ "'" + valor + "'" + ",");
				System.out.printf("'" + codReceita + " - " + descricao +"'" +"),");

				line = br.readLine();
			}
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}
}
