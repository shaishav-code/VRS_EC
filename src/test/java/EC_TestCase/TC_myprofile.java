package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.My_Profile;

        public class TC_myprofile extends BASE_CLASS {
	    @Test(priority = 1)
	    public void Profile() throws InterruptedException {	
		
		Loginlogout();
		
		
		My_Profile MP=new My_Profile(driver);
		
		MP.click_profile_1();
		
		
		MP.Myprofile();
		
		
		MP.click_profile_1();
		
		
		MP.password();
		
			
		MP.Click_Submit();
		
		
		MP.click_profile_1();
		
		
		MP.select_Mail_Configuration();
		
		
		MP.select_Host_Name();
		
		
		MP.select_Email_Address();
		
		
		MP.selectsubmit();
		
		MP.click_profile_1();
	
		MP.select_LOG_Out();
		
		}	
}
