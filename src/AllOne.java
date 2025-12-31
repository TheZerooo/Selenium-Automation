
import
org.openqa.selenium.WebDriver; // selenium k package se webDriver class le kr aa jao
import
org.openqa.selenium.chrome.ChromeDriver;
import
org.openqa.selenium.firefox.FirefoxDriver;
import
org.openqa.selenium.edge.EdgeDriver;
public class AllOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ******  For Microsoft Edge  *******		
				
			WebDriver driver2=new EdgeDriver();
				
				
				// selenium give command to chrome that go to file pizza
				driver2.get("https://file.pizza/");
				// jo mila uska title print ho gaya h
				System.out.println("Title: " + driver2.getTitle()+" ->> it is in Microsoft Edge "); 
				
		
 // ******* For Google ********
	WebDriver driver=new ChromeDriver();
		
		
		// selenium give command to chrome that go to file pizza
		driver.get("https://file.pizza/");
		// jo mila uska title print ho gaya h
		System.out.println("Title: " + driver.getTitle()+" ->> it is in Google "); 
		
		
//  ***** For Firefox  ******
	WebDriver driver1=new FirefoxDriver();
		
		
		// selenium give command to chrome that go to file pizza
		driver1.get("https://www.google.com");
		// jo mila uska title print ho gaya h
		System.out.println("Title: " + driver1.getTitle()+" ->> it is in firefox "); 

//		 try{
//			    Thread.sleep(1000);
//
//			}
//			catch(InterruptedException e){
//
//			 e.printStackTrace();
//			}

		driver.quit();

	}

}
