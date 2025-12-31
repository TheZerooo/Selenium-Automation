import
org.openqa.selenium.WebDriver;
import
org.openqa.selenium.edge.EdgeDriver;
public class EdgeBrowser {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		
		// selenium give command to chrome that go to file pizza
		driver.get("https://file.pizza/");
		// jo mila uska title print ho gaya h
		System.out.println("Title: " + driver.getTitle()+" ->> it is in Microsoft Edge "); 
		
		 try{
			    Thread.sleep(1000);

			}
			catch(InterruptedException e){

			 e.printStackTrace();
			}

		driver.quit();
		
	}
}

