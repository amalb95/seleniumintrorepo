package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector  extends Base{
	public void tagId() { //tag#id
		WebElement element = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement element1 = driver.findElement(By.cssSelector("input#value-a"));
		//WebElement element = driver.findElement(By.cssSelector(""));
		WebElement element2 = driver.findElement(By.cssSelector("input#value-b"));
		WebElement element3 = driver.findElement(By.cssSelector("button#button-one"));
	}
	
	public void tagClass() { //tag.class
		WebElement element4 = driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement element5 = driver.findElement(By.cssSelector("div.header-top"));
		WebElement element6 = driver.findElement(By.cssSelector("section.clearfix"));
		WebElement element7 = driver.findElement(By.cssSelector("div.container page"));
	}
	public void tagAttribute() { //tag[attribute=value]
		WebElement element8 = driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement element9 = driver.findElement(By.cssSelector("input[id='value-a']"));
		WebElement element10 = driver.findElement(By.cssSelector("input[id='value-b']"));
		WebElement element11 = driver.findElement(By.cssSelector("button[id='button-two']"));
		WebElement element12 = driver.findElement(By.cssSelector("input[placeholder='Message']"));
		
	}
	public void tagClassAttribute() { //tag.classname[attribute=value]
		WebElement element13 = driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
		WebElement element14 = driver.findElement(By.cssSelector("a.nav-link[id='progress-bars']"));
		WebElement element15 = driver.findElement(By.cssSelector("a.nav-link[id='alert-modal']"));
		WebElement element16 = driver.findElement(By.cssSelector("a.nav-link[id='list0box']"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CssSelector cssselector = new CssSelector();
		cssselector.initialiseBrowser();
		cssselector.tagId();
		cssselector.tagClass();
		cssselector.tagAttribute();
		cssselector.tagClassAttribute();
		cssselector.driverQuitAndClose();
	}

}
