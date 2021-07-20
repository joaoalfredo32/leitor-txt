package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ItemPagamentos {
	public static void main(String[] args) {
		
		String anoEmpenho;
		String codUnidade;
		String numEmpenho;
		String numParcela;
		String valorPago;
		String numConta;
		String numCheque;
		String numDoc;
		String codBanco;
		String codAgencia;
		String numContaCred;
		String codFontRecurso;
		String tipoConta;
		String numSequencial;
		
		String cidade = "itaiba";
		String ano = "2021";
		String mesImport = "05";
		String codEntidadeImport = "077002";



		String path = "C:\\temp\\"+ cidade + "\\" + ano + "\\"  + mesImport +"\\" + codEntidadeImport + mesImport + ano +"ItemPagamento.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			System.out.println("INSERT INTO `itempagamento`(`ano_empenho`, `mes_import`, `unidadeOrcamentaria_cod_unidade_orcament`, `empenhos_cod_empenho`, `pagamentos_numero_pagamento`, `valor_pagamento`, `num_conta_bancaria`, `num_cheque`, `num_doc_debito_automatic`, `cod_banco_credito`, `cod_agencia_credito`, `num_conta_banco_credito`, `relacionamentoFonteRecurso_cod_font_recurso`, `cod_tipo_conta_bancaria`, `num_sequencial_pagamento`) VALUES");
			
			while (line != null) {
				
				anoEmpenho = line.substring(6, 10).trim();
				codUnidade = line.substring(10, 20).trim();
				numEmpenho = line.substring(20, 27).trim();
				numParcela = line.substring(27, 34).trim();
				valorPago = line.substring(34, 50).trim();
				numConta = line.substring(50, 62).trim();
				numCheque = line.substring(62, 68).trim();
				numDoc = line.substring(68, 79).trim();
				codBanco = line.substring(79, 82).trim();
				codAgencia = line.substring(82, 88).trim();
				numContaCred = line.substring(88, 100).trim();
				codFontRecurso = line.substring(100, 106).trim();
				tipoConta = line.substring(106, 107).trim();
				numSequencial = line.substring(107, 114).trim();

				System.out.printf("("+ "'" + anoEmpenho + "'" + ",");
				System.out.printf("'" + mesImport + "'" + ",");
				System.out.printf("'" + codUnidade + "'" + ",");
				System.out.printf("'" + numEmpenho + "'" + ",");
				System.out.printf("'" + numParcela + "'" + ",");
				System.out.printf("'" + valorPago + "'" + ",");
				System.out.printf("'" + numConta + "'" + ",");
				System.out.printf("'" + numCheque + "'" + ",");
				System.out.printf("'" + numDoc + "'" + ",");
				System.out.printf("'" + codBanco + "'" + ",");
				System.out.printf("'" + codAgencia + "'" + ",");
				System.out.printf("'" + numContaCred + "'" + ",");
				System.out.printf("'" + codFontRecurso + "'" + ",");
				System.out.printf("'" + tipoConta + "'" + ",");
				System.out.println("'" + numSequencial + "'" +"),");
								
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}