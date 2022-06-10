package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Actions.Click;
import Task.Birthday;
import Task.*;
import Locators.Button;
import Locators.Page;

public class DataContact {
	public static void on(WebDriver driver) throws InterruptedException {
		Name.nameOfUser(driver);
		Birthday.birthdayOfUser(driver);
		Origin.languajeNative(driver);
		Click.on(driver, Button.buttonToLocation);
	}
}
