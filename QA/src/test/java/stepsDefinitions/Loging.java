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
	By firstName=By.id("firstName");
	By lastName=By.id("lastName");
	By email=By.id("email");
	By month=By.id("birthMonth");
	By day=By.id("birthDay");
	By year=By.id("birthYear");
	By languaje= By.id("languages");
	
	@Given("load page")
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://utest.com/signup/personal");
	}
	
	@When("write user")
	public void write(){
	    driver.findElement(firstName).sendKeys("Diego");
	    driver.findElement(lastName).sendKeys("Mendoza");
	    driver.findElement(email).sendKeys("damendozam@gmail.com");
	    driver.findElement(month).findElement(By.xpath("//option[@label=\"August\"]")).click();
	    driver.findElement(day).findElement(By.xpath("//option[@label=\"10\"]")).click();
	    driver.findElement(year).findElement(By.xpath("//option[@label=\"1993\"]")).click();
	    driver.findElement(languaje).findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("German");
	    driver.findElement(By.xpath("//div[@ng-bind-html=\"language.name | highlight: $select.search\"]")).click();
	    	    
	}
	
	@Then("submit")
	public void onClick() {
		driver.findElement(By.xpath("//a[@aria-label=\"Next step - define your location\"]")).click();
	}

	
}
