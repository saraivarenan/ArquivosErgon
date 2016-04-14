package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroSindicato extends ContextFirefox {
	@Test
	public void cadastroSind (String item) throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00048.tp");
		
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		WebElement cmpSigla = getDriver().findElement(By.id("txtSigla"));
		cmpSigla.sendKeys("Teste");
		
		WebElement cmpNomeSigla = getDriver().findElement(By.id("txtNome"));
		cmpNomeSigla.sendKeys("Teste_Nome_sindAuto");
		
		WebElement cmpDescSigla = getDriver().findElement(By.id("txtDesc"));
		cmpDescSigla.sendKeys("Teste_Nome_sindAuto");
		
		Utilizaveis.clicarSalvar();
		
		
	}

}
