package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class FileUpload extends Base{
	
	public void sendKeys() {
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement pdfclick = driver.findElement(By.xpath("//input[@id='file-upload']"));
		pdfclick.sendKeys("C:\\Users\\DELL-AMAL\\Downloads\\Java.pdf");
		WebElement buttonone = driver.findElement(By.xpath("//input[@id='file-submit']"));
		buttonone.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload = new FileUpload();
		fileupload.initialiseBrowser();
		fileupload.sendKeys();
	}

}
