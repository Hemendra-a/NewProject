package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Launchbrowser_Objects {
	public WebDriver driver;
	public Launchbrowser_Objects(WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div/div[3]/button")
	private WebElement nextscreen;
	@FindBy(xpath="/html/body/div/div[2]/ul/li[1]/h3")
	private WebElement WelcomeToFlucent;
	@FindBy(xpath="//*[text()=' We are Flucent document management and background verification partner,and need your help for the same.']")
	private WebElement GetText1;
	@FindBy(xpath="/html/body/div/div[2]/ul/li[2]/h3")
	private WebElement createaccountoption;
	@FindBy(xpath="//*[text()='We will request you to join Flucent in the following steps.']")
	private WebElement gettext2;
	@FindBy(xpath="/html/body/div/div[2]/ul/li[3]/h3")
	private WebElement Tellsusmore;
	@FindBy(xpath="//*[text()='Once your have registered we may ask for your personal details,Address,Id Proof,educational details,employement details,References,Other details.']")
	private WebElement Text3;
	@FindBy(xpath="/html/body/div/div[2]/ul/li[4]/h3")
	private WebElement Uploaddocuments;
	@FindBy(xpath="//*[text()='Please Keep scanned copy of documents handy as you may have to upload then in the process.']")
	private WebElement Text4;
	@FindBy(xpath="/html/body/div/div[2]/ul/li[5]/h3")
	private WebElement Yourflucentaccount;
	@FindBy(xpath="//*[text()='It gets created once the process is complete.you can come back and update your information anytime.']")
	private WebElement Text5;
	@FindBy(xpath="//*[@class=\"button finish close active\"]")
	private WebElement Start;
	
//	By nextscreen=By.xpath("/html/body/div/div[3]/button");
//	By WelcomeToFlucent=By.xpath("/html/body/div/div[2]/ul/li[1]/h3");
//	By GetText1=By.xpath("//*[text()=' We are Flucent document management and background verification partner,and need your help for the same.']");
//	
    public void Gettitle() {
    	System.out.println(driver.getTitle());
		
    }
	public void Getwelcometext() {
		WelcomeToFlucent.isEnabled();
		String Getwelcometext=WelcomeToFlucent.getText();
		System.out.println(Getwelcometext);
		System.out.println(Getwelcometext.contains("WELCOME TO FLUCENT"));
		
	}
	public void getText1() {
		GetText1.isEnabled();
		String getText1=GetText1.getText();
		System.out.println(getText1);
		System.out.println(getText1.contains("We are Flucent document management and background verification partner,and need your help for the same."));
	}
	public void nextscreen() {
		nextscreen.isEnabled();
		nextscreen.click();
	}
	public void createaccountoption() throws InterruptedException {
		createaccountoption.isEnabled();
		Thread.sleep(1000);
		String Createaccount=createaccountoption.getText();
		System.out.println(Createaccount);
		System.out.println(Createaccount.contains("CREATE AN ACCOUNT"));
	}
	public void Getetxt2() throws InterruptedException {
		createaccountoption.isEnabled();
		Thread.sleep(1000);
		String text2=gettext2.getText();
		System.out.println(text2);
		System.out.println(text2.contains("We will request you to join Flucent in the following steps."));
	}
	public void Tellusmore() throws InterruptedException {
		Tellsusmore.isEnabled();
		Thread.sleep(1000);
		String Tellsusmoree=Tellsusmore.getText();
		System.out.println(Tellsusmoree);
		System.out.println(Tellsusmoree.contains("TELL US MORE"));
	}
	public void Gettext3() throws InterruptedException {
		Text3.isEnabled();
		String Textt3=Text3.getText();
		Thread.sleep(1000);
		System.out.println(Textt3);
		System.out.println(Textt3.contains("Once your have registered we may ask for your personal details,Address,Id Proof,educational details,employement details,References,Other details."));
		
	}
	public void Uploaddocument() throws InterruptedException {
		Uploaddocuments.isEnabled();
		Thread.sleep(1000);
		String uploaddocument=Uploaddocuments.getText();
		System.out.println(uploaddocument);
		System.out.println(uploaddocument.contains("UPLOAD DOCUMENTS"));
		
	}
	public void Text4() {
		Text4.isEnabled();
		String text4=Text4.getText();
		System.out.println(text4);
		System.out.println(text4.contains("Please Keep scanned copy of documents handy as you may have to upload then in the process."));
		
	}
	public void Yourflucentaccount() throws InterruptedException {
		Yourflucentaccount.isEnabled();
		Thread.sleep(2000);
		String uploaddocument=Yourflucentaccount.getText();
		System.out.println(uploaddocument);
		System.out.println(uploaddocument.contains("YOUR FLUCENT ACCOUNT"));
		
	}
	public void Text5() {
		Text4.isEnabled();
		String text5=Text5.getText();
		System.out.println(text5);
		System.out.println(text5.contains("It gets created once the process is complete.you can come back and update your information anytime."));
		Start.click();
		
	}
	public void GetLoginpage()  {
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("You are on Login?signup page");
		
		
	}
}
