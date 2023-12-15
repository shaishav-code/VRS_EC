package EC_TestCase;

import org.testng.annotations.Test;
import VEC_BaseClass.BASE_CLASS;
import VEC_Page_Object.Badges_field;

public class TC_badges extends BASE_CLASS  {

	
	//===================== Click Badges field ================================================
	
	   @Test(priority = 1)
	   public void Badges() throws InterruptedException {		
		
	   Loginlogout();
	   Thread.sleep(2000);
		
	   Badges_field BJ=new Badges_field(driver);
		
	   BJ.Click_Badges();
	   Thread.sleep(2000);
	}
	
	//===================== Contribution field ================================================
	
	    @Test(priority = 2)
	    public void  Contribution() throws InterruptedException {	
			
		Loginlogout();
		Thread.sleep(2000);
		
		Badges_field CF=new Badges_field(driver);
				
		CF.Click_Badges();
		
		CF.Click_contribution();
		Thread.sleep(2000);
		
		CF.Click_Employee_name();
		Thread.sleep(2000);
		
		CF.Click_Date();
		Thread.sleep(2000);
		
		CF.select_Date();
		Thread.sleep(2000);
		
		CF.select_Category();
		
		CF.Click_TODate();
		Thread.sleep(2000);
		
		CF.Select_TODate();
		Thread.sleep(2000);
		
		CF.Select_Search();
		Thread.sleep(2000);
		
		String actualResult = CF.validation_message();
		
		System.out.println(actualResult);
	}
		
	//============================ Badges2 field ===================================================
	
		@Test(priority = 3)
		public void Badges2 () throws InterruptedException {		
	
		Loginlogout();
		Thread.sleep(2000);
		
		Badges_field BJ=new Badges_field(driver);
				
		BJ.Click_Badges();
		Thread.sleep(2000);
		
		BJ.DropDown_Badges();
		Thread.sleep(2000);
		
	    BJ.Show_scrollDown();
		}
		
  //============================ Endorse field ===================================================	
		
        @Test(priority = 4)
		public void Endorse () throws InterruptedException {		
		Loginlogout();
		Badges_field BJ=new Badges_field(driver);
						
		BJ.Click_Badges();
		Thread.sleep(2000);
			
		BJ.DropDown_Endorse();
			
		BJ.Select_TL_name();
		Thread.sleep(2000);
			
		BJ.Select_Category();
		Thread.sleep(2000);
			
		BJ.Select_PM_name();
		Thread.sleep(2000);
			
		BJ.Click_Description();
			
		BJ.Write_Description("Heelo sir Good Morning");
			
		//BJ.click_submit();	
		}				
}
