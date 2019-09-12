package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMsteps {
	
	WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("I open OrangeHRM homepage")
	public void i_open_OrangeHRM_homepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
		boolean status = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		Assert.assertEquals(true, status); //expected, actual
	}

	@Then("Close browser")
	public void close_browser() {
	   driver.quit();
	}
	
	//cont here: https://www.youtube.com/watch?v=d56lRIAwQEI&list=PLUDwpEzHYYLuOleK8iPl6kc2UbXGvllBY&index=6

}
