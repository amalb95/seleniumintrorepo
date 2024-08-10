package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButtonDemo extends Base{
	
	public void radioButtonDemo() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio = driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//input[@id='inlineRadio1']"));
		if(radio.isSelected()) {
			System.out.println("Radio button is already selected");
		}
		else {
			radio.click();
			System.out.println("Radio button is selected");
		}
	}
	
	public void radioButtonclick() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio = driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//input[@id='inlineRadio1']"));
		radio.click();
		if(radio.isSelected()) {
			System.out.println("Radio button is already selected");
		}
		else {
			radio.click();
			System.out.println("Radio button is not selected");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtonDemo radiobuttondemo = new RadioButtonDemo();
		radiobuttondemo.initialiseBrowser();
		//radiobuttondemo.radioButtonDemo();
		radiobuttondemo.radioButtonclick();
		
	}

}
