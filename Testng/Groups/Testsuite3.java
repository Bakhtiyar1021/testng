package framework.Testng.Groups;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testsuite3
{
/* 	@Test(groups="Reg1")
	  public void tc007() 
	  {
		  Assert.assertTrue(false);
		  Reporter.log("tc007  Executed",true);
	  }
	  
	  
	  @Test(groups="Reg2",dependsOnGroups="Reg1")
	  public void tc008()
	  {
		  Reporter.log("Tc008 executed",true);
	  }
	  
	  @Test(groups="Reg2",dependsOnGroups="Reg1")
	  public void tc009()
	  {
		  Reporter.log("Tc009 executed",true);
	  }    */

	  
	  
	  
     @Test(groups="Reg1")
	 public void tc007()
	 {
		 Assert.assertTrue(false);
		 Reporter.log("tcc007 Executed, true");
	 }
	  
	 @Test(groups="Reg2",dependsOnGroups="Reg1")
	 public void tc008()
	 {
		 Reporter.log("tc008 Executed, true");
	 }
	  
	 @Test(groups="Reg2",dependsOnGroups="Reg1")
	 public void tc009()
	 {
		 Reporter.log("tc009 Executed, true");
	 }  
	  
	  
	  
	  
}

