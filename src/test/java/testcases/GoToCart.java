package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class GoToCart extends baseclass {
	
	@Test(priority = 1)
	//Move to the shipping carts 
	public void addtocart() throws InterruptedException {
		
		WebElement txtUsername = driver.findElement(By.xpath(pro.getProperty("movetoshippingcartlink")));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername).build();
		seriesOfActions.perform() ;
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 2)
	//Click on Gotocarts
	public void clickgotocart() {
		
		driver.findElement(By.xpath(pro.getProperty("gotocartbtn"))).click();
		
	}

}
