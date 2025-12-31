package Test2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {
	@Parameters({ "URL" })
	@Test
	public void Weblogincarloan(String urlname) {
		// Selenium
		System.out.println("Local Will get run Local URL will Get print");
		System.out.println(urlname);
	}
}
