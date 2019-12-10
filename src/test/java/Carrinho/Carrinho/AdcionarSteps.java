package Carrinho.Carrinho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Carrinho.Carrinho.SuporteTest;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdcionarSteps {
	WebDriver driver;
	WebElement el;
	
	@Before
	public void setup() {
		driver = SuporteTest.getDriver();
	}
	
	@Given("^Estou na página de compras \"([^\"]*)\"$")
	public void estou_na_página_de_compras(String enderecosite) throws Throwable {
		driver.get(enderecosite);
	    throw new PendingException();
	}

	@When("^Preencher no campo itens o valor \"([^\"]*)\"$")
	public void preencher_no_campo_itens_o_valor(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Pressionado o botão Ok$")
	public void pressionado_o_botão_Ok() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Deveremos ter no campo de texto \"([^\"]*)\"$")
	public void deveremos_ter_no_campo_de_texto(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
