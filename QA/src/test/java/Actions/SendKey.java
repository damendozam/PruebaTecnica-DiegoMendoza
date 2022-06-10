package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKey {
	public static void text(WebDriver driver,By locator,String theText) throws InterruptedException {
		WebElement textObject=driver.findElement(locator);
		Thread.sleep(300);
		textObject.clear();
		Thread.sleep(100);
		textObject.sendKeys(theText);
	}
}
