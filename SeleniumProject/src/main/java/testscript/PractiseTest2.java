package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PractiseTest2 extends Base{
	public void practisetest2() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valuea = driver.findElement(By.id("value-a"));
		valuea.sendKeys("56");
		WebElement valueb = driver.findElement(By.id("value-b"));
		valueb.sendKeys("84");
		WebElement gettotal = driver.findElement(By.id("button-two"));
		gettotal.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PractiseTest2 practisetest2 = new PractiseTest2();
		practisetest2.initialiseBrowser();
		practisetest2.practisetest2();
	}

}
