import 
org.openqa.selenium.By;// for intrecting with class and id of web page
import
org.openqa.selenium.WebDriver; // selenium k package se webDriver class le kr aa jao -> Navigate with URL
import
org.openqa.selenium.chrome.ChromeDriver; // Selinium control chrome by this 

import java.io.File; 

public class Loginpage {

	public static void main(String[] args) {
	
		File file =new File("src/login.html");
		String filePath="file:///"+file.getAbsolutePath();
	WebDriver driver=new ChromeDriver();
	
		driver.get(filePath);
		driver.findElement(By.id("Id")).sendKeys("201");
		driver.findElement(By.id("Employee"));
		driver.findElement(By.id("Department"));
		driver.findElement(By.id("Password"));
		driver.findElement(By.tagName("button")).click();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e){
			}

		driver.quit();

	}

}

