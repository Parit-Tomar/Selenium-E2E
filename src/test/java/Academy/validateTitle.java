package Academy;
//Adding Logs
//Generating HTML Reports
//Taking Screenshots on Failure
//Integration with Jenkins

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateTitle extends base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("this is before info log");
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		//inheritence
		//create object to that class and invoke its methods
		LandingPage l= new LandingPage(driver);
		//compare the text with actual text
		
	    Assert.assertEquals(l.title().getText(), "FEATURED COURSES1");
	    log.info("this is validate info log");
	    
	}
	@AfterTest
	public void teardown(){
		driver.close();
		log.info("this is after info log");
	}
	
	

}
