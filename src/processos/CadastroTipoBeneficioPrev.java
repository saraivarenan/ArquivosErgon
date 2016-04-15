package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.CadastroTipoBeneficioPrev_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroTipoBeneficioPrev extends ContextFirefox {
	@Test
	public void cadastroTpBenePrev () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00043.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		WebElement siglaPrev = getDriver().findElement(By.id("txtSigla"));
		siglaPrev.sendKeys(CadastroTipoBeneficioPrev_Parametros.getTxtSigla());
		
		WebElement descPrev = getDriver().findElement(By.id("txtNome"));
				descPrev.sendKeys(CadastroTipoBeneficioPrev_Parametros.getTxtNome());
		
		Utilizaveis.clicarSalvar();
		
		
	}

}
