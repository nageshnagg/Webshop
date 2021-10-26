package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class ShippingMethod1 extends baseclass{
	
	@Test
	public void next() {
		
		driver.findElement(By.xpath(pro.getProperty("nextdayair"))).click();
		driver.findElement(By.xpath(pro.getProperty("smcontine"))).click();
		
		
	}

}
