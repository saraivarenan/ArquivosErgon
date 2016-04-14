package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroCategoriaSub extends ContextFirefox{
	
	@Test
	public void cadastroCateSub () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00008.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		WebElement siglacmp = getDriver().findElement(By.id("txtCatSigla"));
		siglacmp.sendKeys("Teste_Auto");
		
		WebElement descCate = getDriver().findElement(By.id("txtCatNome"));
				descCate.sendKeys("Teste_Auto_Desc");
			
		Utilizaveis.clicarSalvar();
		
		Utilizaveis.tempo(2);
		
		WebElement clickSubCat = getDriver().findElement(By.xpath("//span[contains(text(),'Subcategorias')]"));
		clickSubCat.click();
		Utilizaveis.tempo(3);
		
		WebElement btnNOvoAba = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		btnNOvoAba.click();   
		Utilizaveis.tempo(1);
		
				WebElement siglaSubCat = getDriver().findElement(By.id("txtSubCatSigla"));
		siglaSubCat.sendKeys("Teste_Auto_SUbCat");
		
		WebElement descSiglaSubCat = getDriver().findElement(By.id("txtSubCatNome"));
		descSiglaSubCat.sendKeys("Teste_Auto_Desc_SUbCat");
		
		WebElement botSalvar = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		botSalvar.click();
	}
}
