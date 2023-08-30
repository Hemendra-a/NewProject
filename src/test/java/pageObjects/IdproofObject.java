package pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IdproofObject {
	public WebDriver driver;
	public IdproofObject(WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()=' Aadhar Card Details']")
	private WebElement ValidateAdharCarddetails;
	//
	@FindBy(xpath="//*[@for='aadhar_no']")
	private WebElement Validateaadharnumber;
	@FindBy(xpath="//*[@id='aadhar_no']")
	private WebElement GetaadharDetails;
	//
	@FindBy(xpath="//*[@for='aadhar_name_as_per_document']")
	private WebElement ValidateName_as_perDocument;
	@FindBy(xpath="//*[@id='aadhar_name_as_per_document']")
	private WebElement GetName_as_perDocument;
	//
	@FindBy(xpath="//*[@for='aadhar_myfile1']")
	private WebElement ValidateFront_Side;
	@FindBy(xpath="//*[@id='aadhar_myfile1']")
	private WebElement GetNameFront_Side;
	//
	@FindBy(xpath="//*[@for='aadhar_myfile2']")
	private WebElement ValidateBack_Side;
	@FindBy(xpath="//*[@id='aadhar_myfile2']")
	private WebElement GetNameBack_Side;
	
	//Validate pancard details
	@FindBy(xpath="//*[text()='PAN Card Details']")
	private WebElement ValidatePAN_Card_Details;
	//
	@FindBy(xpath="//*[@for='pan_card_number']")
	private WebElement ValidatePancardnumber;
	@FindBy(xpath="//*[@id='pan_card_number']")
	private WebElement GetPancardNumber;
	//
	@FindBy(xpath="//*[@for='pan_name_as_per_document']")
	private WebElement ValidateName_as_perDocument1;
	@FindBy(xpath="//*[@id='pan_name_as_per_document']")
	private WebElement GetName_as_perDocument1;
	//
	@FindBy(xpath="//*[@for='pan_myfile']")
	private WebElement ValidateDocument;
	@FindBy(xpath="//*[@id='pan_myfile']")
	private WebElement GetDocument;
	
	
	/////Driving Licence Details
	@FindBy(xpath="//*[text()=' Driving Licence Details']")
	private WebElement ValidateDL;
	//
	@FindBy(xpath="//*[@for='dl_number']")
	private WebElement ValidateDLNumber;
	@FindBy(xpath="//*[@id='dl_number']")
	private WebElement GetDLNumber;
	//	
	@FindBy(xpath="//*[@for='dl_name_as_per_document']")
	private WebElement ValidateNameasperDocument;
	@FindBy(xpath="//*[@id='dl_name_as_per_document']")
	private WebElement GetNameasperdocument;
	//
	@FindBy(xpath="//*[@for='dl_place_of_issue']")
	private WebElement ValidatePlace;
	@FindBy(xpath="//*[@id='dl_place_of_issue']")
	private WebElement GetPlace;
	//
	@FindBy(xpath="//*[@for='dl_date_of_issue']")
	private WebElement ValidateDateOfissue;
	@FindBy(xpath="//*[@id='dl_date_of_issue']")
	private WebElement Getdateofissue;
	//	
	@FindBy(xpath="//*[@for='dl_expiry_date']")
	private WebElement ValidateExpirydate;
	@FindBy(xpath="//*[@id='dl_expiry_date']")
	private WebElement GetExpirydate;
    //
	@FindBy(xpath="//*[@for='dl_myfile']")
	private WebElement ValidateDocument1;
	@FindBy(xpath="//*[@id='dl_myfile']")
	private WebElement GetDocument1;
	
	//get passport details
	@FindBy(xpath="//*[text()='Passport Details']")
	private WebElement ValidatePassport;
	//
	@FindBy(xpath="//*[@for='passport_no']")
	private WebElement ValidatePassportNumber;
	@FindBy(xpath="//*[@id='passport_no']")
	private WebElement GetPassportNumber;
	//	
	@FindBy(xpath="//*[@for='pass_name_as_per_document']")
	private WebElement ValidateNameasperPDocument;
	@FindBy(xpath="//*[@id='pass_name_as_per_document']")
	private WebElement GetNameasperPdocument;
	//
	@FindBy(xpath="//*[@for='pass_place_of_issue']")
	private WebElement ValidatePlaceP;
	@FindBy(xpath="//*[@id='pass_place_of_issue']")
	private WebElement GetPlaceP;
	//
	@FindBy(xpath="//*[@for='pass_date_of_issue']")
	private WebElement ValidatePDateOfissue;
	@FindBy(xpath="//*[@id='pass_date_of_issue']")
	private WebElement GetPdateofissue;
	//	
	@FindBy(xpath="//*[@for='pass_expiry_date']")
	private WebElement ValidatePExpirydate;
	@FindBy(xpath="//*[@id='pass_expiry_date']")
	private WebElement GetPExpirydate;
    //
	@FindBy(xpath="//*[@for='pass_myfile']")
	private WebElement ValidatePDocument1;
	@FindBy(xpath="//*[@id='pass_myfile']")
	private WebElement GetPDocument1;
	
	//click on previous and next usee explicit wait and Javascript Excetor
	@FindBy(xpath="//*[@id='msform']/div[2]/fieldset[3]/input[1]")
	private WebElement ValidateAndClickPreviousButton_ID;
	@FindBy(xpath="//*[@class='next account_next action-button']")
	private WebElement ValidateAndClickNextButton_ID;
	
	static Logger log=Logger.getLogger(IdproofObject.class.getName());
	public void ValidateAdharCarddetails() {
		ValidateAdharCarddetails.isEnabled();
		ValidateAdharCarddetails.getText();
		String T1=ValidateAdharCarddetails.getText();
		log.info(T1);
      	Assert.assertEquals(T1," Aadhar Card Details");
		
	}
    public void Validateaadharnumber() {
    	Validateaadharnumber.isEnabled();
    	String t=Validateaadharnumber.getText();
    	log.info(t);
    	Assert.assertEquals(t,"Aadhar No.");
		
	}
    public void GetaadharDetails(String Adharno) {
    	GetaadharDetails.isEnabled();
    	GetaadharDetails.sendKeys(Adharno);
    	String t=GetaadharDetails.getText();
    	log.info(t);
    	Assert.assertEquals(t,Adharno);
	}
    public void ValidateName_as_perDocument() {
    	ValidateName_as_perDocument.isEnabled();
    	String t=ValidateName_as_perDocument.getText();
    	log.info(t);
    	Assert.assertEquals(t,"Name as per Document");
		
	}
    public void GetName_as_perDocument(String name) {
    	GetName_as_perDocument.isEnabled();
    	GetName_as_perDocument.sendKeys(name);
    	String t=GetName_as_perDocument.getText();
    	log.info(t);
    	Assert.assertEquals(t,name);
		
 	}
    //
    public void ValidateFront_Side() {
    	ValidateFront_Side.isEnabled();
    	String t=ValidateFront_Side.getText();
    	log.info(t);
    	Assert.assertEquals(t,"Front Side");
		
  	}
    public void GetNameFront_Side() {
    	GetNameFront_Side.isEnabled();
    	GetNameFront_Side.sendKeys("D:\\eclipse-workspace1\\BDD_BGV\\testdata\\project.jpg");
   	}
    //
    public void ValidateBack_Side() {
    	ValidateBack_Side.isEnabled();
    	String t=ValidateBack_Side.getText();
    	log.info(t);
    	Assert.assertEquals(t,"Back Side");
		
  	}
    public void GetNameBack_Side() {
    	GetNameBack_Side.isEnabled();
    	GetNameBack_Side.sendKeys("D:\\eclipse-workspace1\\BDD_BGV\\testdata\\project.jpg");
		
   	}
    //
    public void ValidatePAN_Card_Details() {
		
		
  	}
    //
    public void ValidatePancardnumber() {
		
		
   	}
    public void GetPancardNumber() {
		
		
   	}
    //
    public void ValidateName_as_perDocument1() {
		
		
   	}
    public void GetName_as_perDocument1() {
		
		
   	}
    //
    public void  ValidateDocument() {
		
		
   	}
    public void GetDocument() {
		
		
   	}
    //
    public void  ValidateDL() {
		
		
   	}
    //
    public void ValidateDLNumber() {
		
		
   	}
    public void GetDLNumber() {
		
		
   	}
    //
    public void ValidateNameasperDocument() {
		
		
   	}
    public void GetNameasperdocument() {
		
		
   	}
    //
    public void ValidatePlace() {
		
		
   	}
    public void  GetPlace() {
		
		
   	}
    //
    public void ValidateDateOfissue() {
	
	
	}
    public void  Getdateofissue() {
	
	
	}
    //
    public void ValidateExpirydate() {
    	
    	
	}
    public void   GetExpirydate() {
	
	
	}
    //
    public void ValidateDocument1() {
    	
    	
	}
    public void   GetDocument1() {
	
	
	}
   //get passport details
    public void   ValidatePassport() {
    	
    	
	}
    //
    public void ValidatePassportNumber() {
    	
    	
	}
    public void   GetPassportNumber() {
	
	
	}
    //
    public void ValidateNameasperPDocument() {
    	
    	
	}
    public void   GetNameasperPdocument() {
	
	
	}
    //
    public void ValidatePlaceP() {
    	
    	
	}
    public void   GetPlaceP() {
	
	
	}
    //
    public void ValidatePDateOfissue() {
    	
    	
	}
    public void   GetPdateofissue() {
	
	
	}
    //
    public void ValidatePExpirydate() {
    	
    	
	}
    public void   GetPExpirydate() {
	
	
	}
    //
    public void ValidatePDocument1() {
    	
    	
	}
    public void   GetPDocument1() {
	
	
	}
    //
    public void ValidateAndClickPreviousButton_ID() {
    	
    	
	}
    public void  ValidateAndClickNextButton_ID() {
	
	
	}
  
}
