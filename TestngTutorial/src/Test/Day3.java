package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
@AfterMethod
public void Am() {
	System.out.println("Class Day3 Mai sbse last mai yehi run kare ga (Day3 class end ho gaya h )");
}
@Test
public void Weblogincarloan() {
	// Selenium
	System.out.println("weblogincar");
}

@BeforeClass
public void Bec() {
	System.out.println("class k Mehods jb run krna suru nahi karege tb hoga ");
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
@BeforeMethod
public void Bm() {
	System.out.println("Class Day3 Mai sbse Pehle mai yehi run kare ga (Day3 class Start ho gaya h )");
}


@AfterClass
public void Ac() {
	System.out.println("class k sare method jb run kr lege tb ye run hoga ");
}

@Test(groups={"smoke"})
public void MobileRegistercarloan() {
	//Appium
	System.out.println("Mobile Register Car Loan");
}

@BeforeSuite
public void BeforSuit() {
	System.out.println("Suite k Start mai print hoga");
}
@Test
public void LoginAPIcarloan() {
	//Rest API automation
System.out.println("APIlogincar");
}



}
