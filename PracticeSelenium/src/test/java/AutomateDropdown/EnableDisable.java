package AutomateDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class EnableDisable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

		// ye wala ab kaam nahi krta kyuki Element dekhne mai tho lgta h ki enable h
		// prhota nahi h enable
		/*
		 * System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")
		 * ).isEnabled());
		 * driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
		 * System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")
		 * ).isEnabled());
		 */

		// now We Check First that Which Attribute get Chanage after selceting and not
		// Seelecting

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
//   driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));

		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
			System.out.println("Its Enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("Its Not Enable");
			Assert.assertFalse(false); // Ye True Dega
		}

		Thread.sleep(2000);
		driver.close();

	}

}
