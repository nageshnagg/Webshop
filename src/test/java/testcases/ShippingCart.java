package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class ShippingCart extends baseclass {
	
	@Test
	public void shippingcartcheckout() {
		
		driver.findElement(By.xpath(pro.getProperty("checkbox"))).click();
		
		driver.findElement(By.xpath(pro.getProperty("checkout"))).click();
		
		Select new1 = new Select(driver.findElement(By.xpath(pro.getProperty("dropdownclick"))));
		new1.selectByVisibleText("New Address");
	}

}
