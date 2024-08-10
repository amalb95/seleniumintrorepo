package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBoxDemo extends Base{
	public void checkBoxDemo() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox = driver.findElement(By.id("gridCheck"));
		if(checkbox.isSelected()) {
			checkbox.click();
			System.out.println("Checkbox is not selected");
		}
		else {
			checkbox.click();
			System.out.println("Checkbox is selected");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxDemo checkboxdemo = new CheckBoxDemo();
		checkboxdemo.initialiseBrowser();
		checkboxdemo.checkBoxDemo();
	}

}
