package VEC_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponentsMethods;

        public class Marketing_Field {
        public static WebDriver driver;
        public Marketing_Field(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

	}
	// =========== Marketing field select ===================

	    @FindBy(xpath = "//div[@class='collapse navbar-collapse pull-in']/ul[1]/li[4]")
	    private WebElement Marketing;

	    public void Click_marketing() {
		Marketing.click();
	}

	// ======== Marketing field select inquiries drop-down =========

	    @FindBy(xpath = "//ul[@class='nav navbar-nav m-l-n']/li[4]/ul")
	    private WebElement inquiries;

	    public void Click_inquiries() {
		inquiries.click();
	}
	
	// ======== inquiries field select Favorite =========

	    @FindBy(xpath = "//div[@class='pull-left']/header/span/a[2]")
	    private WebElement Select_Favorite;

	    public void Click_Favorite() {
		Select_Favorite.click();
	}
}
