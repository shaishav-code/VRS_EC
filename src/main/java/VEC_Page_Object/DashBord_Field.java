package VEC_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.cache.AbstractCache;

import AbstractComponents.AbstractComponentsMethods;

    public class DashBord_Field extends AbstractComponentsMethods {
	public static WebDriver driver;
	public DashBord_Field(WebDriver driver) {
	 super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
	@FindBy (xpath = "//a[normalize-space()='Dashboard']")
	private WebElement Deshbord;
	
	public void DeshBord() {
		Deshbord.click();
		
	}
}