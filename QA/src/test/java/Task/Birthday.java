package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locators.Select;
import Actions.SelectOption;
public class Birthday {
	public static void birthdayOfUser(WebDriver driver) {
		SelectOption.selctSimple(driver, Select.month, By.xpath("//option[@label=\"August\"]"));
		SelectOption.selctSimple(driver, Select.day, By.xpath("//option[@label=\"10\"]"));
		SelectOption.selctSimple(driver, Select.year, By.xpath("//option[@label=\"1995\"]"));
	}
}
