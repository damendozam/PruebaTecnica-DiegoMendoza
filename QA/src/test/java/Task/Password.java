package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Actions.SendKey;

public class Password {
	public static void setPassword(WebDriver driver,By locator1, By locator2) throws InterruptedException {
		Thread.sleep(1000);
		SendKey.text(driver, locator1, "Usuario2022");
		SendKey.text(driver, locator2, "Usuario2022");
	}
}
