package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ignore_Method 
{
	
/*	  @Test(priority=0)
	  public void launch() 
	  {
		  
		  Reporter.log("browser launched");
	  }
	  
	  @Test(priority=1)
	  public void load_page() 
	  {
		  Reporter.log("page laod completed");

	  }


	  @Test(priority=2,enabled=false)
	  public void User_Signin() 
	  {
		  Reporter.log("User Login entry completed");
		  
  }   */
	
	  
	  
	  @Test(priority=0)
	  public void launch() 
	  {
		 System.out.println("browser launched");
	  }
	  
	  
	  @Test(priority=1)
	  public void load_page()
	  {
		  System.out.println("Page load completed");
	  }
	  
	  @Test(priority=2,enabled=false)
	  public void User_Signin()
	  {
         System.out.println("User login entry completed");
	  }
	  
	  
	  
	  
	  
	  
}
