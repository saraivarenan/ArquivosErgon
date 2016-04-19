package deletes;

import org.junit.Test;

import parametros.CadastroDePessoa_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class VinculosFuncIngressEst extends ContextFirefox {
	
	String sigla = CadastroDePessoa_Parametros.getTxtNome();
	String xpathSrc= "x-form-text x-form-field searchbox x-form-focus";
	
	
	@Test
	public void vincFunc () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00229.tp");
		Utilizaveis.logarFabrica();
		

		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa( sigla, xpathSrc);
	}

}
