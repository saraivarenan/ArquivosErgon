package deletes;

import org.junit.Test;

import parametros.CadastroDePessoa_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class IngressEstatutario extends ContextFirefox {
	String xpathSrc= "x-form-text x-form-field searchbox";
	String sigla = CadastroDePessoa_Parametros.getTxtNome();
@Test
	public void ingressEst () throws InterruptedException{
	
	
	
	
	
	getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00182.tp");
	Utilizaveis.logarFabrica();
	Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
	
		
	}
	
}
