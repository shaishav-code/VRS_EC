package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.My_Profile;

        public class TC_myprofile extends BASE_CLASS {
	    @Test(priority = 1)
	    public void Profile() throws InterruptedException {	
		
		Loginlogout();
		Thread.sleep(2000);
		
		My_Profile MP=new My_Profile(driver);
		
		MP.click_profile_1();
		Thread.sleep(3000);
		
		MP.Myprofile();
		Thread.sleep(3000);
		
		MP.click_profile_1();
		Thread.sleep(3000);
		
		MP.password();
		Thread.sleep(3000);
			
		MP.Click_Submit();
		Thread.sleep(3000);
		
		MP.click_profile_1();
		Thread.sleep(3000);
		
		MP.select_Mail_Configuration();
		Thread.sleep(3000);
		
		MP.select_Host_Name();
		Thread.sleep(3000);
		
		MP.select_Email_Address();
		Thread.sleep(3000);
		
		MP.selectsubmit();
		
		MP.click_profile_1();
		Thread.sleep(3000);
		
		MP.select_LOG_Out();
		Thread.sleep(3000);		
	}	
}
