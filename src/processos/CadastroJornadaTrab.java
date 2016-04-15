package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.CadastroJornadaTrab_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroJornadaTrab extends ContextFirefox {
	@Test
	public void cadJornada () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00023.tp");
		
		Utilizaveis.logarCust();
		Utilizaveis.clicarNovo();
		
		WebElement cmpTxtJor = getDriver().findElement(By.id("txfeSigla"));
		cmpTxtJor.sendKeys(CadastroJornadaTrab_Parametros.getTxfeSigla());
		
		WebElement cmpNome = getDriver().findElement(By.id("txfeNome"));
		cmpNome.sendKeys(CadastroJornadaTrab_Parametros.getTxfeNome());
		
		WebElement cmpHoSem = getDriver().findElement(By.id("txfeHorasSem"));
		cmpHoSem.sendKeys(CadastroJornadaTrab_Parametros.getTxfeHorasSem());
		
		WebElement cmpHoMen = getDriver().findElement(By.id("txfeHoraMen"));
		cmpHoMen.sendKeys(CadastroJornadaTrab_Parametros.getTxfeHoraMen());
		
		Utilizaveis.clicarSalvar();
	}
	

}
