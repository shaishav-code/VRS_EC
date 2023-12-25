package VEC_BaseClass;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import VEC_Page_Object.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

        public class BASE_CLASS {
	    public WebDriver driver;
	    public Login_Page MyLoginPage;
		private String testResult;
	
		
	    public WebDriver invokeDriver() {	
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(options);
	    Logger.getLogger("org.openqa.selenium").setLevel(Level.ALL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	    @BeforeMethod(alwaysRun = true)
	    public Login_Page lanuchWebsite() throws InterruptedException, IOException {
	    driver = invokeDriver();
	    MyLoginPage = new Login_Page(driver);
	    MyLoginPage.invokeURL();
		return MyLoginPage;
			
	    }
	    
	    @AfterMethod
	    public void pageObject () {
	    driver.close();	
	    
	    }
	    
	    //===============screenshot=======================
	    
	    public static String getScreenshots(String testCaseName, WebDriver driver) throws java.io.IOException {
			TakesScreenshot src = (TakesScreenshot) driver;
			File source = src.getScreenshotAs(OutputType.FILE);
			File file = new File(System.getProperty("user.dir") + "//Screenshot fail" + testCaseName + ".png");
			FileUtils.copyFile(source, file);
			return System.getProperty("user.dir") + testCaseName + ".png";
		}
		
	    
	//=====================Loginlogout============================
	
	    public void Loginlogout () throws InterruptedException {
	    MyLoginPage.useremail("vrs@narola.email");
	    MyLoginPage.password("Vira@6355142383");
	    MyLoginPage.singin();
	    Thread.sleep(2000);
			
	 }
  }



	
	