package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling  extends Base{
	
	public void tablePrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableone = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tableone.getText());
		String str = tableone.getText();
		if(str.contains("Ashton Cox")) System.out.println("Employee Found");
		else System.out.println("Employee not found");
	}
	
	public void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowone = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(rowone.getText());
	}
	
	public void cellPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cellone = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[2]"));
		System.out.println(cellone.getText());
	}
	
	public void columnPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tablelist = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		for(WebElement menu:tablelist) {
			System.out.println(menu.getText());
		}
		
	
	}
	
	public void searchElement() {
		String str = "Ashton Cox";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> employee = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement emp:employee) {
			if(str.equals(emp.getText()))
				System.out.println("Employee name is same:"+emp.getText());
			
		}
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling = new TableHandling();
		tablehandling.initialiseBrowser();
		tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		//tablehandling.cellPrinting();
		//tablehandling.columnPrinting();
		//tablehandling.searchElement();
	}

}
