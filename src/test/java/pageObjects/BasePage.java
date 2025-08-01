package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
// this class or .java file is seperated since this part will be common across all the page object class
	// just to show the reusability of the code We have seperated the from page object java files
	// so that just we can reuse this code by extending and super(driver) funtion in constructor of child class
	
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
