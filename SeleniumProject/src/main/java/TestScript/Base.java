package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initialiseBrowser() {
		driver = new ChromeDriver(); //Browser Initialisation
		driver.get("https://selenium.qabible.in/"); //Launching the URL
		driver.manage().window().maximize();
	}
	
	public void driverQuitAndClose() {
		driver.close();
		//driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.initialiseBrowser();
		base.driverQuitAndClose();
	}

}