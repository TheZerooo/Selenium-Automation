package AutomateDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        System.out.println("Your Ticket From:-> "+driver.findElement(By.xpath("//a[@value='BLR']")).getText());
        
        // Mere Mai Error nahi aa raha h kyu ki jaise hi bengaluru select kiya vo wala option hi band ho gaya not visible 
//        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        
       
        
        // But agr Error Aaye tho ye kr lena pr mere mai tho iss mai error aa raha h kyuki 2 chennai visible hi nahi h 
//        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        
        
        // if Client Do not Want to mention  index then use PARENT-CHILD RELATIONSHIP
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        System.out.println("Your Destination to:-> "+driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).getText());
        
        
        // ************  CALENDER ->> Current Date Select  *************
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
        
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
         
        
        
	}
	

}
