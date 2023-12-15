package EC_TestCase;

import org.testng.annotations.Test;

import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Library_Snacks;
import VEC_Page_Object.Support_ticket;

        public class TC_Library_Snacks extends BASE_CLASS {
	    @Test(priority = 1)
	    public void Library() throws InterruptedException {		
		Loginlogout();
		Thread.sleep(2000);
		
		Library_Snacks LS=new Library_Snacks(driver);
		 
		LS.Libriry();
		Thread.sleep(2000);
		
		LS.Select_Libriry();
		Thread.sleep(3000);
		
		LS.Libriry();
		Thread.sleep(2000); 
		
		LS.Select_MyLibriry();
		
		LS.Libriry();
		Thread.sleep(2000); 
		
	    LS.Select_Snacks();
		Thread.sleep(2000); 
		
		LS.Select_OrderSnacks();
		}
	
	    @Test(priority = 2)
	    public void My_order () throws InterruptedException {		
	    	
		Loginlogout();
		Thread.sleep(2000);
		
		Library_Snacks LS=new Library_Snacks(driver);
		
		LS.Libriry();
		Thread.sleep(2000);
		
		LS.Click_MyOrder();
		Thread.sleep(2000);
		
		LS.From_date();
		
		LS.Click_prev_icon();
		Thread.sleep(2000);
		
		LS.Select_fromDate();
		Thread.sleep(2000);
		
		LS.Click_ToDate();
		Thread.sleep(2000);
		
		LS.Click_prev_icon();
		
		LS.select_ToDate();
		
		LS.select_Submit();
		Thread.sleep(2000);	
	}

}
