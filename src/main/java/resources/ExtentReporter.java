package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		
		 //ExtentReorts , //ExtentSparkReporter
		   String path= System.getProperty("user.dir")+"\\reports\\index.html";
		   ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		   reporter.config().setReportName("Web Automation Report");
		   reporter.config().setDocumentTitle("Test Result");
		   
		   extent = new  ExtentReports();
		   extent.attachReporter(reporter);
		   extent.setSystemInfo("Tester", "Parit");
		   return extent;
	}
	
	
	   
	
	

}
