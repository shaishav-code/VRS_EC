package EC_TestCase;


import org.testng.Assert;
import org.testng.annotations.Test;
import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Library_Snacks;

        public class TC_Library_Snacks extends BASE_CLASS {
	    @Test(priority = 1)
	    public void Library() throws InterruptedException {		
		Loginlogout();
		Library_Snacks LS=new Library_Snacks(driver);
		LS.LibrirySnack_field();
		LS.Select_Libriry_field();
		LS.LibrirySnack_field();
		LS.Select_MyLibriry();
		LS.LibrirySnack_field();
		LS.Select_Snacks();
		//LS.Select_OrderSnacks();
	    LS.LibrirySnack_field();
		LS.Click_MyOrder();
		LS.From_date();
		LS.Click_prevDate_icon();
		LS.Select_fromDate();
		LS.Click_ToDate();
		LS.Click_ToDate_Prev_icon();
	    LS.select_Date();
		LS.select_Submit();
		LS.click_profile_1();
	    LS.select_LOG_Out();
     	//Assert.assertTrue(false);
	}

}
