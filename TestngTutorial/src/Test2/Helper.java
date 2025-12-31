package Test2;


import org.testng.annotations.Test;

public class Helper {

@Test
public void Weblogincarloan() {
	// Selenium
	System.out.println("weblogincar");
}



@Test
public void Mobilelogincarloan() {
	//Appium
	System.out.println("Mobile Login Car Loan");
}

@Test
public void MobilelSigncarloan() {
	//Appium
	System.out.println("Mobile Sign Car Loan");
}



@Test
public void MobileRegistercarloan() {
	//Appium
	System.out.println("Mobile Register Car Loan");
}


/*
 * APIlogincar se pehle Weblogincarloan chalega iss liye APIlogincar ko skip kr ke Mobile wale run hue t
 * then jb bari Weblogincarloan ki aae tho vo run hua or uske run hotehi APIlogincar run ho gaya
 */
@Test(dependsOnMethods= {"MobileRegistercarloan"})
public void APIcarloan() {
	//Rest API automation
System.out.println("APIlogincar");
}



   // ***** If You Want to Stop Execution of any testcase then you can use method -> (enabled=true/false)

@Test(enabled=false)   // nahi run kare ga
public void WantToRun() {
	System.out.println("Check enable work or not");
}

// Give timeout mean if time lg raha h tho itna wait karo testcase fal mt kr dena wait krna give time tk

@Test(timeOut=4000)
public void WaitForMe() {
	System.out.println("You need to wait for  me");
}










}
