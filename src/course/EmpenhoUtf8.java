package course;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class EmpenhoUtf8 {

	public static void main(String[] args) {

		String anoEmissao;
		String codEntidade;
		String codFuncao;
		String codSubFuncao;
		String codPrograma;
		String codAcao;
		String IdentAcao;
		String codCatEconomica;
		String codGrupNatDesp;
		String codModalAplicacao;
		String ElemDespDotacao;
		String codSubEleDesp;
		String modLicitacao;
		String numeroEmpenho;
		String tipoEmpenho;
		
		String DtDia;
		String DtMes;
		String DtAno;
		String DtEmpenho;
		
		String valorEmpenho;
		String historico;
		String cpfCnpj;
		String numProcedLicitatorio;
		String codFontRecurso;
		String codElemDespEmp;
		
		String cidade = "itaiba";
		String ano = "2021";
		String mesImport = "05";
		String codEntidadeImport = "077002";



		String path = "C:\\temp\\"+ cidade + "\\" + ano + "\\"  + mesImport +"\\" + codEntidadeImport + mesImport + ano +"Empenhos.txt";

		//BufferedReader myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
			
			String line = br.readLine();
			
			System.out.println("INSERT INTO `empenhos` (`ano_empenho`, `mes_import`, `unidadeOrcamentaria_cod_unidade_orcament`, `codigoFuncao_cod_funcao`, `codigoSubFuncao_cod_sub_funcao`, `programas_cod_programa`, `acao_cod_acao`, `tipoAcao_cod_indent_acao`, `categoriaEconomica_cod_categoria`, `grupoNaturezaDespesa_cod_grupo_natureza`, `modalidade_aplicacao_cod_modalidade`, `elementoDespesa_cod_elementoDesp`, `subElemento_cod_subElemento`, `modalidadeLicitacao_cod_modalidade_licitacao`, `cod_empenho`, `tipoEmpenho_cod_tipo_empenho`, `data_emissao_empenho`, `valor_empenho`, `historico_empenho`, `fornecedor_cpf_cnpj_fornecedor`, `num_processo_licitacao`, `relacionamentoFonteRecurso_cod_font_recurso`, `elementoDespesaEmpenho_cod_element_desp_empenho`) VALUES");
			
			while (line != null) {

				anoEmissao = line.substring(6, 10).trim();
				codEntidade = line.substring(10, 20).trim();
				codFuncao = line.substring(20, 22).trim();
				codSubFuncao = line.substring(22, 25).trim();
				codPrograma = line.substring(25, 29).trim();
				codAcao = line.substring(29, 35).trim();
				IdentAcao = line.substring(35, 36).trim();
				codCatEconomica = line.substring(42, 43).trim();
				codGrupNatDesp = line.substring(43, 44).trim(); 
				codModalAplicacao = line.substring(44, 46).trim();
				ElemDespDotacao = line.substring(46, 48).trim();
				codSubEleDesp   = line.substring(48, 51).trim();
				modLicitacao   = line.substring(51, 53).trim();
				numeroEmpenho = line.substring(53, 60).trim();
				tipoEmpenho  = line.substring(60, 61).trim();
				
				
				DtDia= line.substring(61, 63).trim();
				DtMes= line.substring(63, 65).trim();
				DtAno= line.substring(65, 69).trim();
				DtEmpenho   = DtAno + "-"+DtMes+"-"+DtDia;
				
				valorEmpenho = line.substring(69, 85).trim();
				historico = line.substring(85, 595).trim();
				cpfCnpj = line.substring(595, 609).trim();
				numProcedLicitatorio = line.substring(609, 618).trim();
				codFontRecurso = line.substring(618, 624).trim();
				codElemDespEmp = line.substring(635, 637).trim();
				

				System.out.printf("("+ "'" + anoEmissao + "'" + ",");
				System.out.printf("'" + mesImport + "'" + ",");
				System.out.printf("'" + codEntidade + "'" + ",");
				System.out.printf("'" + codFuncao + "'" + ",");
				System.out.printf("'" + codSubFuncao + "'" + ",");
				System.out.printf("'" + codPrograma + "'" + ",");
				System.out.printf("'" + codAcao + "'" + ",");
				System.out.printf("'" + IdentAcao + "'" + ",");
				System.out.printf("'" + codCatEconomica + "'" + ",");
				System.out.printf("'" + codGrupNatDesp + "'" + ",");
				System.out.printf("'" + codModalAplicacao + "'" + ",");
				System.out.printf("'" + ElemDespDotacao + "'" + ",");
				System.out.printf("'" + codSubEleDesp + "'" + ",");
				System.out.printf("'" + modLicitacao + "'" + ",");
				System.out.printf("'" + numeroEmpenho + "'" + ",");
				System.out.printf("'" + tipoEmpenho + "'" + ",");
				System.out.printf("'" + DtEmpenho + "'" + ",");
				System.out.printf("'" + valorEmpenho + "'" + ",");
				System.out.printf("'" + historico + "'" + ",");
				System.out.printf("'" + cpfCnpj + "'" + ",");
				System.out.printf("'" + numProcedLicitatorio + "'" + ",");
				System.out.printf("'" + codFontRecurso + "'" + ",");
				System.out.println("'" + codElemDespEmp + "'" +"),");
				

				line = br.readLine();

			}
		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());

		}
	}
}
