package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.Select;
import Locators.Text;
import Actions.SelectOption;
import Actions.SendKey;

public class Positon {
	public static void writePosition(WebDriver driver) throws InterruptedException {
		SendKey.text(driver, Text.city,"Bogotá");
		SendKey.text(driver, Text.zip,"1111111");
		Thread.sleep(500);
		SelectOption.selectComplex(driver, Select.country, By.id("ui-select-choices-row-2-10"));
	}
}
