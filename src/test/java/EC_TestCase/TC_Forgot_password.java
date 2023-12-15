package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Forgot_Password;
  
        public class TC_Forgot_password extends BASE_CLASS  {
	    @Test(priority = 1)
        public void Forgot() throws InterruptedException {	
		
	  //  Loginlogout();
		Thread.sleep(2000);
		
		Forgot_Password FP = new Forgot_Password(driver);
			
		FP.click_Fpassword();
		Thread.sleep(2000);
		
		FP.click_Email();
		Thread.sleep(2000);
		
		FP.click_SubmitButton();
		
		FP.click_SecurityQuestion();
		
		FP.select_SecurityQuestion();
		Thread.sleep(2000);
		
		FP.select_answer();
		Thread.sleep(2000);
		
	    FP.Write_answer();
	    
	    FP.Submit_field();
	    Thread.sleep(2000);
	    
	    FP.Click_SingIN();				
	}
}
