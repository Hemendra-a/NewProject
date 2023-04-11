package stepDefinition;

import io.cucumber.java.en.*;
import pageObjects.LoginObject;
import utils.Testcontextsetup;

public class Loginpage {
	Testcontextsetup Testcontextsetup;
    LoginObject LoginObject ;
	public Loginpage(Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
		this.LoginObject =Testcontextsetup.PageObjectManager.getLoginpage();
	}
	@Given("User is on Login page")
	public void user_is_on_login_page() throws InterruptedException {
		LoginObject.SignIn();
	}

	@Given("user Enter email id with Email {string}")
	public void user_enter_email_id_with_email(String emailid) throws InterruptedException {
		LoginObject.Email(emailid);
	}

	@When("user Enter email id with Password {string}")
	public void user_enter_email_id_with_password(String password) throws InterruptedException {
		LoginObject.Password(password);
	}
	@When("Validate new account option is available")
	public void validate_new_account_option_is_available() throws InterruptedException {
		LoginObject.ValidatesignupButton();
	}

	@Then("click on hidepassword")
	public void click_on_hidepassword() throws InterruptedException {
		LoginObject.ClickonHideButton();
	}

	@Then("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		LoginObject.ClickonSubmitButton();
	}
}
