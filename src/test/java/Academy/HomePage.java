package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver=initializeDriver();
		log.info("this is before H info log");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password, String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		//inheritence
		//create object to that class and invoke its methods
		LandingPage l= new LandingPage(driver);
		l.getLogin().click(); //driver.findelements(by.cssselector())
		LoginPage lp= new LoginPage(driver);
		lp.emailAdd().sendKeys(username);
		lp.password().sendKeys(password);
		System.out.println(text);
		log.info("this is homepage info log");
	    
	}
	
	@DataProvider
	public Object[][] getData() {
		//row : for how many different set of data test should run
		//column : how many values/variables per each test
		Object[][] data= new Object[2][3];
		data[0][0]="nonrestricteduser";
		data[0][1]="firstpass";
		data[0][2]="first text";
		data[1][0]="restricteduser";
		data[1][1]="secondpass";
		data[1][2]="second text";
		return data;
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
		log.info("this is after H info log");
	}

}
