package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Timesheets;

        public class TC_TimeSheet extends BASE_CLASS {
	    @Test(priority = 1)
	    public void TimeSheet() throws InterruptedException {				
		
		Loginlogout();
		Thread.sleep(2000);
		
		Timesheets TS = new Timesheets(driver);
		
		TS.Click_TimeSheet();
		Thread.sleep(2000);
		
		TS.select_Timesheet();
		Thread.sleep(2000);
		
		TS.click_Project();
		Thread.sleep(2000);
		
		TS.Select_project("712879 - SWiMGDS Automation");
		Thread.sleep(5000);
		
		TS.click_task();
		Thread.sleep(2000);
		
		TS.Select_task("Testing");
		Thread.sleep(2000);
		
		TS.click_Worktype();
		Thread.sleep(2000);
		
		TS.Work_Type("Free");
		Thread.sleep(2000);
		
	    TS.Click_Hours();
		Thread.sleep(2000);
		
		TS.click_Notes();
		
		//TS.Add_Icon();
		Thread.sleep(2000);
	}
		
		//-------------------
		
		
		@Test(priority = 2)
		 public void TimeSheet1() throws InterruptedException {				
			
		Loginlogout();
		Thread.sleep(2000);
			
		Timesheets TL = new Timesheets(driver);
		
	    TL.Click_TimeSheet();
		Thread.sleep(2000);
			
	    TL.select_Timesheet();
		Thread.sleep(2000);
			
		//TL.Reason_field();
		Thread.sleep(2000);
		
		//TL.Reason_Type("Came Late");
		Thread.sleep(5000);
		
		//TL.Set_Hours();
		Thread.sleep(2000);
	
		TL.Select_Notes();
		Thread.sleep(2000);
		
		TL.Add_Button();
		Thread.sleep(2000);
		
	
		TL.Click_from_date();
		Thread.sleep(2000);
		
		TL.Click_Prev_month();
		Thread.sleep(2000);
		
		TL.select_Date();
		Thread.sleep(2000);
	
		TL.click_To_Date();
		Thread.sleep(2000);
		
		TL.Prev_month_icon();
		Thread.sleep(2000);
		
		TL.Select_To_Date();
		Thread.sleep(2000);
		
		TL.Select_Project2();
		Thread.sleep(2000);

		TL.Project_select("Knowledge Upgrade");
		Thread.sleep(2000);
		
		TL.Click_search_button();
		Thread.sleep(2000);
		
		TL.Click_Hours_Calculator();
		Thread.sleep(2000);
		
		TL.Click_Hours_1();
		Thread.sleep(2000);
		
		TL.Click_Minute_1();
		Thread.sleep(2000);
		
		TL.Click_Close();
		Thread.sleep(2000);	
		
}
}