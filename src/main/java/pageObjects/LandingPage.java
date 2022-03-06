package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver driver;
	private By signin=By.cssSelector("a[href='https://rahulshettyacademy.com/sign_in/']");
	private By email=By.id("user_email");
	private By pass=By.name(" password");
	private By featured=By.xpath("//h2[contains(.,'Featured Courses')]");

	public WebElement getLogin()
		{
			return driver.findElement(signin);
		}
	public WebElement title()
	{
		return driver.findElement(featured);
	}
	

}
