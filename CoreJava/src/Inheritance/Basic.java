package Inheritance;

import org.testng.annotations.BeforeMethod;

public class Basic {

	
	public void doThis(){
		System.out.println("I am Here .I am parent Class ");
	}
	@BeforeMethod
	public void BF() {
		System.out.println("Run me First i am in Parent class");
	}

}