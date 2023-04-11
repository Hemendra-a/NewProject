package stepDefinition;

import io.cucumber.java.en.*;
import pageObjects.PersonalDetailsObject;
import utils.Testcontextsetup;

public class PersonalDetails {
	Testcontextsetup Testcontextsetup;
	PersonalDetailsObject PersonalDetailsObject ;
	public PersonalDetails(Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
		this.PersonalDetailsObject =Testcontextsetup.PageObjectManager.Getpersonaldetails();
	}
	@Given("User is on Personal Details Page")
	public void user_is_on_personal_details_page() throws InterruptedException {
	PersonalDetailsObject.Validatepersonaldetaiilspage();
	}

	@And("Get Father name from user with FatherName {string}")
	public void get_father_name_from_user_with_father_name(String Fathername) throws InterruptedException {
		PersonalDetailsObject.Getfathername(Fathername);
	}
	@When("Select blood group with SelectByone {string}")
	public void select_blood_group_with_select_byone(String GetBloodG) {
		PersonalDetailsObject.selectbyvalue(GetBloodG);
	
	}
	@When("Select country BY countryName {string}")
	public void select_country_by_country_name(String string) {
		PersonalDetailsObject.SelectBycountry(string);
	}
	@Then("Select datee of birth by Date {string}")
	public void Select_datee_of_birth_by_Date(String string) {
	    PersonalDetailsObject.SelectDOB(string);
	}
	@And("Select Gender By selectbyone {string}")
	public void Select_Gender_By_selectbyone(String string) {
//		PersonalDetailsObject.Gender(string);
	}
	@And("click on NextButton")
	public void click_on_NextButton()throws InterruptedException {
		PersonalDetailsObject.ClickonNext();
	}

}
