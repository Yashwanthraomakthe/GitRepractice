package POMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.ReddifLogin;

public class Loginapplication {
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		ReddifLogin rdlgn = new ReddifLogin(driver);
		
		rdlgn.username().sendKeys("Yashwanth");
		
		rdlgn.password().sendKeys("test");
		
		rdlgn.signin().click();
		
		driver.close();
		
		
		
		
		
	}

}
