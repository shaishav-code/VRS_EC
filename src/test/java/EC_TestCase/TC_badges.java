package EC_TestCase;

import org.testng.annotations.Test;
import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Badges_field;

public class TC_badges extends BASE_CLASS  {

	
	//===================== Click Badges field ================================================
	
	   @Test(priority = 1)
	   public void Badges() throws InterruptedException {		
	   Loginlogout();
	   Badges_field BJ=new Badges_field(driver);
	   BJ.Click_Badges();
	   Thread.sleep(2000);
	   BJ. click_profile_1();
	   BJ.select_LOG_Out();
	   
	//===================== Contribution field ================================================
			
		Loginlogout();
		BJ.Click_Badges();
		BJ.Click_contribution();
		BJ.Select_Employee_name("Viraj Rameshchandra Surati");
		BJ.Click_Date();
		BJ.select_Date();
		BJ.select_Category();
		BJ.Click_TODate();
		BJ.Select_TODate();
		BJ.Select_Search();
		Thread.sleep(2000);
		BJ. click_profile_1();
	    BJ.select_LOG_Out();
	
	//============================ Badges2 field ===================================================
	
		Loginlogout();
		BJ.Click_Badges();
		BJ.DropDown_Badges();
		BJ.Show_scrollDown();
	    BJ. click_profile_1(); 
		BJ.select_LOG_Out();
		
 //============================ Endorse field ===================================================	
		
      	Loginlogout();
	    BJ.Click_Badges();
		BJ.DropDown_Endorse();
		BJ.Select_TL_name();
	    BJ.Select_Category();
		BJ.Select_PM_name();
        BJ.Click_Description();
		BJ.Write_Description("Hello sir Good Morning");
		//BJ.click_submit();
		BJ. click_profile_1();
		BJ.select_LOG_Out();
		
		}				
}
