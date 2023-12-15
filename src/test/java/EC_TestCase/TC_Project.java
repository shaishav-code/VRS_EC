package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Project_field;

          public class TC_Project extends BASE_CLASS {
	      @Test(priority = 1)
		  public void Project() throws InterruptedException {		
		  Loginlogout();
		  Project_field PJ= new Project_field(driver);
				
		  PJ.Click_Project();
		  Thread.sleep(2000);
				
		  PJ.DropDown();
				
		  PJ.Set_column();
		  Thread.sleep(2000);
				
		  PJ.click_save();
}
}