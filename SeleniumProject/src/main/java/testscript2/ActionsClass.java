package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class ActionsClass extends Base{
	public void actionsClass() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement item = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement destination = driver.findElement(By.id("mydropzone"));
		Actions actions = new Actions(driver);
		actions.moveToElement(item).build().perform();
		actions.doubleClick(item).build().perform();
		actions.contextClick(destination).build().perform();
		actions.dragAndDrop(item, destination).build().perform();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionsClass actionsclass = new ActionsClass();
		actionsclass.initialiseBrowser();
		actionsclass.actionsClass();
	}

}
