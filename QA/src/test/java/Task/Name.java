package Task;
import org.openqa.selenium.WebDriver;

import Locators.*;
import Actions.SendKey;

public class Name {
	public static void nameOfUser(WebDriver driver) throws InterruptedException{
		SendKey.text(driver, Text.firstName, "Diego");
	    SendKey.text(driver, Text.lastName, "Mendoza");
	    SendKey.text(driver, Text.email, "damendozam6@gmail.com");
	    Birthday.birthdayOfUser(driver);
	}
}
