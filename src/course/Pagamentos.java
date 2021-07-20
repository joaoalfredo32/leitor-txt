package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pagamentos {
	public static void main(String[] args) {
		
		String anoEmpenho;
		String codUnidade;
		String numEmpenho;
		String numParcela;
		
		String DtDia;
		String DtMes;
		String DtAno;
		String dtPagamento;
		
		String cidade = "itaiba";
		String ano = "2021";
		String mesImport = "05";
		String codEntidadeImport = "077002";


		String path = "C:\\temp\\"+ cidade + "\\" + ano + "\\"  + mesImport +"\\" + codEntidadeImport + mesImport + ano +"Pagamentos.txt";

		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			System.out.println("INSERT INTO `pagamentos`(`ano_empenho`, `mes_import`, `unidadeOrcamentaria_cod_unidade_orcament`, `empenhos_cod_empenho`, `numero_pagamento`, `data_pagamento`) VALUES");
			
			while (line != null) {
				
				anoEmpenho 	= line.substring(6,10).trim();
				codUnidade  = line.substring(10,20).trim();
				numEmpenho  = line.substring(20,27).trim();
				numParcela  = line.substring(27,34).trim();
				
				DtDia= line.substring(34,36).trim();
				DtMes= line.substring(36,38).trim();
				DtAno= line.substring(38,42).trim();
				dtPagamento = DtAno + "-"+DtMes+"-"+DtDia;
				
				System.out.printf("("+ "'" + anoEmpenho + "'" + ",");
				System.out.printf("'" + mesImport + "'" + ",");
				System.out.printf("'" + codUnidade + "'" + ",");
				System.out.printf("'" + numEmpenho + "'" + ",");
				System.out.printf("'" + numParcela + "'" + ",");
				System.out.println("'" + dtPagamento + "'" +"),");
				
				line = br.readLine();
				
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
