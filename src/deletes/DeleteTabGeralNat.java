package deletes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import parametros.TabelaGeralCadastroNatureza_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class DeleteTabGeralNat extends ContextFirefox{
	@Test
	public void deleteTabGeral (){
		
		getDriver().get("http://erg640cq:8080/Hades/Administracao/HADadm00032.tp");
		Utilizaveis.logarFabrica();
		Utilizaveis.tempo(3);
		
		WebElement filtroDePesquisa = getDriver().findElement(By.id("txbTabela"));
		filtroDePesquisa.sendKeys(TabelaGeralCadastroNatureza_Parametros.getFiltroDePesquisa());
		filtroDePesquisa.sendKeys(Keys.TAB);
		Utilizaveis.tempo(3);
		
		WebElement selecionarTabeladeValores = getDriver().findElement(By.xpath("//span[text()='Consultar/Editar itens']"));
		selecionarTabeladeValores.click();
		Utilizaveis.tempo(3);
		
		getDriver().switchTo().frame(0);
		Utilizaveis.tempo(5);
		
		Utilizaveis.clickApagar();
		Utilizaveis.tempo(3);
		
		WebElement btnConfirmarSimExcluir = getDriver().switchTo().activeElement();
		btnConfirmarSimExcluir.click();
		Utilizaveis.tempo(2);
		
		}

}
