package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Actions.Checking;
import Locators.Check;
import Locators.Text;

public class Permissions {
	public static void checkPermissos(WebDriver driver) throws InterruptedException {
		Password.setPassword(driver, Text.password1, Text.password2);
		Checking.checkOn(driver,Check.newsletterOptIn);
		Checking.checkOn(driver,Check.termOfUse);
		Checking.checkOn(driver,Check.privacySetting);
	}
}
