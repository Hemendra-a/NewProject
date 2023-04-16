package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferencesObject {
	public WebDriver driver;
	public ReferencesObject(WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//	References
	@FindBy(xpath="//*[text()=' References']")
	private WebElement ValidateReferences;
	//personal refrences
	@FindBy(xpath="//*[text()='Personal References']")
	private WebElement ValidatePersonal_References;
	//	Reference-1
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[6]/div/div[1]/div/h2[3]")
	private WebElement ValidatePersonalReference_1;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_name_1']")
	private WebElement Validatecand_personal_ref_name_1;
	@FindBy(xpath="//*[@id='cand_personal_ref_name_1']")
	private WebElement Getcand_personal_ref_name_1;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_phone_1']")
	private WebElement Validatecand_personal_ref_phone_1;
	@FindBy(xpath="//*[@id='cand_personal_ref_phone_1']")
	private WebElement Getcand_personal_ref_phone_1;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_email_1']")
	private WebElement Validatecand_personal_ref_email_1;
	@FindBy(xpath="//*[@id='cand_personal_ref_email_1']")
	private WebElement Getcand_personal_ref_email_1;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_adress_1']")
	private WebElement Validatecand_personal_ref_adress_1;
	@FindBy(xpath="//*[@id='cand_personal_ref_adress_1']")
	private WebElement Getcand_personal_ref_adress_1;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_relation_1']")
	private WebElement Validatecand_personal_ref_relation_1;
	@FindBy(xpath="//*[@id='cand_personal_ref_relation_1']")
	private WebElement Getcand_personal_ref_relation_1;
	
	//Reference-2
	
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[6]/div/div[4]/h2")
	private WebElement ValidatePersonalReference_2;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_name_2']")
	private WebElement Validatecand_personal_ref_name_2;
	@FindBy(xpath="//*[@id='cand_personal_ref_name_2']")
	private WebElement Getcand_personal_ref_name_2;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_phone_2']")
	private WebElement Validatecand_personal_ref_phone_2;
	@FindBy(xpath="//*[@id='cand_personal_ref_phone_2']")
	private WebElement Getcand_personal_ref_phone_2;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_email_2']")
	private WebElement Validatecand_personal_ref_email_2;
	@FindBy(xpath="//*[@id='cand_personal_ref_email_2']")
	private WebElement Getcand_personal_ref_email_2;
	//
	@FindBy(xpath="//*[@for='cand_personal_ref_address_2']")
	private WebElement Validatecand_personal_ref_adress_2;
	@FindBy(xpath="//*[@id='cand_personal_ref_address_2']")
	private WebElement Getcand_personal_ref_adress_2;
	//
	@FindBy(xpath="//*[@for='cand_personal_relation_2']")
	private WebElement Validatecand_personal_ref_relation_2;
	@FindBy(xpath="//*[@id='cand_personal_relation_2']")
	private WebElement Getcand_personal_ref_relation_2;
	
	//Professional References
	@FindBy(xpath="//*[text()='Professional References']")
	private WebElement ValidateProfessionalReferences;
	//	Reference-1
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[6]/div/div[7]/div/h2[2]")
	private WebElement ValidateProfessionalReference_1;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_name_1']")
	private WebElement Validatecand_professional_ref_name_1;
	@FindBy(xpath="//*[@id='cand_professional_ref_name_1']")
	private WebElement Getcand_professional_ref_name_1;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_com_name_1']")
	private WebElement Validatecand_professional_ref_com_name_1;
	@FindBy(xpath="//*[@id='cand_professional_ref_com_name_1']")
	private WebElement Getcand_professional_ref_com_name_1;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_com_addr_1']")
	private WebElement Validatecand_professional_ref_com_addr_1;
	@FindBy(xpath="//*[@id='cand_professional_ref_com_addr_1']")
	private WebElement Getcand_professional_ref_com_addr_1;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_des_1']")
	private WebElement Validatecand_professional_ref_des_1;
	@FindBy(xpath="//*[@id='cand_professional_ref_des_1']")
	private WebElement Getcand_professional_ref_des_1;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_email_1']")
	private WebElement Validatecand_professional_ref_email_1;
	@FindBy(xpath="//*[@id='cand_professional_ref_email_1']")
	private WebElement Getcand_professional_ref_email_1;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_phone_1']")
	private WebElement Validatecand_professional_ref_phone_1;
	@FindBy(xpath="//*[@id='cand_professional_ref_phone_1']")
	private WebElement Getcand_professional_ref_phone_1;
	
	//Reference-2
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[6]/div/div[10]/div/h2")
	private WebElement ValidateProfessionalReference_2;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_name_2']")
	private WebElement Validatecand_professional_ref_name_2;
	@FindBy(xpath="//*[@id='cand_professional_ref_name_2']")
	private WebElement Getcand_professional_ref_name_2;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_com_name_2']")
	private WebElement Validatecand_professional_ref_com_name_2;
	@FindBy(xpath="//*[@id='cand_professional_ref_com_name_2']")
	private WebElement Getcand_professional_ref_com_name_2;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_com_addr_2']")
	private WebElement Validatecand_professional_ref_com_addr_2;
	@FindBy(xpath="//*[@id='cand_professional_ref_com_addr_2']")
	private WebElement Getcand_professional_ref_com_addr_2;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_des_2']")
	private WebElement Validatecand_professional_ref_des_2;
	@FindBy(xpath="//*[@id='cand_professional_ref_des_2']")
	private WebElement Getcand_professional_ref_des_2;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_email_2']")
	private WebElement Validatecand_professional_ref_email_2;
	@FindBy(xpath="//*[@id='cand_professional_ref_email_2']")
	private WebElement Getcand_professional_ref_email_2;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_phone_2']")
	private WebElement Validatecand_professional_ref_phone_2;
	@FindBy(xpath="//*[@id='cand_professional_ref_phone_2']")
	private WebElement Getcand_professional_ref_phone_2;
	
	//Reference-3
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[6]/div/div[13]/div/h2")
	private WebElement ValidateProfessionalReference_3;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_name_3']")
	private WebElement Validatecand_professional_ref_name_3;
	@FindBy(xpath="//*[@id='cand_professional_ref_name_3']")
	private WebElement Getcand_professional_ref_name_3;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_com_name_3']")
	private WebElement Validatecand_professional_ref_com_name_3;
	@FindBy(xpath="//*[@id='cand_professional_ref_com_name_3']")
	private WebElement Getcand_professional_ref_com_name_3;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_com_addr_3']")
	private WebElement Validatecand_professional_ref_com_addr_3;
	@FindBy(xpath="//*[@id='cand_professional_ref_com_addr_3']")
	private WebElement Getcand_professional_ref_com_addr_3;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_des_3']")
	private WebElement Validatecand_professional_ref_des_3;
	@FindBy(xpath="//*[@id='cand_professional_ref_des_3']")
	private WebElement Getcand_professional_ref_des_3;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_email_3']")
	private WebElement Validatecand_professional_ref_email_3;
	@FindBy(xpath="//*[@id='cand_professional_ref_email_3']")
	private WebElement Getcand_professional_ref_email_3;
	//
	@FindBy(xpath="//*[@for='cand_professional_ref_phone_3']")
	private WebElement Validatecand_professional_ref_phone_3;
	@FindBy(xpath="//*[@id='cand_professional_ref_phone_3']")
	private WebElement Getcand_professional_ref_phone_3;
	
	//click on previous and next button used java script executor and explicit wait
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[6]/input[1]")
	private WebElement ValidateandClick_ref_PreviousButton;
	@FindBy(xpath="//*[@class='references_next action-button']")
	private WebElement ValidateandClick_ref_next_Button;
	
	//	References
	public void ValidateReferences() {
		
		
	}
	//personal refrences
	public void ValidatePersonal_References() {
		
		
	}
    //	Reference-1
	public void ValidatePersonalReference_1() {
		
		
	}
	//
	public void Validatecand_personal_ref_name_1() {
		
		
	}
	public void Getcand_personal_ref_name_1() {
		
		
	}
	//
	public void Validatecand_personal_ref_phone_1() {
		
		
	}
	public void Getcand_personal_ref_phone_1() {
		
		
	}
	//
	public void Validatecand_personal_ref_email_1() {
		
		
	}
	public void Getcand_personal_ref_email_1() {
		
		
	}
	//
	public void Validatecand_personal_ref_adress_1() {
		
		
	}
	public void Getcand_personal_ref_adress_1() {
		
		
	}
	//
	public void Validatecand_personal_ref_relation_1() {
		
		
	}
	public void Getcand_personal_ref_relation_1() {
		
		
	}
	//	//Reference-2
	public void ValidatePersonalReference_2() {
		
		
	}
	//
	public void Validatecand_personal_ref_name_2() {
		
		
	}
	public void Getcand_personal_ref_name_2() {
		
		
	}
	//
	public void Validatecand_personal_ref_phone_2() {
		
		
	}
	public void Getcand_personal_ref_phone_2() {
		
		
	}
	//
	public void Validatecand_personal_ref_email_2() {
		
		
	}
	public void Getcand_personal_ref_email_2() {
		
		
	}
	//
	public void Validatecand_personal_ref_adress_2() {
		
		
	}
	public void Getcand_personal_ref_adress_2() {
		
		
	}
	//
	public void Validatecand_personal_ref_relation_2() {
		
		
	}
	public void Getcand_personal_ref_relation_2() {
		
		
	}
	
	//	//Professional References
	public void ValidateProfessionalReferences() {
		
		
	}
	////	Reference-1
	public void ValidateProfessionalReference_1() {
		
		
	}
	//
	public void Validatecand_professional_ref_name_1() {
		
		
	}
	public void Getcand_professional_ref_name_1() {
		
		
	}
	//
	public void Validatecand_professional_ref_com_name_1() {
		
		
	}
	public void Getcand_professional_ref_com_name_1() {
		
		
	}
	//
	public void Validatecand_professional_ref_com_addr_1() {
		
		
	}
	public void Getcand_professional_ref_com_addr_1() {
		
		
	}
	//
	public void Validatecand_professional_ref_des_1() {
		
		
	}
	public void Getcand_professional_ref_des_1() {
		
		
	}
	//
	public void Validatecand_professional_ref_email_1() {
		
		
	}
	public void Getcand_professional_ref_email_1() {
		
		
	}
	//
	public void Validatecand_professional_ref_phone_1() {
		
		
	}
	public void Getcand_professional_ref_phone_1() {
		
		
	}
	//	//Reference-2
	public void ValidateProfessionalReference_2() {
		
		
	}
	//
	public void Validatecand_professional_ref_name_2() {
		
		
	}
	public void Getcand_professional_ref_name_2() {
		
		
	}
	//
	public void Validatecand_professional_ref_com_name_2() {
		
		
	}
	public void Getcand_professional_ref_com_name_2() {
		
		
	}
	//
	public void Validatecand_professional_ref_com_addr_2() {
		
		
	}
	public void Getcand_professional_ref_com_addr_2() {
		
		
	}
	//
	public void Validatecand_professional_ref_des_2() {
		
		
	}
	public void Getcand_professional_ref_des_2() {
		
		
	}
	//
	public void Validatecand_professional_ref_email_2() {
		
		
	}
	public void Getcand_professional_ref_email_2() {
		
		
	}
	//
	public void Validatecand_professional_ref_phone_2() {
		
		
	}
	public void Getcand_professional_ref_phone_2() {
		
		
	}
	//	//Reference-3
	public void ValidateProfessionalReference_3() {
		
		
	}
	//
	public void Validatecand_professional_ref_name_3() {
		
		
	}
	public void Getcand_professional_ref_name_3() {
		
		
	}
	//
	public void Validatecand_professional_ref_com_name_3() {
		
		
	}
	public void Getcand_professional_ref_com_name_3() {
		
		
	}
	//
	public void Validatecand_professional_ref_com_addr_3() {
		
		
	}
	public void Getcand_professional_ref_com_addr_3() {
		
		
	}
	//
	public void Validatecand_professional_ref_des_3() {
		
		
	}
	public void Getcand_professional_ref_des_3() {
		
		
	}
	//
	public void Validatecand_professional_ref_email_3() {
		
		
	}
	public void Getcand_professional_ref_email_3() {
		
		
	}
	//
	public void Validatecand_professional_ref_phone_3() {
		
		
	}
	public void Getcand_professional_ref_phone_3() {
		
		
	}
	//	//click on previous and next button used java script executor and explicit wait
	public void ValidateandClick_ref_PreviousButton() {
		
		
	}
	public void ValidateandClick_ref_next_Button() {
		
		
	}

}
