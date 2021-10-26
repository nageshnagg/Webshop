package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.baseclass;
import utilities.XLUtility;

public class ShippingAddress1 extends baseclass {
	
	@Test
	public void shippingadd() {
		
		Select new1 = new Select(driver.findElement(By.xpath(pro.getProperty("drop1"))));
		new1.selectByVisibleText("prasad test, door no:1234, andhrapradhes 12345, India");
		
		
		driver.findElement(By.xpath(pro.getProperty("sacontinue"))).click();
		
	}
	
}
