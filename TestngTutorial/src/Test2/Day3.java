package Test2;

//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

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



@Test(groups={"smoke"})
public void MobileRegistercarloan() {
	//Appium
	System.out.println("Mobile Register Car Loan");
}

@Test(dependsOnMethods= {"Weblogincarloan"})
public void LoginAPIcarloan() {
	//Rest API automation
System.out.println("APIlogincar");
}



}
