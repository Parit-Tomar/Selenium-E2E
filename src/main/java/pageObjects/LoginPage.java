package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver driver;
	
	private By email=By.id("user_email");
	private By pass=By.name(" password");
	
	public WebElement emailAdd()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(pass);
	}

}
