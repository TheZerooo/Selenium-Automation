package Learning;

import org.openqa.selenium.By;
import
org.openqa.selenium.WebDriver; // selenium k package se webDriver class le kr aa jao
import
org.openqa.selenium.chrome.ChromeDriver;

public class setup {

	public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
		
		
		// selenium give command to chrome that go to file pizza
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("POCO F1");
		driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		
		// jo mila uska title print ho gaya h
		System.out.println("Title: " + driver.getTitle()); 
		
//		 try{
//			    Thread.sleep(5000);
//
//			}
//			catch(InterruptedException e){
//
//			 e.printStackTrace();
//			}
//
//		driver.quit();  // iss se turant chrome band ho jata h


	}

}
