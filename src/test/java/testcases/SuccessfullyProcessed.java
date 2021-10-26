package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class SuccessfullyProcessed extends baseclass {
	@Test
	public void payment() {
		
	System.out.println(driver.findElement(By.xpath(pro.getProperty("orderno"))).getText());
		
	System.out.println(driver.findElement(By.xpath(pro.getProperty("success"))).getText());
	
		
		driver.findElement(By.xpath(pro.getProperty("tycontinue"))).click();
		
		
	} 

}
