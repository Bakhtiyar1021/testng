package framework.Testng.Groups;

import org.testng.annotations.Test;

public class Testsuite1
{
	
/*	@Test(groups= {"Reg1","Reg2"})
	  public void tc001() 
	  {
		  System.out.println("tc001 executed");
	  }
	  
	  @Test(groups="Reg2")
	  public void tc002() 
	  {
		  System.out.println("tc002 executed");
	  }
	  
	  
	  @Test(groups="Reg1")
	  public void tc003() 
	  {
		  System.out.println("tc003 executed");
	  }  */
	  

	@Test(groups= {"Reg1,Reg2"})
	public void tc001()
	{
		System.out.println("tc001 executed");
	}
	

	@Test(groups= {"Reg2"})
	public void tc002()
	{
		System.out.println("tc002 executed");
	}
	
	@Test(groups= {"Reg3"})
	public void tc003()
	{
		System.out.println("tc003 executed");
	}
	
	
	
	
	
	
	
	
	
	
}
