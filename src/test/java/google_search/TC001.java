package google_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC001 {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeMethod
	
	public void openbrowser() {
		
		System.out.println("Open Browser");
		
		driver.get("https://www.google.com");
		
		
	}
	
@Test
public void Test_1() throws InterruptedException {
	
System.out.println("This test 001");

driver.findElement(By.name("q")).sendKeys("Dhaka University");
driver.findElement(By.name("btnK")).submit();
Thread.sleep(5000);
}
@Test
public void Test_2() throws InterruptedException {
	
System.out.println("This test 002");
Thread.sleep(5000);
driver.findElement(By.name("q")).sendKeys("New York City");
driver.findElement(By.name("btnK")).submit();
Thread.sleep(5000);
}

@AfterTest
public void ClosingBrowser()
{
	driver.close();
}

}





