package deletes;

import org.junit.Test;

import parametros.PerfilEventoUsuario_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class PerfilEventoUsu extends ContextFirefox {
	
	String xpathBotaoDeletar = "//div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	String xpathaba= "//span[contains(text(),'Padrões de acesso')]";
	String sigla = PerfilEventoUsuario_Parametros.getCmpSigla();
	String xpathSrc = "x-form-text x-form-field searchbox";
	String aba = "//span[contains(text(),'Tipos de evento')]";
	String xpathBotaoDeletarAba2 = "//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[2]/td[2]/em/button";
	
	@Test
	public void perfilevent () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00030.tp");
		Utilizaveis.logarFabrica();
		
		Utilizaveis.deletarRegistroOutrasAbas( xpathaba, xpathBotaoDeletar, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00030.tp");
		Utilizaveis.deletarRegistroOutrasAbas( aba, xpathBotaoDeletarAba2, sigla, xpathSrc);
		getDriver().navigate().to("http://erg640cq:8080/Ergon/Administracao/ERGadm00030.tp");
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa( sigla, xpathSrc);
		
		
		
	}

}
