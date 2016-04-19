package deletes;

import org.junit.Test;

import parametros.CadastroSindicato_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class SindicatoDeletar extends ContextFirefox{
	String url = "http://erg640cq:8080/Ergon/Administracao/ERGadm00048.tp";
	String sigla = CadastroSindicato_Parametros.getTxtSigla();
	String xpathSrc = "x-form-text x-form-field searchbox t-searchbox-value x-form-focus";
	
	@Test
	public void sindDeletar () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00048.tp");
		Utilizaveis.logarFabrica();
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
		
	}

}
