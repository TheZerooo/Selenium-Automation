package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//      WebDriver driver= new ChromeDriver();
		WebDriver driver=new EdgeDriver();
      
      
      // Miximum Browser
      driver.manage().window().maximize();
      
      
      // get mai jb tk pura webpage load na ho jaye ye aage move nahi krta h 
      driver.get("https://www.google.com/");
      Thread.sleep(1000);
      
      System.out.println("Google webpage pr aa gaye");
      
      //from google we move to drive -> navigate mai pura webpage open hone k liye wait nahi krta h 
      driver.navigate().to("https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2");
      Thread.sleep(2000);
      
      System.out.println("Striver Sheet Pr Aa Gaye");
      
      // To move backword -> purane WebPage pr jane k liye
      driver.navigate().back();
      Thread.sleep(1000);
      
      System.out.println("Google webpage pr aa gaye 2");
      // To move forwoed -> aage wale WePage pr jane k liye
      driver.navigate().forward();
      
      System.out.println("Striver Sheet Pr Aa Gaye 2");
      
	}

}
