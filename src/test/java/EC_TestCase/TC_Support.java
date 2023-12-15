package EC_TestCase;

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
		Thread.sleep(2000);
		
		ST.Support_ticket();
		
		ST.Click_Date_From();
		Thread.sleep(2000);
		
		ST.Select_Date_From();
		Thread.sleep(2000);
		
		ST.Click_Date_TO();
		Thread.sleep(2000);
		
		ST.Select_DateTo();
		Thread.sleep(2000);
	 
		ST.Click_Status();
		Thread.sleep(2000);
		
		ST.Click_Solve();
		Thread.sleep(2000);
		
		ST.Click_Search_button();
		
		ST.validation_message();
		
 		System.out.println("No record found");
		
	    ST.Click_Generate_new_ticket();
	    Thread.sleep(2000);
	    
	    ST.Click_Support_Type();
	    Thread.sleep(2000);
	    
	    ST.Hardware_Software();
	    Thread.sleep(2000);
	    
	    ST.Click_Notes();
	    Thread.sleep(2000);
	    
	    ST.Write_Notes();
}
}
