package VEC_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponentsMethods;

public class Login_Page extends AbstractComponentsMethods{
	  public static WebDriver driver;
      public Login_Page(WebDriver driver) {
	   super(driver);
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
			
		}

	//===========Invoke Method================

	   public void invokeURL() {
		driver.get("https://eros.narola.online:444/EasyCollab/");
	}
	
	//=====Email field xpath/element===========
	
	   @FindBy(xpath = "//input[@type='email']")
	   private WebElement userEmail;

	   public void useremail(String email) {
	   userEmail.sendKeys(email);
	}
	
	//=====PAssword field xpath/element==========
	
	   @FindBy(xpath = "//input[@type='password']")
	   private WebElement Password;

	   public void password(String password) {
	   Password.sendKeys(password);
}
	
	//======SingIn field xpath/element========
	
	   @FindBy(xpath = "//button[@type='submit']")
	   private WebElement SingIn;

	   public void singin() {
	   SingIn.click();
}
	
    //===========My profile click ======================
    
       @FindBy(xpath = "//a[normalize-space()='VRS']")
   	   private WebElement myProfile;

   	   public void click_profile_1() {
   	   myProfile.click();
   	}
	
   //===========My profile click open drop-down select Logout==================

      @FindBy(xpath = "//a[normalize-space()='Logout']")
   	  private WebElement LOG_Out;

      public void select_LOG_Out() {
   	  LOG_Out.click();
   	}
   	
  }