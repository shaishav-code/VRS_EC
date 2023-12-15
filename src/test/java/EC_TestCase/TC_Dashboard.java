package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.DashBord_Field;

        public class TC_Dashboard  extends BASE_CLASS {
	
     	@Test(priority = 1)
	    public void validLogin() throws InterruptedException {	
		
		Loginlogout();
		Thread.sleep(3000);
		
		DashBord_Field Ds=new DashBord_Field(driver);
		
		Ds.DeshBord();
		Thread.sleep(3000);	
}
}