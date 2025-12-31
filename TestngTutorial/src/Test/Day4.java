package Test;

import org.testng.annotations.Test;

public class Day4 {
	
@Test
public void WebloginHomeloan() {
	// Selenium
	System.out.println("webloginHome");
}

@Test
public void MobileloginHomeloan() {
	//Appium
	System.out.println("MobileloginHome");
}


@Test(groups={"smoke"})
public void LoginAPIHomeloan() {
	//Rest API automation
System.out.println("APIloginHome");
}



}
