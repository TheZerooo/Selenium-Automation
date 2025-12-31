package Test2;

//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	
	
	@Test(groups={"smoke"})
	public void Demo() {
		System.out.println("Hello TestNG Tutorial");
	}
	
	@Test
	public void TestTwo() {
		System.out.println("Ab exclude wala chal raha h");
		System.out.println("We Are In First Class");
	}

}
