package deletes;

import org.junit.Test;

import parametros.CadastroTipoBeneficioPrev_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class DeleteTipoBenefPrev extends ContextFirefox {
	String sigla = CadastroTipoBeneficioPrev_Parametros.getTxtSigla() ;
	String xpathSrc = "x-form-text x-form-field searchbox t-searchbox-value x-form-focus";
	
	@Test
	public void deletarTipBenPrev () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00043.tp");
		Utilizaveis.logarFabrica();
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sigla, xpathSrc);
		
	}

}
