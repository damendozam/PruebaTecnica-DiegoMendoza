package Test;

import org.openqa.selenium.WebDriver;

import Actions.Click;
import Locators.Button;
import Task.Device;

public class DataDevice {
	public static void on(WebDriver driver) throws InterruptedException {
		Device.beging(driver);
		Device.registerPC();
		Device.registerVersion();
		Device.registerLanguaje();
		Device.mobileDeviceCell();
		Device.modelCell();
		Device.osCell();
		Click.on(driver, Button.buttonToDevice);
	}
}
