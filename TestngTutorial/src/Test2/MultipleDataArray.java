package Test2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleDataArray {
	int i=0;
	@Test(dataProvider="getData")
	public void UserLogin(String Username, String Password) {
		System.out.println("UserName "+i+" name is " +Username );
		System.out.println("Password "+ Password);
		i++;
	}
	
	
	
	@DataProvider
	public Object[][] getData(){
		
		// getData -> to get data from the user
		
		/*
		  combination of username and password for three different case
		  1st -> good credit history = row(0)
		  2nd -> no credit history = row(1)
		  3rd -> fraudelent credit history = row(2)
		 */
		
		Object[][] data=new Object[3][2];
		
		// 1st set
		data[0][0]="firstsetusername";
		data[0][1]="password";
		// columns in the row are nothing but values for that particular combination(row)
		
		
		// 2nd set
		data[1][0]="Secondsetusername";
		data[1][1]="secondpassword";
		
		
		// 3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}
}
