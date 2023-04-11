package stepDefinition;



import io.cucumber.java.en.*;
import pageObjects.Launchbrowser_Objects;
import utils.Testcontextsetup;

public class Launchbrowser {
	Testcontextsetup Testcontextsetup;
	
	public Launchbrowser_Objects Launchbrowser_Objects ;
	public Launchbrowser (Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
		this.Launchbrowser_Objects =Testcontextsetup.PageObjectManager.getBrowserPage();
	}

	@Given("User is on Url page")
	public void user_is_on_url_page() {
      	Launchbrowser_Objects.Gettitle();
      
	}

	@Given("Handle Welcome page")
	public void handle_welcome_page() {
		Launchbrowser_Objects.Getwelcometext();
		Launchbrowser_Objects.getText1();
		Launchbrowser_Objects.nextscreen();
	}

	@When("Validate Create acoount option is available")
	public void validate_create_acoount_option_is_available() throws InterruptedException {
		Launchbrowser_Objects.createaccountoption();
		Launchbrowser_Objects.Getetxt2();
		Launchbrowser_Objects.nextscreen();
		
	}

	@When("Validate tell us more option is available")
	public void validate_tell_us_more_option_is_available() throws InterruptedException {
		Launchbrowser_Objects.Tellusmore();
		Launchbrowser_Objects.Gettext3();
		Launchbrowser_Objects.nextscreen();
	}

	@When("Validate update documents option is available")
	public void validate_update_documents_option_is_available() throws InterruptedException {
		Launchbrowser_Objects.Uploaddocument();
		Launchbrowser_Objects.Text4();
		Launchbrowser_Objects.nextscreen();
	}

	@Then("Validate your fluent account option is available")
	public void validate_your_fluent_account_option_is_available() throws InterruptedException {
		Launchbrowser_Objects.Yourflucentaccount();
		Launchbrowser_Objects.Text5();

	}

	@And("you are on the login or sign up page")
	public void you_are_on_the_login_sign_up_page() {
		Launchbrowser_Objects.GetLoginpage();
	}
}
