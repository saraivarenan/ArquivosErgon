package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.CadastroSindicato_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroSindicato extends ContextFirefox {
	@Test
	public void cadastroSind() throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00048.tp");
		
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		WebElement cmpSigla = getDriver().findElement(By.id("txtSigla"));
		cmpSigla.sendKeys(CadastroSindicato_Parametros.getTxtSigla());
		
		WebElement cmpNomeSigla = getDriver().findElement(By.id("txtNome"));
		cmpNomeSigla.sendKeys(CadastroSindicato_Parametros.getTxtNome());
		
		WebElement cmpDescSigla = getDriver().findElement(By.id("txtDesc"));
		cmpDescSigla.sendKeys(CadastroSindicato_Parametros.getTxtDesc());
		
		Utilizaveis.clicarSalvar();
		
		
	}

}
