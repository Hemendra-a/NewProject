package BDD_BGV.BDD_BGV;
//
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class Dryrun {
//	public WebDriver driver;
//	public Dryrun(WebDriver driver) {
//    		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath="//*[@id='msform']/div[2]/fieldset[1]/div/div[1]/div/h2")
//	private WebElement Personaldetailspage;
//	@FindBy(xpath="//*[@id='blood_group']")
//	private WebElement SelectByValue;
//	@FindBy(xpath="//*[@id='fname']")
//	private WebElement Fathername;
//	@FindBy(xpath="//*[@id='nationality']")
//	private WebElement SelectCountry;
//	@FindBy(xpath="//*[@id='dob']")
//	private WebElement DateOfbirth;
//	@FindBy(xpath="//*[@id='gender']")
//	private WebElement SelectGender;
//	@FindBy(xpath="//*[@class='next personal_next action-button']")
//	private WebElement ClickonNext;
//public static void main(String[] args) {
//	System.setProperty("webdriver.edge.driver","D:\\eclipse-workspace1\\BDD_BGV\\Driver\\msedgedriver.exe");
//	WebDriver driver=new EdgeDriver();
//	driver.get("https://flucenttechnologies.com/bgv/login.php");
//	
//
//	driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/input[1]")).sendKeys("hemendra.rajput88263@gmail.com");
//	driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/input[2]")).sendKeys("Pass@12345");
//	driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
//	driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("xyz");
//	driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("13-05-1997");
//
//	
//}
//}

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Dryrun  {
    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","D:\\eclipse-workspace1\\BDD_BGV\\Driver\\msedgedriver.exe");
   	WebDriver driver=new EdgeDriver();
   	String baseUrl = "https://www.testingbaba.com/old/newdemo.html";
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id='elements-accordion']/div[1]/div[1]/h2/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='upload and download']")).click();
        WebElement uploadElement = driver.findElement(By.id("File1"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("D:\\eclipse-workspace1\\BDD_BGV\\testdata\\Screenshot (54).png");

        // check the "I accept the terms of service" check box
//     driver.findElement(By.id("terms")).click();
//
//        // click the "UploadFile" button
//        driver.findElement(By.name("send")).click();
        }
}
