package deletes;

import org.junit.Test;

import parametros.CadastroJornadaTrab_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class JornadaDeletar extends ContextFirefox {
	String url = "http://erg640cq:8080/Ergon/Administracao/ERGadm00023.tp";
	String sigla = CadastroJornadaTrab_Parametros.getTxfeSigla();
	String xpathSrc = "x-form-text x-form-field textbox";
	
@Test
	public void deletJorn () throws InterruptedException{
	getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00023.tp");
	Utilizaveis.logarFabrica();
	
	Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
		
	}
}
