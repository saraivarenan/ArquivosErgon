package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroTabVencimento extends ContextFirefox {
	
	 @Test
	 public void instanciarBrownser() throws InterruptedException {
		 getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00014.tp");
		 Utilizaveis.logarCust();
	
		 Utilizaveis.clicarNovo();

	  WebElement inputTabela = getDriver().findElement(By.xpath("//input[@name='tabela']"));
	  WebElement inputNome = getDriver().findElement(By.xpath("//input[@name='nome']"));
	  WebElement inputLabel =getDriver().findElement(By.xpath("//input[@name='label']"));

	  inputTabela.sendKeys("VENC-AUTO");
	  inputNome.sendKeys("VENC-AUTO");
	  inputLabel.sendKeys("BASE");
	  Utilizaveis.clicarSalvar();
	
	  WebElement abaReferencias = getDriver()
	    .findElement(By.xpath("//div[7]/div[1]/div[1]/ul/li[3]/a[2]/em/span/span"));
	  abaReferencias.click();
	 Utilizaveis.tempo(3);

	
	  WebElement clicarNovoReferencias = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
	  clicarNovoReferencias.click();
	  Utilizaveis.tempo(3);

	  WebElement inputOrdem = getDriver().findElement(By.xpath("//input[@name='ordem']"));
	  inputOrdem.sendKeys("1");
	  Utilizaveis.tempo(2);
	  
	  WebElement inputNomeAba2 = getDriver().findElement(By.id("txtRefNom"));
	  inputNomeAba2.sendKeys("Ref_Auto");
	  Utilizaveis.tempo(2);

	
	  WebElement salvarAba2 = getDriver().findElement(By.xpath("//div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
	  salvarAba2.click();
	  Utilizaveis.tempo(2);
	 }

}
