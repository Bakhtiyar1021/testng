package framework.Testng.BeforeTest_and_AfterTest;

import org.junit.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

public class TestSuite2
{

/*	 @Test
	  public void tc004() 
	  {
		 Reporter.log("tc004  Executed",true);
	  }
	  
	  @Test
	  public void tc005() 
	  {
		  Reporter.log("tc005  Executed",true);
	  }
	  
	  
	  @Test
	  public void tc006() 
	  {
		 
		  Reporter.log("Tc006 executed",true);
	  }
	  
	  @BeforeSuite  //This annotation invoke before Suite Execution Starts
	  public void beforesuite()
	  {
		  System.out.println("before suite executed");
	  }   */
	  
	  
	  
	 @Test
	 public void tc004()
	 {
		 Reporter.log("tc004 executed, true");
	 }
	  
	 @Test
	 public void tc005() 
	 {
		 Reporter.log("tc005 executed, true");
	 }
	 
	 @Test
	 public void tc006()
	 {
		 Reporter.log("tc006 executed, true");
	 }
	 
	 @BeforeSuite
	 public void BeforeSuite()
	 {
		 Reporter.log("Before suite executed");
	 }
	 
	  
	  
}
