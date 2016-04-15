package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.RegimeJuridico_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class RegimeJuridico extends ContextFirefox {
	
	@Test
	public void cadastroRegimeJuridic() throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00007.tp");
		
		Utilizaveis.logarCust();
		
		Utilizaveis.tempo(2);
		
		Utilizaveis.clicarNovo();
		
		WebElement inputSigla = getDriver().findElement(By.xpath("//input[@name='sigla']"));
		inputSigla.sendKeys(RegimeJuridico_Parametros.getInputSigla());

		WebElement inputNome = getDriver().findElement(By.xpath("//input[@name='nome']"));
		inputNome.sendKeys(RegimeJuridico_Parametros.getInputNome());
		Utilizaveis.tempo(2);
		
		Utilizaveis.clicarSalvar();
		
	}

}
