package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc003 {
	@Test
	public void tcoo3()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("myemail@gmail.com");
		driver.findElementById("pass").sendKeys("mypassword");
		driver.close();
	}
}
