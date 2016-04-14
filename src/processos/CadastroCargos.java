package processos;

import org.openqa.selenium.*;

import utilitarios.ContextFirefox;
import utilitarios.Utilizaveis;

public class CadastroCargos extends ContextFirefox{
	
	public void cadastroCargHist () throws InterruptedException{
		
		getDriver().get("");
		Utilizaveis.logarCust();
		
		//Botão NOvo
		Utilizaveis.clicarNovo();
		
		WebElement inputCargo = getDriver().findElement(By.xpath("//input[@name='cargo']"));
		inputCargo.sendKeys("369852");

		WebElement inputDescCargo = getDriver().findElement(By.xpath("//input[@name='nome']"));
		inputDescCargo.sendKeys("Cargo_Padrão_Auto_Descrição");

		WebElement drpControlevaga = getDriver().findElement(By.xpath("//input[@name='controle_vaga']"));
		Utilizaveis.buscaDrop(drpControlevaga, "Livre");

		WebElement drpCategoria = getDriver().findElement(By.xpath("//input[@name='categoria']"));
		Utilizaveis.buscaDrop(drpCategoria, "Teste_Auto - Teste_Auto_Desc");

		WebElement drpSubcategoria = getDriver().findElement(By.xpath("//input[@name='subcategoria']"));
		Utilizaveis.buscaDrop(drpSubcategoria, "Teste_Auto_SUbCat - Teste_Auto_Desc_SUbCat");


		WebElement drpCargoFunçao = getDriver().findElement(By.xpath("//input[@name='cargo_funcao']"));
		Utilizaveis.buscaDrop(drpCargoFunçao, "Cargo efetivo");
		
		WebElement drpTipocargo = getDriver().findElement(By.xpath("//input[@name='tipo_cargo']"));
		Utilizaveis.buscaDrop(drpTipocargo, "Auto_Tipos_cargo - Auto_Tipos_cargo");

		WebElement drpEscolaridade = getDriver().findElement(By.xpath("//input[@name='escolaridade']"));
		Utilizaveis.buscaDrop(drpEscolaridade, "Doutorado-Doutorado");
		
		//Botão SAlvar "Detalhe"
		Utilizaveis.clicarSalvar();

		//Clicar na aba Historico
		WebElement abaHistorico = getDriver()
				.findElement(By.xpath("//div[7]/div[1]/div[1]/ul/li[4]/a[2]/em/span/span"));
		abaHistorico.click();
		Utilizaveis.tempo(2);
		
		//Botão novo aba "Histotico"
		
		WebElement btnNovoHitorico = getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		btnNovoHitorico.click();
		Utilizaveis.tempo(3);
	
		
		//Formulário
		WebElement inputInicio = getDriver().findElement(By.xpath("//input[@name='dtini']"));
		inputInicio.sendKeys("13042016");

		WebElement drpTabelaVencimentos = getDriver().findElement(By.xpath("//input[@id='drpTabVenc']"));
		Utilizaveis.buscaDrop(drpTabelaVencimentos, "Valor");
		// selecionar o valor cadastrado na página ERGadm00014

		WebElement drpReferenciaInicial = getDriver().findElement(By.xpath("//input[@id='drpRefini']"));
		Utilizaveis.buscaDrop(drpReferenciaInicial, "Valor");
		// Selecionar um valor

		WebElement drpReferenciaFinal = getDriver().findElement(By.xpath("//input[@id='drpReffim']"));
		Utilizaveis.buscaDrop(drpReferenciaFinal, "Valor");
		// Selecionar um valor

		WebElement drpSindicato = getDriver().findElement(By.xpath("//input[@name='sindicato']"));
		Utilizaveis.buscaDrop(drpSindicato, "Valor");
		// selecionar um valor cadastrado na página ERGadm00048

		WebElement inputInsalubridade = getDriver().findElement(By.xpath("//input[@name='percinsal']"));
		inputInsalubridade.sendKeys("10");

		WebElement inputPericulosidade = getDriver().findElement(By.xpath("//input[@name='percperic']"));
		inputPericulosidade.sendKeys("10");

		WebElement inputDiasPrazoPosse = getDriver().findElement(By.xpath("//input[@name='dias_prazo_posse']"));
		inputDiasPrazoPosse.sendKeys("10");

		WebElement inputProrrogacaoPosse = getDriver()
				.findElement(By.xpath("//input[@name='dias_prazo_prorrog_posse']"));
		inputProrrogacaoPosse.sendKeys("5");
		Utilizaveis.tempo(2);

		WebElement btnSalvarHistorico = getDriver().findElement(By.xpath(
				"//div[4]/div/div/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		btnSalvarHistorico.click();
	
		Utilizaveis.tempo(3);
		
		
	}

}
