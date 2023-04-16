package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public Launchbrowser_Objects Launchbrowser_Objects;
	public LoginObject LoginObject;
	public PersonalDetailsObject PersonalDetailsObject;
	public AddressObject AddressObject;
	public IdproofObject IdproofObject;
	public EmploymentObject  EmploymentObject ;
	public EducationalDetails_Object EducationalDetails_Object;
	public ReferencesObject ReferencesObject;
	public OtherdetailsObject OtherdetailsObject;
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
	public AddressObject GetAddress() {
		AddressObject =new AddressObject(driver);
		return AddressObject;
		
	}
	public IdproofObject GetIdproofObject() {
		IdproofObject=new IdproofObject(driver);
		return IdproofObject;
	}
	public EducationalDetails_Object GetEducationalDetails_Object() {
		EducationalDetails_Object=new EducationalDetails_Object(driver);
		return EducationalDetails_Object;
		
	}
	public EmploymentObject GetEmploymentObject () {
		EmploymentObject =new EmploymentObject (driver);
		return EmploymentObject ;
	}
	public ReferencesObject GetReferencesObject() {
		ReferencesObject=new ReferencesObject(driver);
		return ReferencesObject;
		
	}
	public OtherdetailsObject GetOtherdetailsObject() {
		OtherdetailsObject=new OtherdetailsObject(driver);
		return OtherdetailsObject;
		
		
	}
	
}
