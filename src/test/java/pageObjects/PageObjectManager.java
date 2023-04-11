package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public Launchbrowser_Objects Launchbrowser_Objects;
	public LoginObject LoginObject;
	public PersonalDetailsObject PersonalDetailsObject;
	 public WebDriver driver;
	public PageObjectManager (WebDriver driver) {
		this.driver=driver;
	}
	public Launchbrowser_Objects getBrowserPage () {
		Launchbrowser_Objects =new Launchbrowser_Objects (driver);
		return Launchbrowser_Objects;
	}
	public LoginObject getLoginpage() {
		LoginObject =new LoginObject(driver);
		return LoginObject;
		
	}
	public PersonalDetailsObject Getpersonaldetails() {
		PersonalDetailsObject =new PersonalDetailsObject(driver);
		return PersonalDetailsObject;
		
	}
	
}
