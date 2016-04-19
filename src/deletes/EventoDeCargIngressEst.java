package deletes;

import org.junit.Test;

import parametros.CadastroDePessoa_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class EventoDeCargIngressEst extends ContextFirefox {
	@Test
	public void eventCargo () throws InterruptedException{
		
		String sig = CadastroDePessoa_Parametros.getTxtNome();

		String xpath = "x-form-text x-form-field searchbox x-form-focus";
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00156.tp");
		Utilizaveis.logarFabrica();
		
		
		Utilizaveis.deletarRegistroAbaDetalhesSearchPesquisa(sig, xpath);
	}

}
