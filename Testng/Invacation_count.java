package framework.Testng;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Invacation_count 
{
	
/*	@Test(invocationCount=5)
	  public void Tc001() 
	  {
		  System.out.println("Hello friends");
		  
	  }
	  
	  
	  WebDriver driver;
	  String Driver_path="drivers\\";
	  String url="https://www.facebook.com/r.php";
	  
	  @BeforeClass
	  public void beforeclass()
	  {
		  System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  
	  
	  int count=0;
	  @Test(invocationCount=12)
	  public void select_month()
	  {
		  Select Month_Selector=new Select(driver.findElement(By.id("month")));	
		  Month_Selector.selectByIndex(count);
		  
		  count=count+1;
  }     */
	
	
	
	@Test(invocationCount=5)
	public void Tc001()
	{
		System.out.println("Hello Guys");
	}
	
	
	 WebDriver driver;
	 String  Driver_path= "driver\\";
	 String Url="https://www.facebook.com/r.php";
	
	 
	 @BeforeClass
	  public void beforeclass()
	  {
		 
		 System.setProperty("Webdriver.chrome.driver", Driver_path+"chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get(Url);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	  }
	
	  int count=0;
	  @Test(invocationCount=12)
	  public void Select_Month()
	  {
		  Select Month_Selector=new Select(driver.findElement(By.id("month")));
		  Month_Selector.selectByIndex(count);
		  
		  count=count+1;
		  
	  }
	
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	  
}
