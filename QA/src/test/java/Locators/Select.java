package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select {
	//Easy
	public static By month    = By.id("birthMonth");
	public static By day      = By.id("birthDay");
	public static By year     = By.id("birthYear");
	
	//Complete
	public static By languaje = By.id("languages");
	public static By country  = By.xpath("//div[@placeholder=\"Select a country\"]");
	
	//Just Page
	public static WebElement yourPC;
	public static WebElement versionPC;
	public static WebElement languajePC;
	public static WebElement yourCell;
	public static WebElement modelCell;
	public static WebElement opSysCell;
	
	public static void justPage(WebDriver driverInput) {
		List<WebElement> selects = driverInput.findElements(By.xpath("//div[@class=\"ui-select-match\"]"));
		yourPC     = selects.get(0);
		versionPC  = selects.get(1);
		languajePC = selects.get(2);
		yourCell   = selects.get(3);
		modelCell  = selects.get(4);
		opSysCell  = selects.get(5);
	}	
}
