package AutomateDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver= new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

		// wenstore dropdown element into  staticDropdown WebElement variable
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
// We create a Select Object that is dropdown which work on webelemnt that is stored in staticDropdown
		Select dropdown= new Select(staticDropdown);
		
		// 1. Select Element By Index
		dropdown.selectByIndex(2);
		
//returns a single WebElement representing the option that is currently selected/displayed in the drop-down menu.		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		// 2. Select Element By Visible Text
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		// 3. Select Element By Value
		dropdown.selectByValue("INR"); // Its a Value attribute of select Method HTML
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
/* *** NOTES *** 
 
 * if webpage have single select feature then only Select Method will work
 * if webpage have multi-select Feature then we can do both select and Deslect Method
		
*/

	}

}
