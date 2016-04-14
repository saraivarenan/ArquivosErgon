package utilitarios;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ContextFirefox {
 static WebDriver driver;

 @Before
 public void beforePage() {
  driver = new FirefoxDriver();
  driver.get("");
  driver.manage().window().maximize();
 

 }

 @After
 public void afterPage() {
  driver.close();

 }
 public static WebDriver getDriver(){
	 return driver;
 }
}