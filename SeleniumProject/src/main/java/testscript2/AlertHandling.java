package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base{
	
	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simpleAlertClick = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simpleAlertClick.click();
		driver.switchTo().alert().accept();
		
	}
	
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmationAlertClick = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmationAlertClick.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}
	
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptAlertClick = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promptAlertClick.click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.initialiseBrowser();
		//alerthandling.simpleAlert();
		//alerthandling.promptAlert();
		alerthandling.confirmationAlert();
	}

}
