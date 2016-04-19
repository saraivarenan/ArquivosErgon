package deletes;

import org.junit.Test;

import parametros.CadastroCargos_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CargosExcluir extends ContextFirefox {
	String url = "http://erg640cq:8080/Ergon/Administracao/ERGadm00015.tp";
	String xpathSrc = "x-form-text x-form-field textbox";
	String sigla = CadastroCargos_Parametros.getInputCargo();
	String xpathaba = "//span[contains(text(),'Histórico')]";
	String xpathBotaoDeletar = "//div[4]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	String xpathAba2BtnExcluir = "//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	@Test
	public void cargs () throws InterruptedException{
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00015.tp");
		Utilizaveis.logarFabrica();
		
	Utilizaveis.deletarRegistroOutrasAbas( xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
	getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00015.tp");
	Utilizaveis.deletarRegistroOutrasAbas( xpathaba, xpathAba2BtnExcluir, sigla, xpathSrc);
	getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00015.tp");
	Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa( sigla, xpathSrc);
	
		
	}
	
}
