package deletes;

import org.junit.Test;

import parametros.CadastroTipodeVinculo_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class TipoDeVinculoDeletar extends ContextFirefox {
	String xpathaba = "//span[contains(text(),'Validações')]";
	String xpathBotaoDeletar = "//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	String sigla = CadastroTipodeVinculo_Parametros.getInputSigla();
	String xpathSrc ="x-form-text x-form-field textbox";
	@Test
	public void tipoVincDelete() throws InterruptedException{
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00002.tp");
		Utilizaveis.logarFabrica();
		
		Utilizaveis.deletarRegistroOutrasAbas(xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00002.tp");
		Utilizaveis.tempo(2);
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
		
	}
	

}
