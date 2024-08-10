package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxExample extends Base{
	
	public void checkBoxExample() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox = driver.findElement(By.id("gridCheck"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxExample checkboxexample = new CheckBoxExample();
		checkboxexample.initialiseBrowser();
		checkboxexample.checkBoxExample();
	}

}
