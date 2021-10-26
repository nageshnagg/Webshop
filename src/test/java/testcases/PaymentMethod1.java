package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class PaymentMethod1 extends baseclass{
	
	@Test
	public void payment() {
		
		driver.findElement(By.xpath(pro.getProperty("cod"))).click();
		driver.findElement(By.xpath(pro.getProperty("pmcontinue"))).click();
		
		
		
	}

}
