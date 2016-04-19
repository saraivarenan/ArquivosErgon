package deletes;

import org.junit.Test;

import parametros.CadastroEntesPrev_parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class DeleteEntesPrevi extends ContextFirefox {
	String sigla = CadastroEntesPrev_parametros.getTxtSigla();
	String xpathSrc = "x-form-text x-form-field searchbox t-searchbox-value x-form-focus";
	String xpathaba = "//span[contains(text(),'Planos previdenciários')]";
	String xpathBotaoDeletar = "//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	
	@Test
	public void deleteEntes () throws InterruptedException{
				
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00046.tp");
		Utilizaveis.logarFabrica();
		
		Utilizaveis.deletarRegistroOutrasAbas(xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00046.tp");
		Utilizaveis.tempo(2);
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
	}

}
