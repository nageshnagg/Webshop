package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class PaymentInfo1 extends baseclass {
	@Test
	public void payment() {
		
		driver.findElement(By.xpath(pro.getProperty("picontinue"))).click();
		
		
		
	}


}
