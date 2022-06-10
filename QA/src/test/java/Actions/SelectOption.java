package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectOption {
	public static void selctSimple(WebDriver driver,By type,By option){
		driver.findElement(type).findElement(option).click();
	}
	public static void selectComplex(WebDriver driver,By type,By option) {
		driver.findElement(type).click();
		driver.findElement(option).click();
	}
}
