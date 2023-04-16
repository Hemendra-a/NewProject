package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherdetailsObject {
	public WebDriver driver;
	public OtherdetailsObject (WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	Other Details
	@FindBy(xpath="//*[text()='Other Details']")
	private WebElement ValidateReferences;
	//get etxt Have you ever been charged or convicted for any criminal offense in India or abroad?*
	@FindBy(xpath="//*[@for='details']")
	private WebElement ValidateDEtails;
	//
	@FindBy(xpath="//*[@id='details']")
	private WebElement SelectDEtails;
	
	//click on previous and next button used java script executor and explicit wait
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[7]/input[1]")
	private WebElement ValidateandClick_Otherdetails_PreviousButton;
	@FindBy(xpath="//*[@class='other_next action-button']")
	private WebElement ValidateandClick_OtherDetails_next_Button;
	
	////	Other Details
	
	public void ValidateReferences() {
		
		
	}
	//	//get etxt Have you ever been charged or convicted for any criminal offense in India or abroad?*
	public void ValidateDEtails() {
		
		
	}
	//
	public void SelectDEtails() {
		
		
	}
	//click on previous and next button used java script executor and explicit wait
	public void ValidateandClick_Otherdetails_PreviousButton() {
		
		
	}
	public void  ValidateandClick_OtherDetails_next_Button() {
		
		
	}
}
