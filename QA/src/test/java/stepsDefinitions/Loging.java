package stepsDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loging {
	private WebDriver driver;
	
	@Given("Page on google")
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@When("Write hello")
	public void testGooglePage() {
	    WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.clear();
		searchBox.sendKeys("ss");
		searchBox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(searchBox.getText(), "ss");
	}
	
	@Then("click in search")
	public void click() {
		WebElement submit = driver.findElement(By.name("btnK"));
		submit.click();
	}

	
}
