package stepsDefinitions;


import java.util.List;
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
	
	By countries= By.className("ui-select-choices-group");
	
	@Given("load page")
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://utest.com/signup/personal");
	}
	
	@When("write user")
	public void write() throws InterruptedException{
		Thread.sleep(2000);
	    driver.findElement(firstName).clear();
	    driver.findElement(firstName).sendKeys("Diego");
	    driver.findElement(lastName).clear();
	    driver.findElement(lastName).sendKeys("Mendoza");
	    driver.findElement(email).clear();
		Thread.sleep(2000);
	    driver.findElement(email).sendKeys("damendozam1@gmail.com");
	    driver.findElement(month).findElement(By.xpath("//option[@label=\"August\"]")).click();
	    driver.findElement(day).findElement(By.xpath("//option[@label=\"10\"]")).click();
	    driver.findElement(year).findElement(By.xpath("//option[@label=\"1993\"]")).click();
	    driver.findElement(languaje).findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("German");
	    driver.findElement(By.xpath("//div[@ng-bind-html=\"language.name | highlight: $select.search\"]")).click();
		Thread.sleep(2000); 
	    driver.findElement(By.xpath("//a[@aria-label=\"Next step - define your location\"]")).click();
	    
	}
	
	@When("write page contact")
	public void writeData() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Bogotá");
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys("1111111");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@placeholder=\"Select a country\"]")).click();
		driver.findElement(By.id("ui-select-choices-row-2-10")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"btn btn-blue pull-right\"]")).click();
	}
	
	@When("write devices")
	public void selectDevice() throws InterruptedException {
		//div[@class="ui-select-match"]
		List<WebElement> selects = driver.findElements(By.xpath("//div[@class=\"ui-select-match\"]"));
		int num=3;
		for(WebElement i:selects) {
			Thread.sleep(2000);
			i.click();
			Thread.sleep(500);
			driver.findElement(By.id("ui-select-choices-row-"+String.valueOf(num)+"-2")).click();
			Thread.sleep(500);
			num++;
		}
		driver.findElement(By.xpath("//a[@aria-label=\"Next - final step\"]")).click();
	}
	
	@When("write last step")
	public void lastStep() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("Usuario2022");
		driver.findElement(By.id("confirmPassword")).sendKeys("Usuario2022");
		driver.findElement(By.name("newsletterOptIn")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("termOfUse")).click();
		driver.findElement(By.name("privacySetting")).click();
	}
	
	@Then("submit")
	public void onClickDevice() {
		driver.findElement(By.id("laddaBtn")).click();
	}
	
}
