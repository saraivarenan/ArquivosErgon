package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroTipodeVinculo extends ContextFirefox {
	
	@Test
	public void cadastroVinculo () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00002.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		WebElement inputSigla = getDriver().findElement(By.xpath("//input[@name='sigla']"));
		inputSigla.sendKeys("Efetivo_Auto2");

		WebElement inputNome = getDriver().findElement(By.xpath("//input[@name='nome']"));
		inputNome.sendKeys("Efetivo_Auto2");

		WebElement inputIdade = getDriver().findElement(By.xpath("//input[@name='idade_minima']"));
		inputIdade.sendKeys("18");
		
		Utilizaveis.clicarSalvar();
		
		getDriver().findElement(By.xpath("//div[7]/div[1]/div[1]/ul/li[2]/a[2]/em/span/span")).click();
		Thread.sleep(3000);
		
		WebElement inputCategoria = getDriver().findElement(By.xpath("//input[@name='drpCateg']"));
		Utilizaveis.buscaDrop(inputCategoria, "ADMINISTRACAO GERAL - ds");

		WebElement inputRegimeJuridico = getDriver().findElement(By.id("drpRegime"));
		Utilizaveis.buscaDrop(inputRegimeJuridico, "asdasd - asdasd");

		WebElement inputRegimePrevidenciario = getDriver()
				.findElement(By.xpath("//input[@name='drpRegimePrev']"));
		Utilizaveis.buscaDrop(inputRegimePrevidenciario, "RGPS - fffff");
		
		WebElement inputPlanoprevidenciario = getDriver()
				.findElement(By.xpath("//input[@name='drpPlanoPrev']"));
		Utilizaveis.buscaDrop(inputPlanoprevidenciario, "UNICO - INSS");
		Utilizaveis.tempo(3);
		
		WebElement buttonGerarValidade = getDriver().findElement(By.xpath("//div[text()='Gerar Validade']"));		
		buttonGerarValidade.click();
		
	
	}

}
