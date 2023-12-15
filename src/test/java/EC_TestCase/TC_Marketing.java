package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Marketing_Field;

        public class TC_Marketing  extends BASE_CLASS {
        @Test(priority = 1)
	    public void Project() throws InterruptedException {		
		
		Loginlogout();
		
		Marketing_Field MT=new Marketing_Field(driver);
		
		MT.Click_marketing();
		
		MT.Click_inquiries();
		
		Thread.sleep(2000);
		MT.Click_Favorite();
	}
}
