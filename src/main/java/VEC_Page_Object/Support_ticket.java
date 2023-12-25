package VEC_Page_Object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponentsMethods;


       public class Support_ticket extends AbstractComponentsMethods{
	   public static WebDriver driver;
	   public Support_ticket(WebDriver driver) {
       super (driver);
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
    }
   
//=========== Support System =============
    
       @FindBy(xpath = "//div[@class='collapse navbar-collapse pull-in']/ul/li[6]") 
       private WebElement Support;
    
       public void Click_Support() {
       Support.click();
    }
    
//=========== Support field open drop-down select support Ticket =============
    
       @FindBy(xpath ="//div[@class=\"collapse navbar-collapse pull-in\"]/ul[1]/li[6]/ul/li/a")
       private WebElement Support_Ticket;
    
       public void Support_ticket() {
       Support_Ticket.click();
    }
  
//===========  support Ticket field Click Created Date From =============
    
       @FindBy(xpath ="//input[@name='from_date']")
       private WebElement Date_From ;
   
       public void Click_Date_From() {
       Date_From.click(); 
   }
   
//=========== support Ticket field select Created Date From =============
   
       @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]")
       private WebElement Select_Date;
    
       public void Select_Date_From() {
       Select_Date.click();
    }
    
//=========== support Ticket field Created Date-To field click:=============
    
       @FindBy(xpath ="//input[@name='to_date']")
       private WebElement Date_To ;
  
       public void Click_Date_TO() {
       Date_To.click(); 
  
    }
    
//=========== support Ticket field select Created Date To =============
    
       @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[6]")
       private WebElement DateTO;
    
       public void Select_DateTo() {
   	   DateTO.click();
    }
    
//=========== support Ticket field click Status:=============
    
       @FindBy(xpath = "//select[@name='status_id']")
       private WebElement Status;
    
       public void Click_Status() {
       Status.click();
    }
    
//=========== support Ticket field open a drop-down Solve Status select:=============
     
       @FindBy(xpath = "//div[@class=\"form-group\"][2]/div/select/option[3]") 
       private WebElement Status_Solve;
    
       public void Click_Solve() {
       Status_Solve.click();
    }
    
//=========== support Ticket field Search button =============
    
       @FindBy(xpath = "//button[@type='submit']")
       private WebElement Search_button;
    
       public void Click_Search_button() {
       Search_button.click();
    } 
    
//=========== Write Validation message============================	
     
       @FindBy(xpath="//div[@class='clearfix']")
       WebElement message;
		
       public String validation_message() {
	   return message.getText();
	}
   
//=========== support Ticket field select  =============
   
       @FindBy(xpath = "//a[@href=\"/EasyCollab/supports/add\"]")
       private WebElement Generate_new_ticket;
   
       public void Click_Generate_new_ticket() {
  	   Generate_new_ticket.click();
   }
   
//=========== support Ticket field click Support Type  =============
   
       @FindBy(xpath="//select[@id='SupportSupportTypeId']")
       private WebElement Support_Type;
    
       public void Click_Support_Type() {
       Support_Type.click();
    }
    
//=========== support Ticket field click Support Type select Hardware & Software =============
     
       @FindBy(xpath="//select[@id=\"SupportSupportTypeId\"]/option[3]")
       private WebElement Hardware_Software;
    
       public void Hardware_Software() {
       Hardware_Software.click();
    }
    
//=========== support Ticket field click Notes filed =============
    
       @FindBy(xpath= "//textarea[@name='data[Support][note]']")
       private WebElement Notes;
    
       public void Click_Notes() {
       Notes.click();
     } 
    
//=========== support Ticket field Writing Notes filed =============
    
       @FindBy(xpath= "//textarea[@name='data[Support][note]']")
       private WebElement Notes_Write;
    
       public void Write_Notes() {
       Notes_Write.sendKeys("Hello viraj Kwm cho");
}
}





