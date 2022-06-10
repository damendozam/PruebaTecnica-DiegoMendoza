package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checking {
	public static void checkOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
}
