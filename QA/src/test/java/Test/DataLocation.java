package Test;
import org.openqa.selenium.WebDriver;

import Actions.Click;
import Locators.Button;
import Task.Positon;

public class DataLocation {
	public static void on(WebDriver driver) throws InterruptedException {
		Positon.writePosition(driver);
		Click.on(driver, Button.buttonToDevice);
	}
}
