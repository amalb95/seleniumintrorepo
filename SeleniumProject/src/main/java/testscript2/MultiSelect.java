package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class MultiSelect extends Base{
	public void show() {
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		WebElement multi = driver.findElement(By.id("demo-multiple-select"));
		multi.click();
		Select select = new Select(multi);
		Boolean b = select.isMultiple();
	    System.out.println("Boolean value for multiple dropdown: "+ b);
		select.selectByValue("2");
		select.selectByVisibleText("Movies, Music & Games");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiSelect multiselect = new MultiSelect();
		multiselect.initialiseBrowser();
		multiselect.show();
	}
}