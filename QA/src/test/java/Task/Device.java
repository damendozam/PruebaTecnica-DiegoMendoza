package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Locators.Select;

public class Device {
	static WebDriver driver;
	public static void  beging(WebDriver driverInput){
		driver=driverInput;
		Select.justPage(driverInput);
	}
	public static void registerPC() throws InterruptedException {
		Thread.sleep(500);
		Select.yourPC.click();
		Thread.sleep(500);
		driver.findElement(By.id("ui-select-choices-row-3-2")).click();
	}
	public static void registerVersion() throws InterruptedException {
		Thread.sleep(500);
		Select.versionPC.click();
		Thread.sleep(500);
		driver.findElement(By.id("ui-select-choices-row-4-2")).click();
	}
	public static void registerLanguaje() throws InterruptedException {
		Thread.sleep(500);
		Select.languajePC.click();
		Thread.sleep(500);
		driver.findElement(By.id("ui-select-choices-row-5-2")).click();
	}
	public static void mobileDeviceCell() throws InterruptedException{
		Thread.sleep(500);
		Select.yourCell.click();
		Thread.sleep(500);
		driver.findElement(By.id("ui-select-choices-row-6-2")).click();
	}
	public static void modelCell() throws InterruptedException {
		Thread.sleep(500);
		Select.modelCell.click();
		Thread.sleep(500);
		driver.findElement(By.id("ui-select-choices-row-7-2")).click();
	}
	public static void osCell() throws InterruptedException {
		Thread.sleep(500);
		Select.opSysCell.click();
		Thread.sleep(500);
		driver.findElement(By.id("ui-select-choices-row-8-2")).click();
	}
}
