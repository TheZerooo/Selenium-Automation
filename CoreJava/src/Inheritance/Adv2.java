package Inheritance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adv2 extends Basic  {
	
	

	@Test
	public void testRun() {
/*		
	NotExtend ID= new NotExtend(); // here default constructor get called (u are not passing parameter)
		int a=3;
		doThis();
		System.out.println("Increment value of a ->>"+ID.increment(3));
		System.out.println("Increment value of a ->>"+ID.decrement(3));
		
		*/
		
	NotExtend ID= new NotExtend(3); // you need to make constructor now (u are passing parameter)
		
		doThis();
		System.out.println("Increment value of a ->>"+ID.increment());
		System.out.println("Decrement value of a ->>"+ID.decrement());
		
		//  multiply ml=new multiply(3);
		
		/*
		 * humne multiply class k liye dubara constructor define nahi kiya h 
		 * humne NotExtend wale constructor se hi multiply wale constructor ko call kara h 
		 * by using super(a) -> and NotExtend class ko multiply class se extend kara h 
		 */
		System.out.println("Increment value of a ->>"+ID.multiplyTwo());
		System.out.println("Decrement value of a ->>"+ID.multiplyThree());
		
		
	}


}
