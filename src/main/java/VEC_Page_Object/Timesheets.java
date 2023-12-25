package VEC_Page_Object;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import AbstractComponents.AbstractComponentsMethods;

          public class Timesheets extends AbstractComponentsMethods {
	      public WebDriver driver;
	      public  Timesheets(WebDriver driver) {
	    	  super(driver);
	      this.driver = driver;
	      PageFactory.initElements(driver, this);
   	  }
    
//============Click the TimeSheet field ============
    
          @FindBy(xpath = "//div[@class='collapse navbar-collapse pull-in']/ul[1]/li[7]") 
          private WebElement TimeSheet;
    
          public void Click_TimeSheet() {
    	  TimeSheet.click();
      }
    
//============Click the TimeSheet field ============
    
          @FindBy(xpath = "//div[@class='collapse navbar-collapse pull-in']/ul[1]/li[7]/ul/li/a") 
          private WebElement select_TimeSheet;
    
          public void select_Timesheet() {
    	  select_TimeSheet.click();
      }
    
//============ TimeSheet field click Select Project field ============
     
          @FindBy(xpath = "//div[@class='form-group fieldBox'][1]/div") 
          private WebElement Select_Project ;
    
          public void click_Project ()  {
    	  Select_Project.click();
    }
 
//============ TimeSheet field click Select Project name ============
    
          @FindBy(xpath="//*[@class='chosen-results']//li")
          private List<WebElement> projectdropdown;
     
          public void Select_project(String projectname)
	{
		  for(WebElement option:projectdropdown)
		{
		  String Status = option.getText();
		  
	 	       if(Status.contains(projectname))
			{
				option.click();
			}
		}
	}
      
//============ TimeSheet field click Select task field ============
    
          @FindBy(xpath = "//div[@class='form-group fieldBox'][2]/div") 
          private WebElement click_Task ;
    
          public void click_task ()  {
    	  click_Task.click();
    }
    
 //============ TimeSheet field click Select task (testing)  ============
    
          @FindBy(xpath = "//*[@class=\"chosen-results\"]//*[text()=\"Testing\"]") 
          private List<WebElement> Select_Task ;
   
	      public void Select_task(String taskname)
		 {
		  for(WebElement option:Select_Task)
			{
				String Status = option.getText();
				if(Status.contains(taskname))
				{
					option.click();
				}
			}
		}
 
 //============TimeSheet field click Work Type field============
      
           @FindBy(xpath = "//div[@class='form-group fieldBox'][3]/div") 
           private WebElement Select_WorkType ;
    
           public void click_Worktype()  {
           Select_WorkType.click();
    }
    
    
//============ TimeSheet field click Select Work Type (Free)============
    
          @FindBy(xpath = "//*[@class=\"chosen-results\"]//*[text() = \"Free\"]") 
           // @FindBy(xpath ="//*[@class='chosen-results']//*[1]")
           private List<WebElement>  WorkType ;
     
	       public void Work_Type (String select_WorkType )
		{
			for(WebElement option:WorkType)
			{
				String Status = option.getText();
				if(Status.contains(select_WorkType))
				{
					option.click();
				}
			}
		}
      
//============ TimeSheet field click Hours field ============
    
           @FindBy(xpath ="//*[@placeholder='Enter Hours']") 
           private WebElement Select_Hours;
    
           public void Click_Hours()  {
    	   Select_Hours.click();
    	   Select_Hours.sendKeys("8");
    }
    
//============ TimeSheet field click and write Notes field ============  
    
          @FindBy(xpath ="//textarea[@id=\"notes\"]") 
          private WebElement Select_Notes ;
    
          public void click_Notes()  {
    	  Select_Notes.click();
    	  Select_Notes.sendKeys("Hii");
    }
 
//============ TimeSheet field click Add button field ============  
    
         @FindBy(xpath =("//button[@type='submit'][normalize-space()='ADD']"))
         private WebElement Add_button ;
    
         public void Add_Icon()  {
    	 Add_button.click();

    }
  
    
//============ TimeSheet field click Select Reason field ============
    
         @FindBy(xpath = "//*[@id='select_notes_chosen']/a")
         private WebElement Select_Reason ;
    
         public void Reason_field()  {
    	 Select_Reason.click();

    }
   
//============ TimeSheet field click Select Reason (Came Late) ============
    
        @FindBy(xpath = "//*[@class='chosen-results']//li") 
        private List<WebElement>  ReasonType ;
   
	    public void  Select_Reason_Type(String select_Reason )
	 	{
			for(WebElement option:ReasonType)
			{
				String Status = option.getText();
				if(Status.contains(select_Reason))
				{
					option.click();
				}
			}
		}
	  
//============ TimeSheet field Hours field ============
	    
	     @FindBy(xpath ="//*[@class='col-sm-8']/input") 
	     private WebElement Hours ;
	    
	     public void write_Hours()  {
	     Hours.click();
	     Hours.sendKeys("2");
	    }
	    
 //============ TimeSheet field click Reason Notes field ============
    
        @FindBy(xpath ="//textarea[@id='reason_comment']") 
        private WebElement Write_Notes ;
      
        public void Select_Notes()  {
    	Write_Notes.click();
    	Write_Notes.sendKeys("Hii Viraj");
      }
      
//============ TimeSheet field click Add button-2 field ============  
      
        @FindBy(xpath =("(//button[@type=\"submit\"])[2]"))
        private WebElement Add_button_2 ;
      
        public void Add_Button()  {
    	Add_button_2.click();

      }
    
//============ TimeSheet field click From date field ============ 
      
          @FindBy(xpath ="//input[@id='fromDate']")
          private WebElement From_Date ;
       
          public void Click_from_date()  {
    	  From_Date.click();
      }
      
//============ TimeSheet field click prev month button ============ 
      
          @FindBy(xpath ="//div[@id='ui-datepicker-div']/div/a[1]")
          private WebElement PREV_Month ;
      
          public void Click_Prev_month()  {
    	  PREV_Month.click();
      }
        
//============ TimeSheet field click Select Date ============ 
      
          @FindBy(xpath ="//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[1]/td[4]")
          private WebElement Select_Date ;
      
          public void select_Date()  {
    	  Select_Date.click();
      }
      
//============ TimeSheet field click To-date field ============ 
      
         @FindBy(xpath =" //input[@name=\"data[Report][to_date]\"]")
         private WebElement To_Date ;
      
         public void click_To_Date()  {
    	 To_Date.click();
      }
      
//============ TimeSheet field click prev month _To_Date button ============ 
      
          @FindBy(xpath ="//div[@id='ui-datepicker-div']/div/a[1]")
          private WebElement Prev_Month ;
      
          public void Prev_month_icon()  {
    	  Prev_Month.click();
      }
      
//============ TimeSheet field select To Date field ============ 
      
          @FindBy(xpath ="//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[5]")
          private WebElement Selct_Date ;
      
          public void Select_To_Date()  {
    	  Selct_Date.click();
      }
      
//============ TimeSheet field select Project ============   
         
          @FindBy(xpath = "//div[@id='projectItemDropbox_chosen']//span[contains(text(),'Choose One')]")
          private WebElement  Project ;
      
          public void Select_Project2()  {
    	  Project.click();
      }
      
//============ TimeSheet field Project Name  ============
      
           @FindBy(xpath = "//*[@class='chosen-results']//*[text()='Knowledge Upgrade']") 
           private List<WebElement>  Name_Project ;
     
  	       public void  Project_select(String select_Project )
  		{
  		  for(WebElement option:Name_Project)
  			{
  		  String Status = option.getText();
  		  if(Status.contains(select_Project))
  				{
  		  option.click();
  				}
  			}
  		}
   
//============ TimeSheet field search button  ============   
      
           @FindBy(xpath = " //button[@id='SearchButton']")
           private WebElement  Search_button;
      
           public void Click_search_button()  {
    	   Search_button.click();
      }
    
//============ TimeSheet field Hours Calculator field============ 
      
    
          @FindBy(xpath = "//button[@id='calculatorPopupBtn']")
          private WebElement Hours_Calculator;
      
          public void Click_Hours_Calculator()  {
    	  Hours_Calculator.click();
      }
     
//============ TimeSheet field Hours Calculator field ( Hours)============ 
      
          @FindBy(xpath = "//input[@id='hours']")
          private WebElement Hours1;
      
          public void Click_Hours_1()  {
    	  Hours1.click();
    	  Hours1.sendKeys("8");
      }
      
//============ TimeSheet field Hours Calculator field ( Minute)============ 
      
          @FindBy(xpath = "//input[@id='minutes']")
          private WebElement Minute1;
      
          public void Click_Minute_1()  {
      	  Minute1.click();
    	  Minute1.sendKeys("30");
      }
      
//============ TimeSheet field Hours Calculator close button============
      
         @FindBy(xpath = "//a[@class='btn btn-primary']")
         private WebElement close;
      
         public void Click_Close()  {
    	 close.click();   	  
      }
}


    
