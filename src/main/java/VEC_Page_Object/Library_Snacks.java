package VEC_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

       public class Library_Snacks  {
	   public WebDriver driver;
       public Library_Snacks(WebDriver driver) {
       this.driver = driver;
	   PageFactory.initElements(driver, this);
   	   }
    
    //===========Library and snack field============
    
       @FindBy(xpath = "//ul[@class='nav navbar-nav m-l-n']/li[8]")
	   private WebElement Library_snack;

	   public void Libriry() {
	   Library_snack.click();
	}
	
	 //===========Library and snack field open drop-down select library field============
	
	   @FindBy(xpath = "//ul[@class='nav navbar-nav m-l-n']/li[8]/ul/li[1]/a")
	   private WebElement Library;

	    public void Select_Libriry() {
		Library.click();
		}
		
	//===========Library and snack field open drop-down select MY LIBRARY field============
		
		@FindBy(xpath = "//ul[@class='nav navbar-nav m-l-n']/li[8]/ul/li[2]/a")
		private WebElement MyLibrary;

		public void Select_MyLibriry() {
		MyLibrary.click();
			}
		
	//===========Library and snack field open drop-down select ordersnacks field============
			
		 @FindBy(xpath = "//ul[@class='nav navbar-nav m-l-n']/li[8]/ul/li[3]/a")
		 private WebElement Snacks;

		 public void Select_Snacks() {
		 Snacks.click();
			}
		
	//===========Library and snacks field open drop-down select ordersnacks field (Get order)============
			
		 @FindBy(xpath = "(//button[@type=\"button\"])[1]")
		 private WebElement OrderSnacks;
		 
		 public void Select_OrderSnacks() {
		 OrderSnacks.click();
			}
		
	//===========Library and snacks field open drop-down select My order ============
			
		 @FindBy(xpath = "//div[@class='collapse navbar-collapse pull-in']/ul[1]/li[8]/ul/li[4]")
		 private WebElement MyOrder;

		 public void Click_MyOrder() {
		 MyOrder.click();
			}
			
	//===========Library and snacks field open drop-down select My order from date ============
			
		 @FindBy(xpath = "//input[@id='from_date']")
		 private WebElement Date;

		 public void From_date() {
		 Date.click();
			}
			
	//===========Library and snacks field open drop-down select My order Prev icon ============
			
		 @FindBy(xpath = "//div[@id='ui-datepicker-div']/div/a[1]")
		 private WebElement Prev_button;

		 public void Click_prev_icon() {
		 Prev_button.click();
			}
					
	//===========Library and snacks field open drop-down select My order Select date ============	
			
		 @FindBy(xpath = "//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[1]/td[4]")
		 private WebElement Select_Date;

		 public void Select_fromDate() {
		 Select_Date.click();
			}

	//===========Library and snacks field open drop-down select My order To-Date ============
	
		 @FindBy(xpath = "//input[@id='to_date']")
		 private WebElement TO_Date;

		 public void Click_ToDate() {
		 TO_Date.click();
			}
	
	//===========Library and snacks field open drop-down select My order Prev icon for ToDate============	
			
		 @FindBy(xpath = "//div[@id='ui-datepicker-div']/div/a[1]")
		 private WebElement Prev_TO_Date;

		 public void Click_ToDate_Prev_icon() {
		 Prev_TO_Date.click();
			}

	//===========Library and snacks field open drop-down select My order Select Todate ============
	
         @FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]")
		 private WebElement Select_TO_Date;

		 public void select_ToDate() {
		 Select_TO_Date.click();
			}
			
	//===========Library and snacks field open drop-down select My order submit ============
			
		 @FindBy(xpath = "//button[@type='submit']")
		 private WebElement Select_Submit;

		 public void select_Submit() {
		 Select_Submit.click();
			}
	}

