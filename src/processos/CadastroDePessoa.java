package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.CadastroDePessoa_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroDePessoa extends ContextFirefox {
	
	@Test
	public void cadastroFunc() throws InterruptedException{

		getDriver().get("erg640cq:8080/Ergon/Administracao/ERGadm00104.tp");	
		Utilizaveis.logarFabrica();
		
	
		
	Utilizaveis.clicarNovo();
		
		WebElement nomePessoa = getDriver().findElement(By.id("txtNome"));
		nomePessoa.sendKeys(CadastroDePessoa_Parametros.getTxtNome());
		
		WebElement cpf =getDriver().findElement(By.id("txtCpf"));
		cpf.click();
		cpf.sendKeys(CadastroDePessoa_Parametros.getTxtCpf());
		
		WebElement estCivil = getDriver().findElement(By.id("drpEstcivil"));
		Utilizaveis.buscaDrop(estCivil, CadastroDePessoa_Parametros.getDrpSexo());
		
		WebElement escolaridade = getDriver().findElement(By.id("drpEscolaridade"));
		Utilizaveis.buscaDrop(escolaridade, CadastroDePessoa_Parametros.getDrpEscolaridade());
		
		WebElement dtNasc = getDriver().findElement(By.id("txtDtnasc"));
		dtNasc.sendKeys(CadastroDePessoa_Parametros.getTxtDtnasc());
		
		WebElement drpSexo = getDriver().findElement(By.id("drpSexo"));
		Utilizaveis.buscaDrop(drpSexo, CadastroDePessoa_Parametros.getDrpSexo());
		
		Utilizaveis.tempo(2);
		
		Utilizaveis.clicarSalvar();
		
		Utilizaveis.tempo(5);
		
		WebElement btnOk = getDriver().findElement(By.xpath("//button[contains(text(),'OK')]"));


		btnOk.click();
		Utilizaveis.tempo(5);
		
		
	}	

}
