package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class FormasProvimentoEspeciesEventoCargo extends ContextFirefox {
	
	@Test
	public void CadastroFormasProv() throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00022.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.tempo(2);
		Utilizaveis.clicarNovo();
		
		//Formulario
		
		WebElement inputSigla = getDriver().findElement(By.xpath("//input[@name='sigla']"));
		inputSigla.sendKeys("Admissao_Auto");

		WebElement inputDescSigla = getDriver().findElement(By.xpath("//input[@name='nome']"));
		inputDescSigla.sendKeys("Descrição_Admissao_Auto");

		WebElement checkValidoAtivos = getDriver().findElement(By.xpath("//input[@id='chkAtivo']"));
		checkValidoAtivos.click();

		WebElement ocupaQuadro = getDriver().findElement(By.xpath("//input[@id='chkOcupa_Quadro']"));
		ocupaQuadro.click();

		WebElement validoIngressoPrimeiroProvimento = getDriver()
				.findElement(By.xpath("//input[@id='chkPrimeiroProv']"));
		validoIngressoPrimeiroProvimento.click();

				
		WebElement TipoRelacionamento = getDriver().findElement(By.xpath("//input[@name='tipo_relac']")); // buscar drop Contínuo
		Utilizaveis.buscaDrop(TipoRelacionamento, "EVOLUCAO - Evolução");
		
		Utilizaveis.tempo(2);
		Utilizaveis.clicarSalvar();
		
		//Clicar em outra aba
		getDriver().findElement(By.xpath("//div[7]/div[1]/div[1]/ul/li[3]/a[2]/em/span/span")).click();
		Utilizaveis.tempo(3);
		
		WebElement botaoNovoValidacoes = getDriver().findElement(By.xpath(
				"//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		botaoNovoValidacoes.click();
		Utilizaveis.tempo(2);
		
		WebElement drpTipoVinculo = getDriver().findElement(By.xpath("//input[@name='tipovinc']"));
		Utilizaveis.buscaDrop(drpTipoVinculo, "Efetivo_Auto2 - Efetivo_Auto2");
		
		WebElement drpRegimeJuridico = getDriver().findElement(By.xpath("//input[@name='regimejur']"));
		Utilizaveis.buscaDrop(drpRegimeJuridico, "Reg_Est_Auto - Descrição Reg_Est_Auto");
		
		WebElement drpCategoria = getDriver().findElement(By.xpath("//input[@name='categoria']"));
		Utilizaveis.buscaDrop(drpCategoria, "Teste_Auto - Teste_Auto_Desc");
		WebElement drpSubcategoria = getDriver().findElement(By.xpath("//input[@name='subcategoria']"));
		Utilizaveis.buscaDrop(drpSubcategoria, "Teste_Auto_SUbCat - Teste_Auto_Desc_SUbCat");
		
		WebElement botaoSalvar = getDriver().findElement(By.xpath(
				"//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		botaoSalvar.click();
		
		//aba validar transações
		
		WebElement clicarAba = getDriver().findElement(By.xpath("//div[7]/div[1]/div[1]/ul/li[4]/a[2]/em/span/span"));
		clicarAba.click();
		
		//clicar em novo
		WebElement btnNovo = getDriver().findElement(By.xpath(
				"//div[4]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		btnNovo.click();
		
		//formulário
		
		WebElement drpSistema = getDriver().findElement(By.xpath("//input[@name='sis']"));
		Utilizaveis.buscaDrop(drpSistema, "Ergon");

		WebElement srcTransacao = getDriver().findElement(By.xpath("//form/div/div/div/div/div[2]/div/div/div/div[1]/div/div/input"));
		srcTransacao.sendKeys("ERGadm00182");
		srcTransacao.sendKeys(Keys.ENTER);
		Utilizaveis.tempo(3);

		// Clicar em salvar.
		WebElement botaoSalvarValidacoes = getDriver().findElement(By.xpath(
				"//div[4]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		botaoSalvarValidacoes.click();
		
		Utilizaveis.tempo(2);
		
		
	}

}
