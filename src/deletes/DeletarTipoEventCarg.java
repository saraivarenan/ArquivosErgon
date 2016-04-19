package deletes;

import org.junit.Test;

import parametros.CadastroTipoEventoCargo_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class DeletarTipoEventCarg extends ContextFirefox {
	String url = "http://erg640cq:8080/Ergon/Administracao/ERGadm00028.tp";
	String xpathaba = "//span[contains(text(),'Tipos de cargos')]";
	String xpathAba2 = "//span[contains(text(),'Espécies evento')]";
	
	String xpathBotaoDeletar = "//div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	String xpathBotaoDeletarAba2 = "//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	String sigla = CadastroTipoEventoCargo_Parametros.getTxtNomeevt();
	String xpathSrc = "x-form-text x-form-field textbox";
	
	
	@Test
	public void delTipoevent () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00028.tp");
		Utilizaveis.logarFabrica();
		
		//Aba Tipos de Cargos
		Utilizaveis.deletarRegistroOutrasAbas( xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00028.tp");
		//Aba Especie evento
		Utilizaveis.deletarRegistroOutrasAbas( xpathAba2, xpathBotaoDeletarAba2, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00028.tp");
		//Detalhes
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa( sigla, xpathSrc);
	}

	
}
