package VEC_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponentsMethods;

     public class My_Profile  {
	 public WebDriver driver;
	 public My_Profile(WebDriver driver) {
     this.driver = driver;
	 PageFactory.initElements(driver, this);
   	   }
    
   //===========My profile click ==================
    
         @FindBy(xpath = "//a[normalize-space()='VRS']")
         private WebElement myProfile;

   	     public void click_profile_1() {
   	 	 myProfile.click();
   	}
   	
   //===========My profile click open drop-down select my profile==================
   	
        @FindBy(xpath = "//a[normalize-space()='My Profile']")
   	    private WebElement Profile;

   	    public void Myprofile() {
   		Profile.click();
   	}
   	
  //===========My profile click open drop-down select change password==================
   	
        @FindBy(xpath = "//a[normalize-space()='Change Password']")
   	    private WebElement change_password;
    
     	public void password() {
   		change_password.click();
   	}
   	
  //===========My profile click open drop-down select change password==================
   	
        @FindBy(xpath = "//button[@type='submit']")
   	    private WebElement Submit;

   	    public void Click_Submit() {
   		Submit.click();
   	}
  
    //===========My profile click open drop-down select Mail Configuration==================

   	    @FindBy(xpath = "//a[normalize-space()='Mail Configuration']")
       	private WebElement Mail_Configuration;

     	public void select_Mail_Configuration() {
   		Mail_Configuration.click();
   	}
   	
    //===========My profile click open drop-down select Host_Name==================

      	@FindBy(xpath = "//*[@id='EmployeeHostName']")
    	private WebElement Host_Name;

    	public void select_Host_Name() {
   	    Host_Name.click();
   	}
   	
    //===========My profile click open drop-down select Email_Address==================

    	@FindBy(xpath = "//*[@id='EmployeeEmailAdd']")
    	private WebElement Email_Address;
 
    	public void select_Email_Address() {
   		Email_Address.click();
   		Email_Address.sendKeys("sss@@ddd@@..email");
   	}
   	
    //===========My profile click open drop-down Click the submit button=================

    	@FindBy(xpath = "//*[@type='submit']")
    	private WebElement submit;

    	public void selectsubmit() {
   		submit.click();		
   	}
   	
    //===========My profile click open drop-down select Logout==================

   	    @FindBy(xpath = "//a[normalize-space()='Logout']")
    	private WebElement LOG_Out;

    	public void select_LOG_Out() {
   		LOG_Out.click();
   	}
}
