package deletes;

import org.junit.Test;

import parametros.CadastroTabVencimento_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class TabVencimentoDeletar extends ContextFirefox {
	
	String xpathaba = "//span[contains(text(),'Referências')]";
	String xpathBotaoDeletar = "//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	String sigla = CadastroTabVencimento_Parametros.getInputNome();
	String xpathSrc = "x-form-text x-form-field textbox";
	
	
	

	@Test
public void tabVenc () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00014.tp");
		Utilizaveis.logarFabrica();
			
		Utilizaveis.deletarRegistroOutrasAbas( xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00014.tp");
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa( sigla, xpathSrc);
	
}

}
