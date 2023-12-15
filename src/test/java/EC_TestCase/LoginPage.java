package EC_TestCase;


import org.testng.annotations.Test;
import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Login_Page;
import VEC_Page_Object.My_Profile;

        public class LoginPage extends BASE_CLASS {
	
	    @Test(priority = 1)
	    public void validLogin() throws InterruptedException {		
		
		Thread.sleep(2000);
		Loginlogout();
		
		Login_Page MP=new Login_Page(driver);
		
		MP.click_profile_1();
		Thread.sleep(3000);
		
		MP.select_LOG_Out();
		Thread.sleep(3000);	
	}
}