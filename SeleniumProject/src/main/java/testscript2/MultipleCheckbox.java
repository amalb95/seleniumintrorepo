package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleCheckbox extends Base{
	public void multipleCheckbox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement one = driver.findElement(By.id("check-box-one"));
		one.click();
		WebElement four = driver.findElement(By.id("check-box-four"));
		four.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleCheckbox multiplecheckbox = new MultipleCheckbox();
		multiplecheckbox.initialiseBrowser();
		multiplecheckbox.multipleCheckbox();
	}

}
