package testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class ClearShoppingCart extends baseclass {
	
	
	@Test
	//If Already Add Any Items in Addtocart, it will remove and go to the books page
	public void clearaddtocart() throws InterruptedException {
		
		WebElement clik = driver.findElement(By.xpath(pro.getProperty("num")));
		System.out.println(clik.getText());
		String s="(0)";
		if(clik.getText().equals(s))
		{
			driver.findElement(By.xpath(pro.getProperty("books2"))).click();
		}
		else
		{
			
			driver.findElement(By.xpath(pro.getProperty("movetoshippingcartlink"))).click();
			Thread.sleep(2000);
			
    		
    	List<WebElement>cartlist=driver.findElements(By.xpath("//tr[@class='cart-item-row']/td[1]"));
			
    	Iterator<WebElement> cart =cartlist.iterator();
    	
    	while(cart.hasNext())
    	{
    		cart.next().click();
    	}
    	
		driver.findElement(By.xpath(pro.getProperty("updateshippindcartbtn"))).click();
	
		}
	
	}

}
	
