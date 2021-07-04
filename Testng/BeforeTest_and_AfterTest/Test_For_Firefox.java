package framework.Testng.BeforeTest_and_AfterTest;

import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test_For_Firefox 
{
	
/*	@BeforeTest
	public void beforetest()
	{
		System.out.println("precondition before launch firefox");
	}


    @AfterTest
    public void afterTest() 
    {
    	System.out.println("posttest after firefox launch ");
    }
    
    
    @Test
    public void firefox_test()
    {
    	System.out.println("firefox test finished");
    }  */
	
	
	
    
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Precondition before launch firefox");
	}
    
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Postcondition after launch firefox");
	}
    
    @Test
    public void tc_firefox()
    {
    	System.out.println("firefox launch completed");
    }
    
    
    
    
    
    
    
}
