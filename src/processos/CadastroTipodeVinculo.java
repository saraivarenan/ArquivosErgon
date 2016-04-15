package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.CadastroTipodeVinculo_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroTipodeVinculo extends ContextFirefox {
	
	@Test
	public void cadastroVinculo () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00002.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		WebElement inputSigla = getDriver().findElement(By.xpath("//input[@name='sigla']"));
		inputSigla.sendKeys(CadastroTipodeVinculo_Parametros.getInputSigla());

		WebElement inputNome = getDriver().findElement(By.xpath("//input[@name='nome']"));
		inputNome.sendKeys(CadastroTipodeVinculo_Parametros.getInputNome());

		WebElement inputIdade = getDriver().findElement(By.xpath("//input[@name='idade_minima']"));
		inputIdade.sendKeys(CadastroTipodeVinculo_Parametros.getInputIdade());
		
		WebElement checkCommiss = getDriver().findElement(By.id("chkE_comis"));
		checkCommiss.click();
		
		Utilizaveis.clicarSalvar();
		
		getDriver().findElement(By.xpath("//span[contains(text(),'Validações')]")).click();
				
		Utilizaveis.tempo(2);
				
		WebElement inputCategoria = getDriver().findElement(By.xpath("//input[@name='drpCateg']"));
		Utilizaveis.buscaDrop(inputCategoria, CadastroTipodeVinculo_Parametros.getInputCategoria());
		System.out.println(CadastroTipodeVinculo_Parametros.getInputCategoria());

		WebElement inputRegimeJuridico = getDriver().findElement(By.id("drpRegime"));
		Utilizaveis.buscaDrop(inputRegimeJuridico, CadastroTipodeVinculo_Parametros.getInputRegimeJuridico());
		System.out.println(CadastroTipodeVinculo_Parametros.getInputRegimeJuridico());
		
		WebElement inputSubCat = getDriver().findElement(By.id("drpSubcategoria"));
		Utilizaveis.buscaDrop(inputSubCat, CadastroTipodeVinculo_Parametros.getInputSubCat());
		System.out.println(CadastroTipodeVinculo_Parametros.getInputSubCat());
		
		WebElement inputRegimePrevidenciario = getDriver().findElement(By.xpath("//input[@name='drpRegimePrev']"));
		Utilizaveis.buscaDrop(inputRegimePrevidenciario, CadastroTipodeVinculo_Parametros.getInputRegimePrevidenciario());
		System.out.println(CadastroTipodeVinculo_Parametros.getInputRegimePrevidenciario());
		
		WebElement inputPlanoprevidenciario = getDriver()
				.findElement(By.xpath("//input[@name='drpPlanoPrev']"));
		Utilizaveis.buscaDrop(inputPlanoprevidenciario, CadastroTipodeVinculo_Parametros.getInputPlanoprevidenciario());
		System.out.println(CadastroTipodeVinculo_Parametros.getInputPlanoprevidenciario());
		
		
		
		WebElement buttonGerarValidade = getDriver().findElement(By.xpath("//div[text()='Gerar Validade']"));		
		buttonGerarValidade.click();
		Utilizaveis.tempo(2);
		
		WebElement btnOk = getDriver().findElement(By.xpath("//button[contains(text(),'OK')]"));
		btnOk.click();
		
		Utilizaveis.tempo(3);
		
	
	}

}
