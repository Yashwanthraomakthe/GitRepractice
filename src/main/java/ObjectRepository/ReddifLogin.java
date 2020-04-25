package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLogin {
	
	public  ReddifLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	
	WebDriver driver;
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signin = By.xpath("//input[@type='submit']");
	
	
	public WebElement username() {
		return driver.findElement(username);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement signin() {
		return driver.findElement(signin);
	}
	
	
}
