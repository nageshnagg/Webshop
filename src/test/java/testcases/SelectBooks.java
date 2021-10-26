package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class SelectBooks extends baseclass {
	
	
	@Test
	//Select Items in Books
	public void SelectBooksAddtocart() throws InterruptedException {
		
		driver.findElement(By.xpath(pro.getProperty("books2"))).click();
		
		driver.findElement(By.xpath(pro.getProperty("ciaddtocart"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("fictionaddtocart"))).click();
		Thread.sleep(2000);
	}

}
