package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click {
	public static void on(WebDriver driver,By locator) {
		WebElement buttonObject = driver.findElement(locator);
		buttonObject.click();
	}

}
