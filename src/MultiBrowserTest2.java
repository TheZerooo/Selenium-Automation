
import
org.openqa.selenium.WebDriver;
import
org.openqa.selenium.chrome.ChromeDriver;


public class MultiBrowserTest2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		// selenium give command to chrome that go to file pizza
		driver.get("https://file.pizza/");
		
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

		driver.quit();
		
	}

}

