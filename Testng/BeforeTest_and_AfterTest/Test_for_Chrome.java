package framework.Testng.BeforeTest_and_AfterTest;

import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test_for_Chrome 
{

/*	@BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("Pretest before launch chrome");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("post after launch chrome");
	  }
	  
	  
	  @Test
	  public void tc_chrome()
	  {
		  System.out.println("chrome test finished");
	  }     */

	  
	 
	 @BeforeTest
	 public void BeforeTest()
	 {
		 System.out.println("Preconditioin before launch chorme");
	 }
	
	 @AfterTest
	 public void AfterTest()
	 {
		 System.out.println("Postcondition after launch chrome");
	 }
	  
	 @Test
	 public void tc_chrome()
	 {
		 System.out.println("Chrome launch completed");
	 }
	  
	  
	  
	  

}
