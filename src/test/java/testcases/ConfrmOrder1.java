package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class ConfrmOrder1 extends baseclass {
	@Test
	public void payment() throws InterruptedException {
		
		driver.findElement(By.xpath(pro.getProperty("cocontinue"))).click();
		Thread.sleep(2000);
		
	} 

}
