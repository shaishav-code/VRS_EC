package Resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extend_report {
	
	static ExtentReports extentReport;

	public static ExtentReports extentReportGenerator() {
		String path = System.getProperty("user.dir") + "//reports//Vrs_Easy_Collab_report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Easy Collab");
		reporter.config().setDocumentTitle("Easy Collab Test Report");
		extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Project name", "Easy Collab");
		extentReport.setSystemInfo("Environment", "SIT");
		extentReport.setSystemInfo("Executed by", "Viraj Surati");
		return extentReport;
	}
}

