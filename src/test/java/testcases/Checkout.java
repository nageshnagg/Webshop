package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.baseclass;
import utilities.XLUtility;

public class Checkout extends baseclass {
	
	@Test(priority = 1)
	public void BillingAddress() {
		
		Select new1 = new Select(driver.findElement(By.xpath(pro.getProperty("dropdownclick"))));
		new1.selectByVisibleText(pro.getProperty("newaddress"));

}
		@Test(dataProvider = "LoginData1")
		public void excelR(String fname,String lname,String email,String city,String address1,String address2,String zipcode,String phoneno) throws InterruptedException {
			
			try {
				
			WebElement ftxt=driver.findElement(By.xpath(pro.getProperty("firstname")));
			ftxt.clear();
			ftxt.sendKeys(fname);
			
			WebElement ltxt=driver.findElement(By.xpath(pro.getProperty("lastname")));
			ltxt.clear();
			ltxt.sendKeys(lname);
			
			WebElement post=	driver.findElement(By.xpath(pro.getProperty("emailbildingadd")));
			post.clear();
			post.sendKeys(email);
			
			Select Country = new Select(driver.findElement(By.xpath(pro.getProperty("countrydrop"))));
			Country.selectByVisibleText(pro.getProperty("ind"));
			
			
			WebElement city1 = driver.findElement(By.xpath(pro.getProperty("city")));
			city1.sendKeys(city);
			WebElement add1 = driver.findElement(By.xpath(pro.getProperty("address1")));
			add1.sendKeys(address1);
			WebElement add2 = driver.findElement(By.xpath(pro.getProperty("address2")));
			add2.sendKeys(address2);
			WebElement	zip = driver.findElement(By.xpath(pro.getProperty("zipcode")));
			zip.sendKeys(zipcode);
			WebElement phone = driver.findElement(By.xpath(pro.getProperty("phonenumber")));
			phone.sendKeys(phoneno);
			
			driver.findElement(By.xpath(pro.getProperty("bacontinue"))).click();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		@DataProvider(name="LoginData1")
		public String [][] getdata() throws IOException{
			
			String path=".\\src\\test\\java\\testdata\\Billing Address.xlsx";
			XLUtility excel=new XLUtility(path);
			
			int rows=excel.getRowCount("sheet1");
			int cols=excel.getCellCount("sheet1", 1);
			
			String [][] loginData=new String[rows][cols];
					
			for(int i=1;i<=rows;i++) {
				for(int j=0;j<cols;j++) {
					
					loginData[i - 1][j]=excel.getCellData("sheet1", i, j);
				}
				
			}
			
			return loginData;		
		}
		
	
	
	
	@Test(priority = 2)
	public void ShippingAddress() {
		
		
		
	}

	@Test(priority = 3)
	public void ShippingMethod() {
		
	}

	@Test(priority = 4)
	public void PaymentMethod() {
		
	}

	@Test(priority = 5)
	public void PaymentInfomation() {
		
	}

	@Test(priority = 6)
	public void ConfirmOrder() {
		
	}


}
