package deletes;

import org.junit.Test;

import parametros.FromasProvimentoEspeciesEventoCargos_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class FormasProvDeletar extends ContextFirefox{
	String url = "http://erg640cq:8080/Ergon/Administracao/ERGadm00022.tp";
	String xpathaba = "//span[contains(text(),'Transações válidas')]";
	String xpathabaAba2 = "//span[contains(text(),'Gerar validações')]";
	String xpathBotaoDeletar = "//div[4]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button"; 
	String xpathBtnDelAba2 = "//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	String sigla = FromasProvimentoEspeciesEventoCargos_Parametros.getInputSigla();
	String xpathSrc = "x-form-text x-form-field textbox"; 
	@Test
	public void formProv () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00022.tp");
		Utilizaveis.logarFabrica();
		
	//	Utilizaveis.deletarRegistroOutrasAbas( xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
	//	getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00002.tp");
		Utilizaveis.tempo(3);
		Utilizaveis.deletarRegistroOutrasAbas( xpathabaAba2, xpathBtnDelAba2, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00002.tp");
		Utilizaveis.tempo(3);
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa( sigla, xpathSrc);
	}
}
