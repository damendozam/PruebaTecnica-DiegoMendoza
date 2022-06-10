package Task;

import org.openqa.selenium.WebDriver;

import Actions.Click;
import Locators.Button;

public class Join {
	public static void joinLogin(WebDriver driver) {
		Click.on(driver, Button.buttonJoin);
	}
}
