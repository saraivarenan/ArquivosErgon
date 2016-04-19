package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.PerfilEventoUsuario_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class PerfilEventoUsuario extends ContextFirefox {

	@Test
	public void perfilAcesso () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00030.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		//formulário
		WebElement cmpSigla = getDriver().findElement(By.id("txtSigla"));
		WebElement cmpDesc = getDriver().findElement(By.id("txtDescricao"));
		
		cmpSigla.sendKeys(PerfilEventoUsuario_Parametros.getCmpSigla());
		cmpDesc.sendKeys(PerfilEventoUsuario_Parametros.getCmpDesc());
		Utilizaveis.tempo(2);
		
		Utilizaveis.clicarSalvar();
		
		//Aba Tipos de Evento
		
		Utilizaveis.tempo(2);
				
		WebElement clickAbaEvent = getDriver().findElement(By.xpath("//span[contains(text(),'Tipos de evento')]"));
		clickAbaEvent.click();
		
		Utilizaveis.tempo(2);
		//Clicar em novo
		
		WebElement clickNovoEvent = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		clickNovoEvent.click();
		
		//formulário
		WebElement drpTipoEvento = getDriver().findElement(By.id("drpTipoEvento"));
		WebElement chkCadastro = getDriver().findElement(By.id("chkPodeCad"));
		WebElement chkAlterar = getDriver().findElement(By.id("chkPodeAlt"));
		WebElement chkExcluir = getDriver().findElement(By.id("chkPodeRem"));
		
		Utilizaveis.buscaDrop(drpTipoEvento, PerfilEventoUsuario_Parametros.getDrpTipoEvento());
		chkCadastro.click();
		chkAlterar.click();
		chkExcluir.click();
		
		WebElement clickSalvarEvent = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));		
		clickSalvarEvent.click();		
		Utilizaveis.tempo(2);
		
		//Aba padrões
		
		WebElement clickAbaPadrao = getDriver().findElement(By.xpath("//span[contains(text(),'Padrões de acesso')]"));
		clickAbaPadrao.click();
		
		WebElement clickNovoAbaPad = getDriver().findElement(By.xpath("//div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		clickNovoAbaPad.click();
		
		WebElement drpPadrao = getDriver().findElement(By.id("drpPadrao"));
		Utilizaveis.buscaDrop(drpPadrao, PerfilEventoUsuario_Parametros.getDrpPadrao());
		
		Utilizaveis.tempo(2);
		WebElement clickSalvarAbaPad = getDriver().findElement(By.xpath("//div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		clickSalvarAbaPad.click();
		Utilizaveis.tempo(23);
		
		
	}
}
