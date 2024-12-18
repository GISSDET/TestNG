package testNGPackage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGClass {
	@Test(priority=3)
	void firstTest()
	{
		System.out.println("1");
		
	}
	@Test(priority =2)
	void SecondTest()
	{
		System.out.println("2");
		Assert.assertEquals("actualTitle", "expectedTitle", "Title does not match!");
		
	}
	@Test (priority =1 )
		void ThirdTest()
		{
			System.out.println("3");
			Assert.assertEquals("actualTitle", "actualTitle", "Title does not match!");
			
		}
	
	}



