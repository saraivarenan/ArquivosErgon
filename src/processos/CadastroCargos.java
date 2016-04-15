package processos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parametros.CadastroCargos_Parametros;
import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroCargos extends ContextFirefox{
	
	@Test
	public void cadastroCargHist () throws InterruptedException{
		
		getDriver().get("http://erg640cq:8080/Ergon/Administracao/ERGadm00015.tp");
		Utilizaveis.logarCust();
		
		Utilizaveis.tempo(3);
		//Botão NOvo
		Utilizaveis.clicarNovo();
		
		WebElement inputCargo = getDriver().findElement(By.xpath("//input[@name='cargo']"));
		inputCargo.sendKeys(CadastroCargos_Parametros.getInputCargo());

		WebElement inputDescCargo = getDriver().findElement(By.xpath("//input[@name='nome']"));
		inputDescCargo.sendKeys(CadastroCargos_Parametros.getInputDescCargo());

		WebElement drpControlevaga = getDriver().findElement(By.xpath("//input[@name='controle_vaga']"));
		Utilizaveis.buscaDrop(drpControlevaga, CadastroCargos_Parametros.getDrpControlevaga());

		WebElement drpCategoria = getDriver().findElement(By.xpath("//input[@name='categoria']"));
		Utilizaveis.buscaDrop(drpCategoria, CadastroCargos_Parametros.getDrpCategoria());

		WebElement drpSubcategoria = getDriver().findElement(By.xpath("//input[@name='subcategoria']"));
		Utilizaveis.buscaDrop(drpSubcategoria, CadastroCargos_Parametros.getDrpSubcategoria());


		WebElement drpCargoFunçao = getDriver().findElement(By.xpath("//input[@name='cargo_funcao']"));
		Utilizaveis.buscaDrop(drpCargoFunçao, CadastroCargos_Parametros.getDrpCargoFunçao());
		
		WebElement drpTipocargo = getDriver().findElement(By.xpath("//input[@name='tipo_cargo']"));
		Utilizaveis.buscaDrop(drpTipocargo, CadastroCargos_Parametros.getDrpTipocargo());

		WebElement drpEscolaridade = getDriver().findElement(By.xpath("//input[@name='escolaridade']"));
		Utilizaveis.buscaDrop(drpEscolaridade, CadastroCargos_Parametros.getDrpEscolaridade());
		
		WebElement btnMensagemValida = getDriver().findElement(By.xpath("//button[contains(text(),'Sim')]"));
		btnMensagemValida.click();
		
		Utilizaveis.tempo(2);
		//Botão SAlvar "Detalhes"
		Utilizaveis.clicarSalvar();

		//Clicar na aba Historico
		WebElement abaHistorico = getDriver()
				.findElement(By.xpath("//div[7]/div[1]/div[1]/ul/li[4]/a[2]/em/span/span"));
		abaHistorico.click();
		Utilizaveis.tempo(4);
		
		//Botão novo aba "Histotico"
		
		WebElement btnNovoHitorico = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		btnNovoHitorico.click();
		Utilizaveis.tempo(3);
	
		
		//Formulário
		WebElement inputInicio = getDriver().findElement(By.xpath("//input[@name='dtini']"));
		inputInicio.sendKeys("13042016");

		WebElement drpTabelaVencimentos = getDriver().findElement(By.xpath("//input[@id='drpTabVenc']"));
		Utilizaveis.buscaDrop(drpTabelaVencimentos, CadastroCargos_Parametros.getDrpTabelaVencimentos());
		// selecionar o valor cadastrado na página ERGadm00014

		WebElement drpReferenciaInicial = getDriver().findElement(By.xpath("//input[@id='drpRefini']"));
		Utilizaveis.buscaDrop(drpReferenciaInicial, CadastroCargos_Parametros.getDrpReferenciaInicial());
		// Selecionar um valor

		WebElement drpReferenciaFinal = getDriver().findElement(By.xpath("//input[@id='drpReffim']"));
		Utilizaveis.buscaDrop(drpReferenciaFinal, CadastroCargos_Parametros.getDrpReferenciaFinal());
		// Selecionar um valor

		Utilizaveis.tempo(2);
		WebElement drpSindicato = getDriver().findElement(By.id("drpSindicato"));
		Utilizaveis.buscaDrop(drpSindicato, CadastroCargos_Parametros.getDrpSindicato());
		// selecionar um valor cadastrado na página ERGadm00048

		WebElement inputInsalubridade = getDriver().findElement(By.xpath("//input[@name='percinsal']"));
		inputInsalubridade.sendKeys(CadastroCargos_Parametros.getInputInsalubridade());

		WebElement inputPericulosidade = getDriver().findElement(By.xpath("//input[@name='percperic']"));
		inputPericulosidade.sendKeys(CadastroCargos_Parametros.getInputPericulosidade());

		WebElement inputDiasPrazoPosse = getDriver().findElement(By.xpath("//input[@name='dias_prazo_posse']"));
		inputDiasPrazoPosse.sendKeys(CadastroCargos_Parametros.getInputDiasPrazoPosse());

		WebElement inputProrrogacaoPosse = getDriver()
				.findElement(By.xpath("//input[@name='dias_prazo_prorrog_posse']"));
		inputProrrogacaoPosse.sendKeys(CadastroCargos_Parametros.getInputProrrogacaoPosse());
		Utilizaveis.tempo(2);

		WebElement btnSalvarHistorico = getDriver().findElement(By.xpath(
				"//div[4]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		btnSalvarHistorico.click();
		
		Utilizaveis.tempo(2);
		//Grid Jornada 
		
		WebElement ClickJornadaNovo = getDriver().findElement(By.xpath("//div[4]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		ClickJornadaNovo.click();
		
		WebElement drpJornada = getDriver().findElement(By.id("drpJornada")) ;
		Utilizaveis.buscaDrop(drpJornada, CadastroCargos_Parametros.getDrpJornada());
		
		WebElement checkPad = getDriver().findElement(By.id("chkPadrao"));
		checkPad.click();
		
		Utilizaveis.tempo(3);
		WebElement btnJornSalvar = getDriver().findElement(By.xpath("//div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		btnJornSalvar.click();
		Utilizaveis.tempo(3);
		
		
	}

}
