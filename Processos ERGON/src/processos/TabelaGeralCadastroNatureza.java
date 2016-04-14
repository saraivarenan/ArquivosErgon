package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class TabelaGeralCadastroNatureza extends ContextFirefox {
	@Test
	public void cadastroTabelaGeral () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Hades/Administracao/HADadm00032.tp");
		Utilizaveis.logarFabrica();
		Utilizaveis.tempo(3);
		
		WebElement filtroDePesquisa = getDriver().findElement(By.id("txbTabela"));
		filtroDePesquisa.sendKeys("NATUREZA_EV");
		filtroDePesquisa.sendKeys(Keys.TAB);
		Utilizaveis.tempo(3);
		
		WebElement selecionarTabeladeValores = getDriver().findElement(By.xpath("//span[text()='Consultar/Editar itens']"));
		selecionarTabeladeValores.click();
		Utilizaveis.tempo(3);
		
		getDriver().switchTo().frame(0);
		Utilizaveis.tempo(5);
		Utilizaveis.clicarNovo();
		
		
		WebElement item = getDriver().findElement(By.xpath("//input[@name='item']"));
		item.sendKeys("ScriptAuto NATUREZA");

		WebElement descricao = getDriver().findElement(By.xpath("//input[@name='descr']"));
		descricao.sendKeys("Descrição do Item");

		getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button save']")).click();
		Thread.sleep(3000);

	/*	Boolean elementoPresente = getDriver().findElements(By.xpath("//div[2]/div[1]/div/div/div/div/div[2]/span")).size() > 0;

		if (elementoPresente = true) {
			System.out.println("Registro já existente");
			Utilizaveis.fecharNavegador();
			Utilizaveis.tempo(3);
		} */
		
	
		/*
		WebElement ifr =  getDriver().findElement(By.className("x-panel-body x-panel-body-noheader x-panel-body-noborder"));
		Utilizaveis.tempo(3);
		
	String valor =	getDriver().switchTo().frame(ifr).findElement(By.id("txfItem")).getAttribute("value");
	System.out.println(valor);
	System.out.println(item.getAttribute("value"));
	assertTrue(valor.equals(item.getAttribute("value"))); */
		
		
			
		
	}
	
	

}
