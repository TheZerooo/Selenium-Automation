package Inheritance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic2 extends Basic  {
	
	

	@Test
	public void testRun() {
		doThis();
	}

	@Test
	public void testRun2() {
	  System.out.println("I am running");
	}
	
	/*
	 * Before Method dono side ka run karega 
	 * But Pehle Child mtlad yaha ka run karega 
	 * Remember BeforeMethod,AfterMethod hr ek testcase or Method k baad run hote h
	 */
	
	@BeforeMethod
	public void BF() {
		System.out.println("Run me First i am in Child Class");
	}
}
