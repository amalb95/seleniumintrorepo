package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathExamples extends Base {
	public void relativexpath() {
		/*Relative xpath
		*Syntax
		//tagname[@attributetype='value']
		*/
		WebElement message = driver.findElement(By.xpath("//input[@placeholder='Message']"));
		/*
		 Absolute Xpath
		/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
		*/
	}
	public void dynamicXPath() {
		/*
		 * Dynamic xpath
		 * 1.contains
		 * 
		 * 2.text
		 * 
		 * 3.starts with
		 * 
		 * and or
		 */
		
		//contains
		WebElement showmessage = driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		WebElement checkbox = driver.findElement(By.xpath("//a[contains(@href,'check-box')]"));
		WebElement radiobutton = driver.findElement(By.xpath("//a[contains(@href,'radio')]"));
		WebElement jqueryselect = driver.findElement(By.xpath("//a[contains(@href,'jquery-select')]"));
		
		//text
		WebElement showmessage1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement gettotal = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement jqueryselect2 = driver.findElement(By.xpath("//a[text()='Jquery Select2']"));
		WebElement ajax = driver.findElement(By.xpath("//a[text()='Ajax Form Submit']"));
		WebElement total = driver.findElement(By.xpath("//div[text()=' Total A + B :']"));
		
		//starts with
		//tag[starts-with(@attribute,'value')]
		
		// and / or
		/*
		 * //tag[@attribute='value' and @attribute='value']
		 * //tag[@attribute='value' or @attribute='value']
		 * 
		 */
		 
	}
	/* Xpath Axes methods
	 * 1. Parent
	 * driver.findElement(By.xpath("//button[text()='Show Message']//parent::form"));  give tag or xpath
	 * 2. Child
	 * //a[@class='navbar-brand']//child::img[@alt='logo'] give tag or xpath
	 * 3. Following
	 * //input[@type='text']//following::input
	 * 4. indexing
	 * //form[@method='POST'][1]
	 */
	public void xPathAxes() {
		//Parent
		WebElement formpost = driver.findElement(By.xpath("//div[@id='message-one']//parent::form"));
		WebElement valueb = driver.findElement(By.xpath("//input[@id='value-b']//parent::div"));
		WebElement valuea = driver.findElement(By.xpath("//input[@id='value-a']//parent::div"));
		//WebElement element = driver.findElement(By.xpath(""));
		
		//Child
		WebElement logo = driver.findElement(By.xpath("//div[@class='top-logo']//child::a"));
		//WebElement element = driver.findElement(By.xpath(""));
		//WebElement element = driver.findElement(By.xpath(""));
		//WebElement element = driver.findElement(By.xpath(""));
		
		//Following
		//WebElement element = driver.findElement(By.xpath(""));
		//WebElement element = driver.findElement(By.xpath(""));
		//WebElement element = driver.findElement(By.xpath(""));
		//WebElement element = driver.findElement(By.xpath(""));
		
		//Indexing
		WebElement message = driver.findElement(By.xpath("//input[@type='text'][1]"));
		WebElement avalue = driver.findElement(By.xpath("//input[@type='text'][2]"));
		WebElement bvalue = driver.findElement(By.xpath("//input[@type='text'][3]"));
		//WebElement element = driver.findElement(By.xpath(""));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XPathExamples xpathexamples = new XPathExamples();
		xpathexamples.initialiseBrowser();
		xpathexamples.relativexpath();
		xpathexamples.driverQuitAndClose();
	}

}
