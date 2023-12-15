package VEC_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponentsMethods;

        public class Forgot_Password {
        public static WebDriver driver;
        public Forgot_Password(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//==============Click the forgot password================

		@FindBy(xpath = "//*[@class='pull-right m-t-xs']")
		private WebElement FPassword;

		public void click_Fpassword() {
		FPassword.click();		
	}	
		
	//==============Enter the email address================	
		
		@FindBy(xpath = "//input[@id='username']")
		private WebElement Email;

		public void click_Email() {
		Email.click();
		Email.sendKeys("vrs@narola.email");
	}	
		
	//==============Click the submit button================	
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement Submit_button;

		public void click_SubmitButton() {
		Submit_button.click();			
		}
				
	//==============Security Question================	
		
		@FindBy(xpath = "//select[@class='form-control']")
		private WebElement Security_Question;

		public void click_SecurityQuestion() {
		Security_Question.click();			
				}
		
	//==============Select the Security Question================
				
		 @FindBy(xpath = "//select[@class='form-control']/option[3]")
		 private WebElement Select_Security_Question;

		 public void select_SecurityQuestion() {
		 Select_Security_Question.click();			
				}
				
    //==============Select the Security Question and answer================
				
		 @FindBy(xpath = "//div[@class='input text']")
		 private WebElement Get_answer;

		 public void select_answer() {
		 Get_answer.click();		
				}		
				
  //==============Select the Security Question/answer================
				
		 @FindBy(xpath = "//input[@type='text']")
		 private WebElement Answer;

		 public void Write_answer() {
		 Answer.sendKeys("123456");		
				}	
				
   //==============Select the Security Question/answer Submit button================
				
		 @FindBy(xpath = "//button[@type='submit']")
		 private WebElement Click_submit;

		 public void Submit_field() {
		 Click_submit.click();
				}	
 
	//==============Select the Security SingIN================
							
		 @FindBy(xpath = "//a[@class='btn btn-warning']")
		 private WebElement SelectSingIN;

		 public void Click_SingIN() {
		 SelectSingIN.click();
				}						
   }
