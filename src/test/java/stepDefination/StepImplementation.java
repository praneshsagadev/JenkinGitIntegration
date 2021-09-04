package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepImplementation {
	
	static WebDriver driver;
	
	@Given("^I load the \"(.+)\"$")
	public void loadTheUrl(String url) {
		
		WebDriverManager.chromedriver().setup();
		if(driver==null) {
		 driver = new ChromeDriver();
			
		}
		driver.get(url);
		
	}
	
	@Then("^I enter (.+) into the username field$")
	public void enterUsername(String name) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(name);
		
	}
	
	@And("^I enter (.+) into the password field$")
	public void enterPassword(String password) {
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
	}
	
	@Then("^I click the login button$")
	public void clickButton() {
		
		driver.findElement(By.id("btnLogin")).submit();
		
		
	}
	

}
