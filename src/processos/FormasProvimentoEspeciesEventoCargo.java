package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import parametros.FromasProvimentoEspeciesEventoCargos_Parametros;
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
		inputSigla.sendKeys(FromasProvimentoEspeciesEventoCargos_Parametros.getInputSigla());

		WebElement inputDescSigla = getDriver().findElement(By.xpath("//input[@name='nome']"));
		inputDescSigla.sendKeys(FromasProvimentoEspeciesEventoCargos_Parametros.getInputDescSigla());

		WebElement checkValidoAtivos = getDriver().findElement(By.xpath("//input[@id='chkAtivo']"));
		checkValidoAtivos.click();

		WebElement ocupaQuadro = getDriver().findElement(By.xpath("//input[@id='chkOcupa_Quadro']"));
		ocupaQuadro.click();

		WebElement validoIngressoPrimeiroProvimento = getDriver().findElement(By.xpath("//input[@id='chkPrimeiroProv']"));
		validoIngressoPrimeiroProvimento.click();

				
		WebElement TipoRelacionamento = getDriver().findElement(By.xpath("//input[@name='tipo_relac']")); // buscar drop Contínuo
		Utilizaveis.buscaDrop(TipoRelacionamento, FromasProvimentoEspeciesEventoCargos_Parametros.getTipoRelacionamento());
		
		Utilizaveis.tempo(2);
		Utilizaveis.clicarSalvar();
		
		//Clicar em outra aba Validações
		getDriver().findElement(By.xpath("//div[7]/div[1]/div[1]/ul/li[3]/a[2]/em/span/span")).click();
		Utilizaveis.tempo(3);
		
		WebElement botaoNovoValidacoes = getDriver().findElement(By.xpath(
				"//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		botaoNovoValidacoes.click();
		Utilizaveis.tempo(2);
		
		WebElement drpTipoVinculo = getDriver().findElement(By.id("drpEdtTpVinc"));
		Utilizaveis.buscaDrop(drpTipoVinculo, FromasProvimentoEspeciesEventoCargos_Parametros.getDrpTipoVinculo());
		
		WebElement drpRegimeJuridico = getDriver().findElement(By.id("drpEdtRgJur"));
		Utilizaveis.buscaDrop(drpRegimeJuridico, FromasProvimentoEspeciesEventoCargos_Parametros.getDrpRegimeJuridico());
		
		WebElement drpCategoria = getDriver().findElement(By.id("drpEdtCat"));
		Utilizaveis.buscaDrop(drpCategoria, FromasProvimentoEspeciesEventoCargos_Parametros.getDrpCategoria());
		
		
		WebElement drpSubcategoria = getDriver().findElement(By.id("drpEdtSubcat"));
		Utilizaveis.buscaDrop(drpSubcategoria, FromasProvimentoEspeciesEventoCargos_Parametros.getDrpSubcategoria());
		
		WebElement botaoSalvar = getDriver().findElement(By.xpath(
				"//div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		botaoSalvar.click();
		Utilizaveis.tempo(2);
		
		//aba validar transações
		
		WebElement clicarAba = getDriver().findElement(By.xpath("//div[7]/div[1]/div[1]/ul/li[4]/a[2]/em/span/span"));
		clicarAba.click();
		
		Utilizaveis.tempo(2);
		//clicar em novo
		WebElement btnNovo = getDriver().findElement(By.xpath(
				"//div[4]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		btnNovo.click();
		
		//formulário
		
		WebElement drpSistema = getDriver().findElement(By.xpath("//input[@name='sis']"));
		Utilizaveis.buscaDrop(drpSistema, FromasProvimentoEspeciesEventoCargos_Parametros.getDrpSistema());
		
		WebElement srcTransacao = getDriver().findElement(By.xpath("//form/div/div/div/div/div[2]/div/div/div/div[1]/div/div/input"));
		srcTransacao.sendKeys(FromasProvimentoEspeciesEventoCargos_Parametros.getSrcTransacao());
		Utilizaveis.tempo(2);
		srcTransacao.sendKeys(Keys.ENTER);
		Utilizaveis.tempo(3);

		// Clicar em salvar.
		WebElement botaoSalvarValidacoes = getDriver().findElement(By.xpath(
				"//div[4]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		botaoSalvarValidacoes.click();
		
		Utilizaveis.tempo(2);
		
		
	}

}
