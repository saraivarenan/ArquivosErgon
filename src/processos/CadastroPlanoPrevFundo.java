package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroPlanoPrevFundo extends ContextFirefox{
	
	@Test
	public void cadastroPlanoPrev () throws InterruptedException {
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00047.tp");
		
		Utilizaveis.logarCust();
		
		WebElement filtroPesquisa = getDriver().findElement(By.id("srcReg"));
		filtroPesquisa.sendKeys("Teste_auto");
		filtroPesquisa.sendKeys(Keys.TAB);
		
		//Aba Detalhes
		Utilizaveis.clicarNovo();
		
		WebElement drpSigla = getDriver().findElement(By.id("drpBenSigla"));
		Utilizaveis.buscaDrop(drpSigla, "Auto_Tipo_Bene_Prev - Auto_desc_bene_prev");
		
		Utilizaveis.clicarSalvar();
		
		Utilizaveis.tempo(3);
		//Aba Rentabilidade
		
		WebElement clickAbaRent = getDriver().findElement(By.xpath("//span[contains(text(),'Rentabilidade')]"));
		clickAbaRent.click();
		
		WebElement clickNovo = getDriver().findElement(By.xpath("//div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		clickNovo.click();
		
		WebElement datInicio = getDriver().findElement(By.id("txtRenIni"));
		datInicio.sendKeys("01012016");
		
		WebElement campRent = getDriver().findElement(By.id("txtRenRent"));
		campRent.sendKeys("10");
		
		Utilizaveis.tempo(3);
		WebElement clickSalvar =  getDriver().findElement(By.xpath("//div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		clickSalvar.click();
		
		Utilizaveis.tempo(5);
		
	}

}
