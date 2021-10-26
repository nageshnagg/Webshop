package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import utilities.ExtentManager;



public class baseclass {
	
	    public static WebDriver driver;
	    public static WebElement driver1;
		public static Properties pro;
		public static Properties or;
		public static FileInputStream fis;
		public static String browser;
		
	
	@BeforeSuite
	 public void BeforeSuite() {
	  ExtentManager.setExtent();
	 }
	 
	 @AfterSuite
	 public void AfterSuite() {
	  ExtentManager.endReport();
	 }
	 
	 @BeforeMethod
	 public void setup() {
					
		 if (driver == null) {
					try {
						fis= new FileInputStream("C:\\Users\\Nagesh\\webshop\\configurations\\config.properties");
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					pro=new Properties();
					try {
						pro.load(fis);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					String ss=pro.getProperty("browser");
					System.out.println(ss);
					
			
				if(pro.getProperty("browser").equals("chrome")) {
					
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagesh\\webshop\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				
				}else if(pro.getProperty("browser").equals("firefox")) {
					
					System.setProperty("webdriver.gecko.driver","C:\\Users\\Nagesh\\webshop\\Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
					
			}
			    
				driver.manage().window().maximize();
				driver.get(pro.getProperty("url"));
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 }
	 
	 }
	 
	 public static String screenShot(WebDriver driver,String filename) {
	  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	  String destination = System.getProperty("user.dir")+"\\ScreenShot\\"+filename+"_"+dateName+".png";
	  File finalDestination= new File(destination);
	  try {
	   FileUtils.copyFile(source, finalDestination);
	  } catch (Exception e) {
	   // TODO Auto-generated catch block
	   e.getMessage();
	  }
	  return destination;
	 }
	 
	 public static String getCurrentTime() {  
	     String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());  
	     return currentDate;  
	 }  

	
		@AfterSuite
		 public void tearDown() throws IOException {
			 if(driver!= null) {
					driver.quit();
					driver.close();
					}
		 } 
}
