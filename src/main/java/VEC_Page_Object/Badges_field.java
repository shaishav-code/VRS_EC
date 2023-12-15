package VEC_Page_Object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

           public class Badges_field  {
	       public static WebDriver driver;
	       public Badges_field(WebDriver driver) {        
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
	       }
		 
		// ==================== Badges field select ===================
		 
		    @FindBy(xpath = "//div[@class= 'collapse navbar-collapse pull-in']/ul/li[5]/a")
		    private WebElement Badges;

		    public void Click_Badges() {
		    Badges.click();
		    }
		
		// ===== Badges field drop-down select contribution ===========
		
		    @FindBy(xpath = "//div[@class= 'collapse navbar-collapse pull-in']/ul/li[5]/ul/li[1]/a")
		    private WebElement contribution;

		    public void Click_contribution() {
		    contribution.click();
		    }
			
		//====== contribution field select Employee name ==============
		
			@FindBy(xpath = "//select[@name='employee_id']/option[21]")
			private WebElement Employee_name;

			public void Click_Employee_name() {
			Employee_name.click();
			}
	
		//===== contribution field click Date field ===================
								
			@FindBy(xpath = "//input[@id='from_assign_date']")
			private WebElement Date;

			public void Click_Date() {
			Date.click();
			}
					
		//==== contribution field open calander and select Date =======	
								
			//@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]")
			@FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]")
			private WebElement Select_Date;

			public void select_Date() {
			Select_Date.click();
			}
								
		//===== contribution field Category drop-down =================		
				
			@FindBy(xpath = "//select[@name='category']/option[20]")
			private WebElement Category;

			public void select_Category() {
			Category.click();
			Category.isSelected();
			}				
				
	  //====== contribution field click To-Date field =================
				
			@FindBy(xpath = "//input[@id='to_assign_date']")
			private WebElement To_Date;

			public void Click_TODate() {
			To_Date.click();
			}				
				
	//===== contribution field open calendar and select To-Date ======	
				
			@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[3]")
			private WebElement To_Date_Select;

			public void Select_TODate() {
			To_Date_Select.click();
			}	
				
	//=========== contribution field Search button ===================
				
			@FindBy(xpath = "//button[@type='submit']")
			private WebElement search_button;
				
			public void Select_Search() {
			search_button.click();
			}	
				
	//=========== Write Validation message============================				

		    @FindBy(xpath="//td[@class='dataTables_empty']")
              WebElement message;
				
		    public String validation_message() {
			return message.getText();
			}
											
	// ======= The open drop-down select Badges field  ===============
				
		    @FindBy(xpath="//a[@href=\"/EasyCollab/badges\"]")
             WebElement Select_Badges;
				
		    public void DropDown_Badges() {
			Select_Badges.click();
			}
				
	//==================== Scroll down ================================		
				
	        public void Show_scrollDown() {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    }		
				 
	//======== Open the drop-down and select Endorse field ============	
				  
			@FindBy(xpath= "//a[@href='/EasyCollab/badges/endorse']")
	        WebElement Select_Endorse;
					
		    public void DropDown_Endorse() {
			Select_Endorse.click();
			}
				 	
	//============= Endorse field Select TL name ======================	 
				 
			 @FindBy(xpath= "//select[@name='data[Score][tl_id]']/option[18]")
		     WebElement TL_name;
						
			 public void Select_TL_name() {
			 TL_name.click();
			}
				 
	//============= Endorse field Select Category =====================		
						
			@FindBy(xpath= "//select[@name='data[Score][category]']/option[20]")
			WebElement Category_name ;
							
			public void Select_Category() {
		    Category_name.click();
			}	
				 
	//============= Endorse field Select PM Name =======================			 
				 
			@FindBy(xpath= "//select[@name='data[Score][pm_id]']/option[18]")
			WebElement PM_name ;
							
			public void Select_PM_name() {
			PM_name.click();
			}	
					
	//============= Endorse field Click a Description box ====================				
					
			@FindBy(xpath= "//textarea[@class='form-control text-input']")
		    WebElement Description ;
							
			public void Click_Description() {
			Description.click();
			
		    }	
			
	//============= Endorse field Description box ====================	
			
			@FindBy(xpath= "//textarea[@class='form-control text-input']")
		    WebElement Description_Text ;
							
			public void Write_Description(String string) {
				Description_Text.sendKeys("Hello sir Good Morning");
		    }
			
		//============= Endorse field submit button  ====================	
					
			 @FindBy(xpath= "//input[@name='submit']")
			 WebElement Submit ;
									
			 public void click_submit() {
			 Submit.click();					
			 }							
}								
					
					
					
					
					
				 

