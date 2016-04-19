package deletes;

import org.junit.Test;

import parametros.CadastroPlanoPrevFundo_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class DeletePlanoPrevFundo extends ContextFirefox{
	String sigla= CadastroPlanoPrevFundo_Parametros.getSrcReg();
	String xpathSrc = "x-form-text x-form-field searchbox t-searchbox-value x-form-focus";
	String xpathaba = "//span[contains(text(),'Rentabilidade')]";
	String xpathBotaoDeletar = "//div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	
	@Test
	public void deletePlanPvFundo () throws InterruptedException{
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00047.tp");
		Utilizaveis.logarFabrica();
		
		Utilizaveis.deletarRegistroOutrasAbas(xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00047.tp");
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
		
		
		
	}

}
