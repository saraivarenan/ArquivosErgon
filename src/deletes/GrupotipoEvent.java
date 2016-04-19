package deletes;

import org.junit.Test;

import parametros.CadastroGruposTiposEvento_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class GrupotipoEvent extends ContextFirefox {

	String sigla = CadastroGruposTiposEvento_Parametros.getInputGrupo();
	String xpathSrc = "x-form-text x-form-field textbox";
	@Test
	public void grpTipoEvt () throws InterruptedException{
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00029.tp");
		Utilizaveis.logarFabrica();
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa( sigla, xpathSrc);
		
	}

}
