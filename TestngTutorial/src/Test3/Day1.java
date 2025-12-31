package Test3;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	

	@Test
	public void Demo() {
		System.out.println("Hello TestNG Tutorial");
	}
	
	@Test
	public void TestTwo() {
		System.out.println("Hellooooo");
	    Assert.assertTrue(false);
	}

}
