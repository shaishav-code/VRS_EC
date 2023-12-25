package VEC_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponentsMethods;

     public class Project_field  extends AbstractComponentsMethods{
	 public static WebDriver driver;
     public Project_field(WebDriver driver) {
     super (driver);
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
}		
	
//=========== Project field select ===================
	
	@FindBy (xpath = "//ul[@class='nav navbar-nav m-l-n']/li[3]")
	private WebElement Project;
	
	public void Click_Project() {
	Project.click();
   }
	
//============ Project Drop-down (Select the project)========================
	
	@FindBy (xpath = "//div[@class='collapse navbar-collapse pull-in']/ul[1]/li[3]/ul/li/a")
	private WebElement Project_Dropdown;
	
	public void DropDown (){
	Project_Dropdown.click();
	}
	
//============ Project Drop-down Set column field========================
	
	@FindBy (xpath = "//button[@id='projColumn']")
	private WebElement Column;
		
	public void Set_column (){
	Column.click();
	}
	
//============ Project Drop-down Set column field save button========================
		
	@FindBy (xpath = "//button[@id='projectcolSumbit']")
	private WebElement Save;
			
	public void click_save (){
	Save.click();
				
	}
}