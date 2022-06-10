package stepsDefinitions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Actions.Click;
import Locators.Button;
import Task.Join;
import Test.DataContact;
import Test.DataDevice;
import Test.DataLocation;
import Test.DataPermissos;
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
		driver.get("https://utest.com");
		Thread.sleep(2000);
		Join.joinLogin(driver);
	}
	
	@When("write user")
	public void write() throws InterruptedException{
		Thread.sleep(500);
		DataContact.on(driver);
	}
	
	@When("write page contact")
	public void writeData() throws InterruptedException {
		Thread.sleep(500);
		DataLocation.on(driver);
	}
	
	@When("write devices")
	public void selectDevice() throws InterruptedException {
		Thread.sleep(500);
		DataDevice.on(driver);
	}
	
	@When("write last step")
	public void lastStep() throws InterruptedException {
		DataPermissos.on(driver);
	}
	
	@Then("submit")
	public void onClickDevice() {
		Click.on(driver, Button.buttonLoging);
	}
	
}
