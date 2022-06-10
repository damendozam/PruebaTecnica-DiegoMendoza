package Test;

import org.openqa.selenium.WebDriver;
import Task.Permissions;

public class DataPermissos {
	public static void on(WebDriver drive) throws InterruptedException {
		Permissions.checkPermissos(drive);
	}
}
