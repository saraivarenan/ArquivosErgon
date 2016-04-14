package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroDePessoa extends ContextFirefox {
	
	@Test
	public void cadastroFunc() throws InterruptedException{

		getDriver().get("erg640cq:8080/Ergon/Administracao/ERGadm00104.tp");	
		Utilizaveis.logarFabrica();
		
	
		
	Utilizaveis.clicarNovo();
		
		WebElement nomePessoa = getDriver().findElement(By.id("txtNome"));
		nomePessoa.sendKeys("Teste cadastro Pessoa");
		
		WebElement cpf =getDriver().findElement(By.id("txtCpf"));
		cpf.click();
		cpf.sendKeys("24636290453");
		
		WebElement estCivil = getDriver().findElement(By.id("drpEstcivil"));
		Utilizaveis.buscaDrop(estCivil, "Solteiro");
		
		WebElement escolaridade = getDriver().findElement(By.id("drpEscolaridade"));
		Utilizaveis.buscaDrop(escolaridade, "Doutorado - Doutorado");
		
		WebElement dtNasc = getDriver().findElement(By.id("txtDtnasc"));
		dtNasc.sendKeys("01011990");
		
		WebElement drpSexo = getDriver().findElement(By.id("drpSexo"));
		Utilizaveis.buscaDrop(drpSexo, "M - Masculino");
		
		Utilizaveis.tempo(2);
		
		Utilizaveis.clicarSalvar();
		
		Utilizaveis.tempo(5);
		
		WebElement btnOk = getDriver().findElement(By.xpath("//button[contains(text(),'OK')]"));


		btnOk.click();
		Utilizaveis.tempo(5);
		
		
	}	

}
