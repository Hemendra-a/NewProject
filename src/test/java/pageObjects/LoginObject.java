package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {
	
	public WebDriver driver;
	public LoginObject(WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='welcome']")
	private WebElement SignINPage;
	@FindBy(xpath="/html/body/div/div/div[2]/form/div/input[1]")
	private WebElement Email;
	@FindBy(xpath="/html/body/div/div/div[2]/form/div/input[2]")
	private WebElement Password;
	@FindBy(xpath="//*[text()='New Account? Sign Up Here']")
	private WebElement Signup;
	@FindBy(xpath="//*[@id=\"togglePassword\"]")
	private WebElement ClickonhideButton;
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement ClickonSubmitButton;
	public void SignIn () throws InterruptedException {
		Thread.sleep(2000);
		SignINPage.isEnabled();
		Thread.sleep(2000);
		String str=SignINPage.getText();
		System.out.println(str);
	}
	public void Email(String email) throws InterruptedException {
		
		Email.isEnabled();
		
		System.out.println(email);
		Thread.sleep(2000);
        Email.sendKeys(email);
       
	}

	public void Password(String pass) throws InterruptedException {
	
		Password.isEnabled();
		 System.out.println(pass);
		 Thread.sleep(2000);
		Password.sendKeys(pass);
		
	}
	public void ValidatesignupButton() throws InterruptedException {
		Signup.isEnabled();
		 Thread.sleep(2000);
		String signup=Signup.getText();
		System.out.println(signup);
		
	}
	public void ClickonHideButton() throws InterruptedException {
		 Thread.sleep(2000);
		ClickonhideButton.click();
	}
	public void ClickonSubmitButton() throws InterruptedException {
		 Thread.sleep(2000);
		ClickonSubmitButton.click();
	}
}
