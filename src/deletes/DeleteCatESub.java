package deletes;

import org.junit.Test;

import parametros.CadastroCategoriaSub_Paramentros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class DeleteCatESub extends ContextFirefox {
	String sigla = CadastroCategoriaSub_Paramentros.getTxtCatSigla() ;
	String xpathSrc = "x-form-text x-form-field textbox";
	String xpathBotaoDeletar = "//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	String xpathaba = "//span[contains(text(),'Subcategorias')]";
	
	@Test
	public void deletCatSub () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00008.tp");
		Utilizaveis.logarFabrica();
		
		Utilizaveis.deletarRegistroOutrasAbas(xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00008.tp");
		Utilizaveis.tempo(2);
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
	}

}
