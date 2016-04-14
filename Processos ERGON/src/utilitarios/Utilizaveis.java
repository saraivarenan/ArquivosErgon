package utilitarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
public class Utilizaveis extends ContextFirefox{
	
	public static void logarFabrica(){
		WebElement userLog = getDriver().findElement(By.id("j_user"));
		WebElement passLog = getDriver().findElement(By.id("j_password"));
		WebElement btnEntrar = getDriver().findElement(By.id("j_enter"));
		
		userLog.sendKeys("zeus");
		passLog.sendKeys("zeus");
		btnEntrar.click();
		
		
				
	}
	public static void logarCust(){
		WebElement userLog = getDriver().findElement(By.id("j_user"));
		WebElement passLog = getDriver().findElement(By.id("j_password"));
		WebElement btnEntrar = getDriver().findElement(By.id("j_enter"));
		
		userLog.sendKeys("EquipeCQ");
		passLog.sendKeys("equipecq");
		btnEntrar.click();
		
				
	}
	public static void tempo(int tempoSegundos) {

		tempoSegundos = tempoSegundos * 1000;
		try {
			Thread.sleep(tempoSegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public static void buscaDrop(WebElement drpNome, String ValorComparado) {

		int cont = 0;
		String nomeFunc = drpNome.getAttribute("value");
		while (!nomeFunc.equals("@@@")) {
			drpNome.sendKeys(Keys.ARROW_DOWN);
			drpNome.sendKeys(Keys.ARROW_DOWN);
			drpNome.sendKeys(Keys.ENTER);
			nomeFunc = drpNome.getAttribute("value");
			cont++;

		

			if (nomeFunc.equals(ValorComparado)) {
				drpNome.sendKeys(Keys.TAB);
				break;

			} else if (cont > 20) {
				buscaDropReverso(drpNome, ValorComparado);
				break;

			}

		}
	}
	public static void buscaDropReverso(WebElement ElementoDrp, String ValorComparado) {

		int cont = 0;
		String nomeFunc = ElementoDrp.getAttribute("value");
		while (!nomeFunc.equals("@@@")) {
			ElementoDrp.sendKeys(Keys.DOWN);
			ElementoDrp.sendKeys(Keys.ARROW_UP);
			ElementoDrp.sendKeys(Keys.ENTER);
			nomeFunc = ElementoDrp.getAttribute("value");
			cont++;

			System.out.println(nomeFunc);

			if (nomeFunc.equals(ValorComparado)) {
				ElementoDrp.sendKeys(Keys.TAB);
				break;

			} else if (cont > 30) {
				System.out.println("Valor não encontrado");
				break;

			}
		}
	}
	
	
    public static String geraCPF() {  
        String iniciais = "";  
        Integer numero;  
        for (int i = 0; i < 11; i++) {  
            numero = new Integer((int) (Math.random() * 10));  
            iniciais += numero.toString();  
        }
		return iniciais;
    }
    public static void clicarNovo() throws InterruptedException {
    	  getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button plus']")).click();
    	  Thread.sleep(3000);

    	 }
    public static void clicarSalvar() throws InterruptedException{
    	getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button save']")).click();
    	  Thread.sleep(3000);
    	
    }
    public static void fecharNavegador() {
		getDriver().manage().deleteAllCookies();
		getDriver().close();
    
    }
	public static void confirmarRegistro() throws InterruptedException {
		WebElement item = getDriver().findElement(By.xpath("//form/div[1]/div/div/div/div[1]/div/div/div/div[1]/div"));
		
		assertTrue(item.getText().contains("ScriptAuto NATUREZA"));
		Thread.sleep(3000);
	}
	

	

}
