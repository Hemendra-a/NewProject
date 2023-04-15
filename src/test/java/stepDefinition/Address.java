package stepDefinition;

import java.awt.AWTException;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pageObjects.AddressObject;
import utils.Testcontextsetup;

public class Address {
	
	Testcontextsetup Testcontextsetup;
	AddressObject AddressObject ;
	public Address(Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
		this.AddressObject=Testcontextsetup.PageObjectManager.GetAddress();
		
	}

@Given("Validate user is on Current Address page")
public void validate_user_is_on_current_address_page() throws InterruptedException {
	AddressObject.ValidateCurrentAddressPage();
}
@Given("Get details from the user CDoor\\/Flat\\/House No. with Door {string}")
public void get_details_from_the_user_c_door_flat_house_no_with_door(String CDoor) throws InterruptedException {
	AddressObject.GetCDoor_Flat_House_No(CDoor);
}

@When("Get details from the user CCColony_Street_Apartment with Colony {string}")
public void get_details_from_the_user_cc_colony_street_apartment_with_colony(String CCColony) throws InterruptedException {
	AddressObject.GetCCColony_Street_Apartment(CCColony);
}

@When("Get details from the user CLandmark with Landmark {string}")
public void get_details_from_the_user_c_landmark_with_landmark(String CLandmark ) throws InterruptedException {
	AddressObject.GetCLandmark(CLandmark );
}

@When("Get details from the user CCity with City {string}")
public void get_details_from_the_user_c_city_with_city(String CCity) throws InterruptedException {
	AddressObject.GetCCity(CCity);
}

@Then("Get details from the user CState With State {string}")
public void get_details_from_the_user_c_state_with_state(String CState)throws InterruptedException  {
	AddressObject.GetCState(CState);
}

@Then("Get details from the user CPincode with Pincode {string}")
public void get_details_from_the_user_c_pincode_with_pincode(String CPincode)throws InterruptedException  {
	AddressObject.GetCPincode(CPincode);
}

@Then("Get details from the user LandlordName with Landloard {string}")
public void get_details_from_the_user_landlord_name_with_landloard(String LandlordName) throws InterruptedException {
	AddressObject.GetLandlordName(LandlordName);
}

@Then("Get details from the user Landlord_Phone_No with Landlordphone {string}")
public void get_details_from_the_user_landlord_phone_no_with_landlordphone(String Landlordphone)throws InterruptedException  {
	AddressObject.GetLandlord_Phone_No(Landlordphone);
}

//@Then("Click and validate details  Same_as_Current_Address")
//public void click_and_validate_details_same_as_current_address() throws InterruptedException {
//	AddressObject.GetSame_as_Current_Address();
//}

@Given("Validate user is on Permanent Address Page")
public void validate_user_is_on_permanent_address_page()throws InterruptedException  {
	AddressObject.ValidatePermanentAddressPage();
}

@Given("Get details from the user PDoor\\/Flat\\/House No. with Door {string}")
public void get_details_from_the_user_p_door_flat_house_no_with_door(String  PDoor)throws InterruptedException  {
	AddressObject.GetPDoor_Flat_House_No( PDoor);
}

@When("Get details from the user PCColony_Street_Apartment with Colony {string}")
public void get_details_from_the_user_pc_colony_street_apartment_with_colony(String PCColony) throws InterruptedException {
	AddressObject.GetPColony_Street_Apartment(PCColony);
}

@When("Get details from the user PLandmark with Landmark {string}")
public void get_details_from_the_user_p_landmark_with_landmark(String PLandmark)throws InterruptedException  {
	AddressObject.GetPLandmark(PLandmark);
}

@When("Get details from the user PCity with City {string}")
public void get_details_from_the_user_p_city_with_city(String PCity) throws InterruptedException {
	AddressObject.GetPCity(PCity);
}

@Then("Get details from the user PState With State {string}")
public void get_details_from_the_user_p_state_with_state(String  PState)throws InterruptedException  {
	AddressObject.GetPState( PState);
}

@Then("Get details from the user PPincode with Pincode {string}")
public void get_details_from_the_user_p_pincode_with_pincode(String  PPincode)throws InterruptedException  {
	AddressObject.GetPPincode( PPincode);
}

//@Then("Click on Previous")
//public void click_on_previous() throws InterruptedException {
//	AddressObject.ClickonPrevious();
//}

@Then("Click on Next")
public void click_on_next() throws InterruptedException, AWTException {
	AddressObject.ClickonNexttttt();
	
}


}
