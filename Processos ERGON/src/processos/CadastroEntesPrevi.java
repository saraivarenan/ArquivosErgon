package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroEntesPrevi extends ContextFirefox {
	@Test
	public void cadastroEnte () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00046.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		WebElement siglaEnte = getDriver().findElement(By.id("txtSigla"));
		siglaEnte.sendKeys("Teste_auto");
		
		WebElement descEnte = getDriver().findElement(By.id("txtNome"));
		descEnte.sendKeys("Teste_autoDesc");
		
		Utilizaveis.tempo(2);
		Utilizaveis.clicarSalvar();
	
		WebElement clickAbaPp =getDriver().findElement(By.xpath("//span[contains(text(),'Planos previdenciários')]"));
		clickAbaPp.click();
		
		Utilizaveis.tempo(2);
		WebElement clickNovo = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		clickNovo.click();
		
		WebElement sigPlano = getDriver().findElement(By.id("txtPlanSigla"));
		sigPlano.sendKeys("teste_auto_entePrevi");
		
		WebElement dtInicio = getDriver().findElement(By.id("txtPlanIni"));
		dtInicio.sendKeys("01012016");
		
		
		WebElement drpSit = getDriver().findElement(By.id("drpPlanSitu"));
		Utilizaveis.buscaDrop(drpSit, "Ativo");
			Utilizaveis.tempo(2);
		
		WebElement clickSalvar = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		clickSalvar.click();
		Utilizaveis.tempo(2);
		
	}

}
