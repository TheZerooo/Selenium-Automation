


import
org.openqa.selenium.WebDriver;
import
org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		
		// selenium give command to chrome that go to file pizza
		driver.get("https://www.google.com/aclk?sa=L&pf=1&ai=DChsSEwjRqv2lr86QAxUZgKYDHXT8F-kYACICCAEQABoCdGI&co=1&ase=2&gclid=Cj0KCQjwvJHIBhCgARIsAEQnWlC54LibdRu6S7v-PewHIocnwgnvnqexUAe-3s6iG77P8Lu3ywl8EbwaAjkOEALw_wcB&ei=QKIEacPKAY6LseMP0IumEQ&cid=CAASN-RoGT_tNAufcEMTAmBtR2Y5KPk-O5WJJFxbDU5t8yPbMkpgQaNziv5OBsRt728s5O4gMcx8tns&cce=2&category=acrcp_v1_32&sig=AOD64_0RuCffOVQd9ThfIYVoAneGnXxEzQ&q&sqi=2&nis=4&adurl=https://www.folderit.com/?utm_source%3DGoogle%26utm_medium%3DCPC-keywords%26utm_campaign%3DIndia%26gad_source%3D1%26gad_campaignid%3D11987349063%26gbraid%3D0AAAAADSEXfcONI9RHMr0R7bH5Mm9oohL4%26gclid%3DCj0KCQjwvJHIBhCgARIsAEQnWlC54LibdRu6S7v-PewHIocnwgnvnqexUAe-3s6iG77P8Lu3ywl8EbwaAjkOEALw_wcB&ved=2ahUKEwjD6vWlr86QAxWORWwGHdCFKQIQ0Qx6BAgMEAE");
		
		// jo mila uska title print ho gaya h
		System.out.println("Title: " + driver.getTitle()+" ->> it is in Firefox "); 
		
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
