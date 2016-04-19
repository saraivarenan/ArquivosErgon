package deletes;

import org.junit.Test;

import parametros.RegimeJuridico_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class DeletarRegimejurid extends ContextFirefox {
	String sigla = RegimeJuridico_Parametros.getInputSigla();
	String xpathSrc = "x-form-text x-form-field textbox";
	@Test
	public void deleteRegJurid () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00007.tp");
		Utilizaveis.logarFabrica();
	
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
		
	}
	

}
