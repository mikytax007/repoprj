package qaclickacademy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void ymethod()
    {
    	System.out.println("im commig from y method 1st");
    	System.out.println("im commig from y method 2nd");
    	System.out.println("im commig from y method 3rd");
    	
    	System.out.println("im commig from y method 4st");
    	System.out.println("im commig from y method 5nd");
    	System.out.println("im commig from y method 6rd");
    }
    
    public void branchmethodofrepoprj()
    {
    	System.out.println("im in branch");
    }
    
    public void addnewmethodtoXDevelop()
    {
    	System.out.println("im in addnewmethodtoXDevelop");
    }
    public void simplyadded()
    {
    	System.out.println("im in simplyadded");
    }
}
