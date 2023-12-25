package EC_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Support_ticket;

public class TC_Support extends BASE_CLASS {
	
	
	@Test(priority = 1)
	 public void Support() throws InterruptedException {		
		Loginlogout();
		Thread.sleep(2000);
		Support_ticket ST=new Support_ticket(driver);
		ST.Click_Support();
        ST.Support_ticket();
		ST.Click_Date_From();
	    ST.Select_Date_From();
        ST.Click_Date_TO();
		ST.Select_DateTo();
		ST.Click_Status();
		ST.Click_Solve();
	    ST.Click_Search_button();
		ST.validation_message();
		System.out.println("No record found");
		ST.Click_Generate_new_ticket();
	    ST.Click_Support_Type();
	    ST.Hardware_Software();
	    ST.Click_Notes();
	    ST.Write_Notes();
	    ST.click_profile_1();
	    ST.select_LOG_Out();
	  
}
}
