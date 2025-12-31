package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
/* 
 * Testng not need java library 
 * as in java if we write any thing we need to write it inside -> public static Void main(String[] args)

    */
	
	@AfterTest
	public void First() {
		System.out.println("I will Execute in the end  OF this Suite-> Personal info (Sbse Pehle Likha phir bhi )");
	}
	
	@AfterSuite
	public void AfterSuit() {
		System.out.println("Suite k End Mai print hoga");
	}
	@Test(groups={"smoke"})
	public void Demo() {
		System.out.println("Hello TestNG Tutorial");
	}
	
	@Test
	public void TestTwo() {
		System.out.println("We Are In First Class");
	}

}
