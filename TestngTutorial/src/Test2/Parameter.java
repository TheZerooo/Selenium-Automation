package Test2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	/* 
	 
 * Humne Parameter.xml mai ek url ki value set ki thi or usko humne test case run krte time pass kara tha
 * Iss liye jb humne apne testcase k uper Parameter likha th TestNG ko pata chal gaya ki 
 * Parameter yehi pr pass krna h 
 * Tho URL mai ja kr store ho gaya TetNG ka value 
 * THen Voha se @Test mai pass ho gaya
 
 
	 */
	
	
	@Parameters({ "URL" })
	@Test
	public void Weblogincarloan(String urlname) {
		// Selenium
		System.out.println("Prameter Get Load check Your Global URL Get Print ");
		System.out.println(urlname);
	}

}
