package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.Select;

public class Origin {

	public static void languajeNative(WebDriver driver) {
	    driver.findElement(Select.languaje).findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("German");
	    driver.findElement(By.xpath("//div[@ng-bind-html=\"language.name | highlight: $select.search\"]")).click();
	    /*
	     driver.findElement(By.xpath("//div[@placeholder=\"Select a country\"]")).click();
		 driver.findElement(By.id("ui-select-choices-row-2-10")).click();
	     */
	}
}
