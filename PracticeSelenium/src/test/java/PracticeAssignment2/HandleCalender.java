package PracticeAssignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class HandleCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String monthNumber="6";
		String date="17";
		String year="2027";
		
		String[] expectedList= {monthNumber,date,year};
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup__input")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		
		// iss se date pura nahi aaye ga kyuki voha pr kuch likha hi nahi h ye random change hoga as per user need
		System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());
		
		
		// We store that element child in list
		List<WebElement> actualList= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0;i<actualList.size();i++) {
			System.out.println(actualList.get(i).getAttribute("value"));
			Assert.assertEquals(actualList.get(i).getAttribute("value"),expectedList[i]);
		}
	}

}
