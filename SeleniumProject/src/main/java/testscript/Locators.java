package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void id() {
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		//method used to locate a single webelement on a webpage
		//By is a class used to locate a webelement
		// id() etc. are methods of By class
		WebElement message = driver.findElement(By.id("single-input-field"));
		WebElement showmessage = driver.findElement(By.id("button-one"));
		WebElement valuea = driver.findElement(By.id("value-a"));
		WebElement valueb = driver.findElement(By.id("value-b"));
		WebElement gettotal = driver.findElement(By.id("button-two"));
		
		
		
	}
	
	public void className() {
		
	}
	
	public void tagName() {
		
	}
	
	public void name() {
	
	}

	public void linkText() {
		
	}
	
	public void partialLinkText() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators = new Locators();
		locators.initialiseBrowser();
		locators.id();
		locators.driverQuitAndClose();
	}

}
