package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PersonalDetailsObject {
	public WebDriver driver;
	public PersonalDetailsObject(WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='msform']/div[2]/fieldset[1]/div/div[1]/div/h2")
	private WebElement Personaldetailspage;
	@FindBy(xpath="//*[@id='blood_group']")
	private WebElement SelectByValue;
	@FindBy(xpath="//*[@id='fname']")
	private WebElement Fathername;
	@FindBy(xpath="//*[@id='nationality']")
	private WebElement SelectCountry;
	@FindBy(xpath="//*[@id='dob']")
	private WebElement DateOfbirth;
	@FindBy(xpath="//*[@id='gender']")
	private WebElement SelectGender;
	@FindBy(xpath="//*[@class='next personal_next action-button']")
	private WebElement ClickonNext;
	
	public void Validatepersonaldetaiilspage() throws InterruptedException {
		Thread.sleep(5000);
		String gettext=Personaldetailspage.getText();
		System.out.println(gettext);
		Thread.sleep(2000);
		System.out.println(gettext.contains("Personal Details"));
		System.out.println("You are on personal details page");
		Assert.assertTrue(gettext.contains("Personal Details"));
	}
	public void Getfathername(String name) throws InterruptedException {
		
		System.out.println(name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys(name);
	}
	public void selectbyvalue(String value) {
		System.out.println(value);
		 Select sel= new Select(SelectByValue);
		 sel.selectByVisibleText(value);
		 System.out.println(value);
		 Assert.assertTrue(SelectByValue.getText().contains(value));
	}
	public void SelectBycountry(String value1) {
		 Select sel= new Select(SelectCountry);
		 sel.selectByVisibleText(value1);
		 System.out.println(value1);
		 Assert.assertTrue(SelectCountry.getText().contains(value1));
	}
	public void SelectDOB(String DOB) {
		DateOfbirth.isEnabled();
		DateOfbirth.sendKeys(DOB);
	}
	public void Gender(String Gender) {
		SelectGender.isEnabled();
		SelectGender.sendKeys(Gender);
		 Assert.assertTrue(SelectGender.getText().contains(Gender));
	}
	public void ClickonNext() throws InterruptedException {
		        ClickonNext.isEnabled();
		
		
		        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				JavascriptExecutor js = ((JavascriptExecutor) driver);

				//presence in DOM
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='next personal_next action-button']")));

				//scrolling
				js.executeScript("arguments[0].scrollIntoView(true);", ClickonNext);

				//clickable
				wait.until(ExpectedConditions.elementToBeClickable(ClickonNext)).click();
	

	
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(ClickonNext)).click();;

//		if(driver.switchTo().alert().getText().contains("Please select the gender.")) {
//			Thread.sleep(3000);
//			driver.switchTo().alert();
//			System.out.println(driver.switchTo().alert().getText());
//			driver.switchTo().alert().accept();
//		
//			
//		}
//		else if(driver.switchTo().alert().getText().contains("Please enter your date of birth.")) {
//			Thread.sleep(3000);
//			driver.switchTo().alert();
//			System.out.println(driver.switchTo().alert().getText());
//			driver.switchTo().alert().accept();
//		}
//		else if(driver.switchTo().alert().getText().contains("Please select your blood group.")) {
//			Thread.sleep(3000);
//			driver.switchTo().alert();
//			System.out.println(driver.switchTo().alert().getText());
//			driver.switchTo().alert().accept();
//		}
//		else if(driver.switchTo().alert().getText().contains("Please enter your father/guardian name.")) {
//			Thread.sleep(3000);
//			driver.switchTo().alert();
//			System.out.println(driver.switchTo().alert().getText());
//			driver.switchTo().alert().accept();
//		}
//	
	}
}
