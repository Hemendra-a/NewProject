package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressObject {
	public WebDriver driver;
	public AddressObject(WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//validate you are on current address page
	@FindBy(xpath="//*[text()='Current Address']")
	private WebElement ValidateCurrentAddressPage;
	@FindBy(xpath="//*[@id='c_door_no']")
	private WebElement GetCDoor_Flat_House_No;
	@FindBy(xpath="//*[@id='c_colony']")
	private WebElement GetCCColony_Street_Apartment;
	@FindBy(xpath="//*[@id='c_landmark']")
	private WebElement GetCLandmark;
	@FindBy(xpath="//*[@id='c_city']")
	private WebElement GetCCity;
	@FindBy(xpath="//*[@id='c_state']")
	private WebElement GetCState;
	@FindBy(xpath="//*[@id='c_pincode']")
	private WebElement GetCPincode;
	@FindBy(xpath="//*[@id='landlord_name']")
	private WebElement GetLandlordName;
	@FindBy(xpath="//*[@id='landlord_phoneno']")
	private WebElement GetLandlord_Phone_No;
	///validate you are on permanent address page
	@FindBy(xpath="//*[@id='check']")
	private WebElement GetSame_as_Current_Address;
	@FindBy(xpath="//*[text()='Permanent Address']")
	private WebElement ValidatePermanentAddressPage;
	////
	@FindBy(xpath="//*[@id='p_door_no']")
	private WebElement GetPDoor_Flat_House_No;
	@FindBy(xpath="//*[@id='p_colony']")
	private WebElement GetPColony_Street_Apartment;
	@FindBy(xpath="//*[@id='p_landmark']")
	private WebElement GetPLandmark;
	@FindBy(xpath="//*[@id='p_city']")
	private WebElement GetPCity;
	@FindBy(xpath="//*[@id='p_state']")
	private WebElement GetPState;
	@FindBy(xpath="//*[@id='p_pincode']")
	private WebElement GetPPincode;
	//previous page and next page
	@FindBy(xpath="//*[@id='msform']/div[2]/fieldset[2]/input[1]")
	private WebElement ClickonPrevious;
	//click on next page and handle UI
	@FindBy(xpath ="//*[@class='address_next action-button']")
	private WebElement ClickonAddressNextButton;


	public void ValidateCurrentAddressPage() throws InterruptedException {
		ValidateCurrentAddressPage.isEnabled();
		Thread.sleep(2000);
		String T1=ValidateCurrentAddressPage.getText();
		System.out.println(T1);
//		Assert.assertTrue(T1.contains("Current Address"));
	}

	public void GetCDoor_Flat_House_No(String CDoor) throws InterruptedException {
		GetCDoor_Flat_House_No.isEnabled();
		Thread.sleep(2000);
		GetCDoor_Flat_House_No.sendKeys(CDoor);
		String T2=GetCDoor_Flat_House_No.getText();
//		Assert.assertTrue(T2.contains(CDoor));
	}
	public void GetCCColony_Street_Apartment(String CColony) throws InterruptedException {
		GetCCColony_Street_Apartment.isEnabled();
		Thread.sleep(2000);
		GetCCColony_Street_Apartment.sendKeys(CColony);
		String T3=GetCCColony_Street_Apartment.getText();
//		Assert.assertTrue(T3.contains(CColony));
	}
	public void GetCLandmark(String CLandmark) throws InterruptedException {
		GetCLandmark.isEnabled();
		Thread.sleep(2000);
		GetCLandmark.sendKeys(CLandmark);
		String T4=GetCLandmark.getText();
//		Assert.assertTrue(T4.contains(CLandmark));
	}
	public void GetCCity(String CCity) throws InterruptedException {
		GetCCity.isEnabled();
		Thread.sleep(2000);
		GetCCity.sendKeys(CCity);
		String T5=GetCCity.getText();
//		Assert.assertTrue(T5.contains(CCity));
	}
	public void GetCState(String CState) throws InterruptedException {
		 GetCState.isEnabled();
		 Thread.sleep(2000);
		 System.out.println(CState);
		 Select sel= new Select(GetCState);
		 sel.selectByVisibleText(CState);
		 System.out.println(CState);
//	     Assert.assertTrue(GetCState.getText().contains(CState));
		
	}
	public void GetCPincode(String Cpincode) throws InterruptedException {
		GetCPincode.isEnabled();
		Thread.sleep(2000);
		GetCPincode.sendKeys(Cpincode);
		String T7=GetCPincode.getText();
//		Assert.assertTrue(T7.contains(Cpincode));
		
	}
	public void GetLandlordName(String LandlordName) throws InterruptedException {
		GetLandlordName.isEnabled();
		Thread.sleep(2000);
		GetLandlordName.sendKeys(LandlordName);
		String T8=GetLandlordName.getText();
//		Assert.assertTrue(T8.contains(LandlordName));
	}
	public void GetLandlord_Phone_No(String LandlordPhone) throws InterruptedException {
		GetLandlord_Phone_No.isEnabled();
		Thread.sleep(2000);
		GetLandlord_Phone_No.sendKeys(LandlordPhone);
        String T9=GetLandlord_Phone_No.getText();
//    	Assert.assertTrue(T9.contains(LandlordPhone));
        
	}
	//
//	public void GetSame_as_Current_Address() throws InterruptedException {
//		GetSame_as_Current_Address.isEnabled();
//		Thread.sleep(2000);
//		GetSame_as_Current_Address.click();
//	}
	public void ValidatePermanentAddressPage() throws InterruptedException {
		ValidatePermanentAddressPage.isEnabled();
		Thread.sleep(2000);
		String PT1=ValidatePermanentAddressPage.getText();
		System.out.println(PT1);
//		Assert.assertTrue(PT1.contains("Permanent Address"));
	}
	//??????????????????????????????????????????????
	public void GetPDoor_Flat_House_No(String PDoor) throws InterruptedException  {
		GetPDoor_Flat_House_No.isEnabled();
		Thread.sleep(2000);
		GetPDoor_Flat_House_No.sendKeys(PDoor);
		String PT2=GetPDoor_Flat_House_No.getText();
//		Assert.assertTrue(PT2.contains(PDoor));
	}
	public void GetPColony_Street_Apartment(String PColony) throws InterruptedException {
		GetPColony_Street_Apartment.isEnabled();
		Thread.sleep(2000);
		GetPColony_Street_Apartment.sendKeys(PColony);
		String PT3=GetPColony_Street_Apartment.getText();
//		Assert.assertTrue(PT3.contains(PColony));
	}
	public void GetPLandmark(String PLandmark) throws InterruptedException {
		GetPLandmark.isEnabled();
		Thread.sleep(2000);
		GetPLandmark.sendKeys(PLandmark);
		String PT4=GetPLandmark.getText();
//		Assert.assertTrue(PT4.contains(PLandmark));
	}
	public void GetPCity(String PCity) throws InterruptedException {
		GetPCity.isEnabled();
		Thread.sleep(2000);
		GetPCity.sendKeys(PCity);
		String PT5=GetPCity.getText();
//		Assert.assertTrue(PT5.contains(PCity));
	}
	public void GetPState(String Pstate) throws InterruptedException {
		 GetPState.isEnabled();
		 System.out.println(Pstate);
		 Thread.sleep(2000);
		 Select sel= new Select(GetPState);
		 sel.selectByVisibleText(Pstate);
		 System.out.println(Pstate);
//	     Assert.assertTrue(GetPState.getText().contains(Pstate));
	}
	public void GetPPincode(String PPincode) throws InterruptedException {
		GetPPincode.isEnabled();
		Thread.sleep(2000);
		GetPPincode.sendKeys(PPincode);
		String PT7=GetPPincode.getText();
//		Assert.assertTrue(PT7.contains(PPincode));
	}

//	public void ClickonPrevious() throws InterruptedException {
//		ClickonPrevious.isEnabled();
//		Thread.sleep(2000);
//		ClickonPrevious.click();
//	}
	public void ClickonNexttttt() throws InterruptedException {
		ClickonAddressNextButton.isEnabled();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		//presence in DOM
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='address_next action-button']")));

		//scrolling
		js.executeScript("arguments[0].scrollIntoView(true);", ClickonAddressNextButton);

		//clickable
		wait.until(ExpectedConditions.elementToBeClickable(ClickonAddressNextButton)).click();

	}
	
	
	}


