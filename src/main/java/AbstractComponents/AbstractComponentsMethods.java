package AbstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponentsMethods {
	
	WebDriver driver;
	WebDriverWait wait;

	public AbstractComponentsMethods(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	   //===========My profile click ==================
    
    @FindBy(xpath = "//*[@class='collapse navbar-collapse pull-in']/ul[2]")
	   private WebElement myProfile;

	   public void click_profile_1() {
		myProfile.click();
	}
	
	   //===========My profile click open drop-down select Logout==================

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement LOG_Out;

	public void select_LOG_Out() {
		LOG_Out.click();
	}
}