package framework.Testng.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testsuite2 
{
/*	 @Test(groups="Reg2")
	  public void tc004() 
	  {
		 Reporter.log("tc004  Executed",true);
	  }
	  
	  @Test(groups="Reg1")
	  public void tc005() 
	  {
		  Reporter.log("tc005  Executed",true);
	  }
	  
	  
	  @Test(groups="Reg2")
	  public void tc006() 
	  {
		  Reporter.log("Tc006 executed",true);
	  } */
	 
	
	  
	  @Test(groups= {"reg2"})
	  public void tc004()
	  {
		  Reporter.log("tc004 Executed,true");
	  }
	  
	  @Test(groups= {"reg1"})
	  public void tc005()
	  {
		  Reporter.log("tc005 Executed,true");
	  }
	  
	  @Test(groups= {"reg2"})
	  public void tc006()
	  {
		  Reporter.log("tc006 Executed, true ");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
