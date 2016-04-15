package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.CadastroTipoEventoCargo_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroTipoEventoCargo extends ContextFirefox {
	
	@Test
	public void cadastroTipoEvento() throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00028.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.clicarNovo();
		
		WebElement tipoEvento = getDriver().findElement(By.id("txtTipoevento"));
		tipoEvento.sendKeys(CadastroTipoEventoCargo_Parametros.getTxtTipoevento());
		
		WebElement nomeEvento = getDriver().findElement(By.id("txtNomeevt"));
		nomeEvento.sendKeys(CadastroTipoEventoCargo_Parametros.getTxtNomeevt());
		
		WebElement drpNatureza = getDriver().findElement(By.id("drpNatureza"));
		Utilizaveis.buscaDrop(drpNatureza, CadastroTipoEventoCargo_Parametros.getDrpNatureza());
		
		WebElement drpNatuPrincipal = getDriver().findElement(By.id("drpNatureza_principal"));
		Utilizaveis.buscaDrop(drpNatuPrincipal, CadastroTipoEventoCargo_Parametros.getDrpNatureza_principal());
		
		WebElement drpGrupo = getDriver().findElement(By.id("drpGrupo"));
		Utilizaveis.buscaDrop(drpGrupo, CadastroTipoEventoCargo_Parametros.getDrpGrupo());
		
		WebElement prioridadeExerc = getDriver().findElement(By.id("txtPrioridade_exerc"));
		prioridadeExerc.sendKeys(CadastroTipoEventoCargo_Parametros.getTxtPrioridade_exerc());
		
		WebElement eventoIngre = getDriver().findElement(By.id("chkEhevingresso"));
		eventoIngre.click();
		
		WebElement criarEvento = getDriver().findElement(By.id("chkCriavinculo"));
		criarEvento.click();
		
		WebElement prioriPag = getDriver().findElement(By.id("txtPrioridadepagto"));
		prioriPag.sendKeys(CadastroTipoEventoCargo_Parametros.getTxtPrioridadepagto());
		
		Utilizaveis.clicarSalvar();
		Utilizaveis.tempo(3);
		//Aba Especie de evento
		//Selecionar um tipo especie de evento, cadastro na ERGadm00022
		
		WebElement clickAba = getDriver().findElement(By.xpath("//span[contains(text(),'Espécies evento')]"));
		clickAba.click();
		Utilizaveis.tempo(3);
		
		WebElement clicNovo = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button")); 
		clicNovo.click();

		WebElement cmpEspEvent = getDriver().findElement(By.id("drpDescr_formaprov"));
		Utilizaveis.buscaDrop(cmpEspEvent, CadastroTipoEventoCargo_Parametros.getDrpDescr_formaprov());
		
		Utilizaveis.tempo(2);
		WebElement clicSalvar = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		clicSalvar.click();
		Utilizaveis.tempo(3);
		
		//Aba tipo de Cargos
		//Vai puxar um registro que foi cadastrado na HADadm00032, levando em consideração que esse tipo de cargo
		//deve ser o mesmo associado ao cargo ERGadm00015.
		
		
		WebElement clicAba3 = getDriver().findElement(By.xpath("//span[contains(text(),'Tipos de cargos')]"));
		clicAba3.click();
		
		WebElement clicknovoAbaCargo = getDriver().findElement(By.xpath("//div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		clicknovoAbaCargo.click();
		
		WebElement cmpTipoCargo = getDriver().findElement(By.id("drpDescr"));
		Utilizaveis.buscaDrop(cmpTipoCargo, CadastroTipoEventoCargo_Parametros.getDrpDescrTipoCargo());
		
		Utilizaveis.tempo(3);
		WebElement clicSalvarCargo = getDriver().findElement(By.xpath("//div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		clicSalvarCargo.click();
		
		
		
Utilizaveis.tempo(5);
		
		
	}
	
	

}
