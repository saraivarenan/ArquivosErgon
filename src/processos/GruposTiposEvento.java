package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.CadastroGruposTiposEvento_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class GruposTiposEvento extends ContextFirefox {
	@Test
	public void cadatroGrupoTipoEvento () throws InterruptedException{
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00029.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.tempo(3);
		Utilizaveis.clicarNovo();
		
		WebElement inputGrupo = getDriver().findElement(By.xpath("//input[@name='grupo']"));
		inputGrupo.sendKeys(CadastroGruposTiposEvento_Parametros.getInputGrupo());

		WebElement inputDesc = getDriver().findElement(By.xpath("//input[@name='descricao']"));
		inputDesc.sendKeys(CadastroGruposTiposEvento_Parametros.getInputDesc());
		
		Utilizaveis.clicarSalvar();
		
		
		
		
	}

}
