package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	

	
	@Test
	public void Demo() {
		System.out.println("We Are In New Class");
	}
	
	@BeforeTest
	public void TestTwo() {
		System.out.println("I will execute in the begning of this Suite-> Personal info(End Mai Likha h phir bhi )");
	}
	
}
