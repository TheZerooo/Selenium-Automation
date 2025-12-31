package Test2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleParameter {

	@Parameters({"url", "username"})
	@Test
	 public void UserLogin(String urlname,String username) {
		System.out.println("URL is "+urlname);
		System.out.println("UserName is "+username);
	 }
}
