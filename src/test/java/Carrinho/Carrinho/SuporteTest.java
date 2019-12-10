package Carrinho.Carrinho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SuporteTest {
	
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver",
				"/home/aula_tav2/Documentos/topicos avançados pendrive/drivers/geckodriver");

		return (new FirefoxDriver());
	}
}
