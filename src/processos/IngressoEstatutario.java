package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class IngressoEstatutario extends ContextFirefox {
@Test
public void ingressar() throws InterruptedException{

	// login
getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00182.tp");
Utilizaveis.logarCust();
//Pesquisa Pessoa
		WebElement srcBuscaPessoa = getDriver().findElement(By.className("//div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div/div/input"));
		srcBuscaPessoa.sendKeys("");

		Utilizaveis.clicarNovo();
//Formulário
		WebElement srcTipoEvento	= 	getDriver().findElement(By.xpath("//input[@name='tipoevento']"));
		WebElement dtnDataNomeaçao  =  	getDriver().findElement(By.xpath("//input[@name='dtnom']"));
		WebElement dtnDataPosse  	= 	getDriver().findElement(By.xpath("//input[@name='dtposse']"));
		WebElement dtnDataExercício = 	getDriver().findElement(By.xpath("//input[@name='dtexerc']"));
		WebElement drpRegimeJuridico=  	getDriver().findElement(By.xpath("//input[@name='regimejur']"));
		WebElement drpTipoVinculo  	= 	getDriver().findElement(By.xpath("//input[@name='tipovinc']"));
		WebElement drpEspecieEvento = 	getDriver().findElement(By.xpath("//input[@name='formaprov']"));
		WebElement srcCargo  		= 	getDriver().findElement(By.xpath("//input[@name='cargo']"));
		WebElement drpReferencia  	= 	getDriver().findElement(By.xpath("//input[@name='referencia']"));
		WebElement srcSetor  		= 	getDriver().findElement(By.xpath("//input[@name='setor']"));
		
		
		srcTipoEvento.sendKeys("");
		dtnDataNomeaçao.sendKeys("");
		dtnDataPosse.sendKeys("");
		dtnDataExercício.sendKeys("");
		//drpRegimeJuridico 
		//drpTipoVinculo
		//drpEspecieEvento
		srcCargo.sendKeys("");
		//drpReferencia
		srcSetor.sendKeys("");
		
		Utilizaveis.clicarSalvar();

}

}
