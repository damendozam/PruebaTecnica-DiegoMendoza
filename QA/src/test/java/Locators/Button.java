package Locators;

import org.openqa.selenium.By;

public class Button {
	public static By buttonJoin        = By.xpath("//a[@href=\"/signup/personal\"]");
	public static By buttonToLocation  = By.xpath("//a[@aria-label=\"Next step - define your location\"]");
	public static By buttonToDevice    = By.xpath("//a[@class=\"btn btn-blue pull-right\"]");
	public static By buttonToPermissos = By.xpath("//a[@aria-label=\"Next - final step\"]");
	public static By buttonLoging      = By.id("laddaBtn");
}
