package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Forgot_Password;
  
        public class TC_Forgot_password extends BASE_CLASS  {
	    @Test(priority = 1)
        public void Forgot() throws InterruptedException {	
	
		Forgot_Password FP = new Forgot_Password(driver);
			
		FP.click_Fpassword();
		FP.click_Email();
		FP.click_SubmitButton();
		FP.click_SecurityQuestion();
		FP.select_SecurityQuestion();
		FP.select_answer();
	    FP.Write_answer();
	    FP.Submit_field();  
	    FP.Click_SingIN();
	    }
}
