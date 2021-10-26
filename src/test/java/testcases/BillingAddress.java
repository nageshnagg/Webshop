package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class BillingAddress extends baseclass {
	
	@Test(priority = 1)
	public void checkout() throws InterruptedException {
		 
		driver.findElement(By.xpath(pro.getProperty("checkbox"))).click();
		driver.findElement(By.xpath(pro.getProperty("checkout"))).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void BillingAddressdropdown() {
		
		Select new1 = new Select(driver.findElement(By.xpath(pro.getProperty("dropdownclick"))));
		new1.selectByVisibleText(pro.getProperty("newaddress"));

}
	
	
	
	
}
