package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Liquidacao {
	public static void main(String[] args) {
		
		String anoEmpenho;
		String codUnidade;
		String numEmpenho;
		String numLiquidacao;
		
		String DtDia;
		String DtMes;
		String DtAno;
		String dtLiquidacao;
		
		String valorLiquidacao;
		String tipoDocumento;
		String numeroDocumento;
		String historico;
		String fontRecurso;
		
		String cidade = "itaiba";
		String ano = "2021";
		String mesImport = "05";
		String codEntidadeImport = "077002";


		String path = "C:\\temp\\"+ cidade + "\\" + ano + "\\"  + mesImport +"\\" + codEntidadeImport + mesImport + ano +"Liquidacao.txt";

		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			System.out.println("INSERT INTO `liquidacao`(`ano_empenho`, `mes_import`, `unidadeOrcamentaria_cod_unidade_orcament`, `empenhos_cod_empenho`, `cod_liquidacao`, `data_liquidacao`, `valor_liquidacao`, `tipo_doc`, `num_doc`, `serie_doc`, `uf_doc`, `historico_liquidacao`, `relacionamentoFonteRecurso_cod_font_recurso`) VALUES");
			
			
			while (line != null) {
				
				anoEmpenho		= line.substring(6, 10).trim();
				codUnidade		= line.substring(10, 20).trim();
				numEmpenho		= line.substring(20, 27).trim();
				numLiquidacao	= line.substring(27, 34).trim();
				
				DtDia= line.substring(34, 36).trim();
				DtMes= line.substring(36, 38).trim();
				DtAno= line.substring(38, 42).trim();
				
				dtLiquidacao	= DtAno + "-"+DtMes+"-"+DtDia;
				
				valorLiquidacao	= line.substring(42, 58).trim();
				tipoDocumento	= line.substring(58, 59).trim();
				numeroDocumento	= line.substring(59, 103).trim();
				historico		= line.substring(103, 613).trim();
				fontRecurso 	= line.substring(613, 619).trim();
				
				
				System.out.printf("("+ "'" + anoEmpenho + "'" + ",");
				System.out.printf("'" + mesImport + "'" + ",");
				System.out.printf("'" + codUnidade + "'" + ",");		
				System.out.printf("'" + numEmpenho + "'" + ",");		
				System.out.printf("'" + numLiquidacao + "'" + ",");
				System.out.printf("'" + dtLiquidacao + "'" + ",");
				System.out.printf("'" + valorLiquidacao + "'" + ",");	
				System.out.printf("'" + tipoDocumento + "'" + ",");
				System.out.printf("'" + "SERIE" + "'" + ",");
				System.out.printf("'" + "PE" + "'" + ",");
				System.out.printf("'" + numeroDocumento + "'" + ",");	
				System.out.printf("'" + historico + "'" + ",");	
				System.out.println("'" + fontRecurso + "'" +"),");
				
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
