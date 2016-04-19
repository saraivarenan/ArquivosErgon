package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import parametros.IngressoEstatutario_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class IngressoEstatutario extends ContextFirefox {
@Test
public void ingressar() throws InterruptedException{

	// login
getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00182.tp");
Utilizaveis.logarCust();
//Pesquisa Pessoa
		WebElement srcBuscaPessoa = getDriver().findElement(By.xpath("//input[@class ='x-form-text x-form-field searchbox']"));
		srcBuscaPessoa.sendKeys(IngressoEstatutario_Parametros.getSrcBuscaPessoa());
		Utilizaveis.tempo(2);
		srcBuscaPessoa.sendKeys(Keys.TAB);

		Utilizaveis.clicarNovo();
//Formulário
		WebElement srcTipoEvento	= 	getDriver().findElement(By.id("srcTipoEvento"));
		WebElement dtnDataNomeaçao  =  	getDriver().findElement(By.xpath("//input[@name='dtnom']"));
		WebElement dtnDataPosse  	= 	getDriver().findElement(By.xpath("//input[@name='dtposse']"));
		WebElement dtnDataExercício = 	getDriver().findElement(By.xpath("//input[@name='dtexerc']"));
		WebElement drpRegimeJuridico=  	getDriver().findElement(By.id("drpRegime"));
		WebElement drpTipoVinculo  	= 	getDriver().findElement(By.id("drpTpvinc"));
		WebElement drpEspecieEvento = 	getDriver().findElement(By.id("drpProvimento"));
		WebElement srcCargo  		= 	getDriver().findElement(By.id("srcCargo"));
		WebElement drpReferencia  	= 	getDriver().findElement(By.id("drpReferencia"));
		WebElement srcSetor  		= 	getDriver().findElement(By.id("srcSetor"));
		
		
		srcTipoEvento.sendKeys(IngressoEstatutario_Parametros.getSrcTipoEvento());
		srcTipoEvento.sendKeys(Keys.TAB);
		dtnDataNomeaçao.sendKeys(IngressoEstatutario_Parametros.getDtnDataNomeaçao());
		dtnDataPosse.sendKeys(IngressoEstatutario_Parametros.getDtnDataPosse());
		dtnDataExercício.sendKeys(IngressoEstatutario_Parametros.getDtnDataExercício());
		Utilizaveis.buscaDrop(drpRegimeJuridico, IngressoEstatutario_Parametros.getDrpRegimeJuridico());
		
		Utilizaveis.buscaDrop(drpTipoVinculo, IngressoEstatutario_Parametros.getDrpTipoVinculo());
		Utilizaveis.buscaDrop(drpEspecieEvento, IngressoEstatutario_Parametros.getDrpEspecieEvento());
		srcCargo.sendKeys(IngressoEstatutario_Parametros.getSrcCargo());
		Utilizaveis.tempo(3);
		Utilizaveis.buscaDrop(drpReferencia, IngressoEstatutario_Parametros.getDrpReferencia());
		srcSetor.sendKeys(IngressoEstatutario_Parametros.getSrcSetor());
		srcSetor.sendKeys(Keys.TAB);
		
		Utilizaveis.tempo(4);
		Utilizaveis.clicarSalvar();
		
		WebElement btnConfirmarOk = getDriver().switchTo().activeElement();
		btnConfirmarOk.click();
		Utilizaveis.tempo(2);
		
		WebElement drpJorn = getDriver().findElement(By.id("drpJornadaIngresso"));
		Utilizaveis.buscaDrop(drpJorn, IngressoEstatutario_Parametros.getDrpJornada());
		
		WebElement clickEfv = getDriver().findElement(By.xpath("//button[contains(text(),'Efetivar Ingresso')]"));
		clickEfv.click();
		Utilizaveis.tempo(5);
		

}

}
