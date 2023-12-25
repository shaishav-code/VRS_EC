package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Timesheets;

        public class TC_TimeSheet extends BASE_CLASS  {
	    @Test(priority = 1)
	    public void TimeSheet() throws InterruptedException {				
		
		Loginlogout();
		Timesheets TS = new Timesheets(driver);
		TS.Click_TimeSheet();
	    TS.select_Timesheet();
		TS.click_Project();
		TS.Select_project("712879 - SWiMGDS Automation");
		TS.click_task();
		TS.Select_task("Testing");
		TS.click_Worktype();
		TS.Work_Type("Free");
        TS.Click_Hours();
		TS.click_Notes();		
		//TS.Add_Icon();
		TS.click_profile_1();
		TS.select_LOG_Out();
	
	    }
	    
	  
		//--------------------------------------------------------------------
		
		@Test(priority = 2)
		 public void TimeSheet1() throws InterruptedException {				
			
		Loginlogout();	
		Timesheets TL = new Timesheets(driver);
		TL.Click_TimeSheet();
        TL.select_Timesheet();
		TL.Reason_field();
		TL.Select_Reason_Type("Left Early");
	    TL.write_Hours();
		TL.Select_Notes();
		TL.Add_Button();
		TL.Click_from_date();
	    TL.Click_Prev_month();
        TL.select_Date();
		TL.click_To_Date();
	    TL.Prev_month_icon();
		TL.Select_To_Date();
		TL.Select_Project2();
		TL.Project_select("Knowledge Upgrade");
	    TL.Click_search_button();
        TL.Click_Hours_Calculator();
		TL.Click_Hours_1();
		TL.Click_Minute_1();
		TL.Click_Close();
		Thread.sleep(3000);
		
		TL.click_profile_1();
		Thread.sleep(2000);
		
		TL.select_LOG_Out();
				
}
}