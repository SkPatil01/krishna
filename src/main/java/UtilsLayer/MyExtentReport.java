package UtilsLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyExtentReport {
   public static ExtentReports generateReportes() {
	   
	  ExtentSparkReporter reporter=new ExtentSparkReporter(System.getProperty("usder.dir")+"\\target\\extents\\guru.html");
	  reporter.getConf().setReportName("guru99 Application");
	  
	  ExtentReports reportes=new ExtentReports();
	  reportes.attachReporter(reporter);
	   return reportes;
   }
}
