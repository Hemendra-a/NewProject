package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmploymentObject {
	public WebDriver driver;
	public EmploymentObject(WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()=' Employment Details']")
	private WebElement Validate_Employment_DetailsPage;
	//	(Emp-1)Current Employment
	@FindBy(xpath="//*[text()='(Emp-1)Current Employment']")
	private WebElement Validate_Emp_1_CurrentEmployment;
	//	
	@FindBy(xpath="//*[@for='curr_com_name_1']")
	private WebElement Validatecurr_com_name_1;
	@FindBy(xpath="//*[@id='curr_com_name_1']")
	private WebElement Getcurr_com_name_1;
	//	
	@FindBy(xpath="//*[@for='curr_com_addr_1']")
	private WebElement Validatecurr_com_addr_1;
	@FindBy(xpath="//*[@id='curr_com_addr_1']")
	private WebElement Getcurr_com_addr_1;
	//
	@FindBy(xpath="//*[@for='curr_com_city_1']")
	private WebElement Validatecurr_com_city_1;
	@FindBy(xpath="//*[@id='curr_com_city_1']")
	private WebElement Getcurr_com_city_1;
	//
	@FindBy(xpath="//*[@for='curr_com_pincode_1']")
	private WebElement Validatecurr_com_pincode_1;
	@FindBy(xpath="//*[@id='curr_com_pincode_1']")
	private WebElement Getcurr_com_pincode_1;
	//
	@FindBy(xpath="//*[@for='curr_com_state_1']")
	private WebElement Validatecurr_com_state_1;
	@FindBy(xpath="//*[@id='curr_com_state_1']")
	private WebElement Getcurr_com_state_1;
	//
	@FindBy(xpath="//*[@for='curr_com_emp_start_date_1']")
	private WebElement Validatecurr_com_emp_start_date_1;
	@FindBy(xpath="//*[@id='curr_com_emp_start_date_1']")
	private WebElement Getcurr_com_emp_start_date_1;
	//
	@FindBy(xpath="//*[@for='curr_com_emp_end_date_1']")
	private WebElement Validatecurr_com_emp_end_date_1;
	@FindBy(xpath="//*[@id='curr_com_emp_end_date_1']")
	private WebElement Getcurr_com_emp_end_date_1;
	//
	@FindBy(xpath="//*[@for='curr_com_emp_code_1']")
	private WebElement Validatecurr_com_emp_code_1;
	@FindBy(xpath="//*[@id='curr_com_emp_code_1']")
	private WebElement Getcurr_com_emp_code_1;
	//
	@FindBy(xpath="//*[@for='curr_com_desig_1']")
	private WebElement Validatecurr_com_desig_1;
	@FindBy(xpath="//*[@id='curr_com_desig_1']")
	private WebElement Getcurr_com_desig_1;
	//
	@FindBy(xpath="//*[@for='curr_com_dept_1']")
	private WebElement Validatecurr_com_dept_1;
	@FindBy(xpath="//*[@id='curr_com_dept_1']")
	private WebElement Getcurr_com_dept_1;
	//
	@FindBy(xpath="//*[@for='curr_com_ctc_1']")
	private WebElement Validatecurr_com_ctc_1;
	@FindBy(xpath="//*[@id='curr_com_ctc_1']")
	private WebElement Getcurr_com_ctc_1;
	//
	@FindBy(xpath="//*[@for='curr_com_salary_1']")
	private WebElement Validatecurr_com_salary_1;
	@FindBy(xpath="//*[@id='curr_com_salary_1']")
	private WebElement Getcurr_com_salary_1;
	//supervisor
	@FindBy(xpath="//*[@id='msform']/div[2]/fieldset[5]/div/div[7]/div/h2")
	private WebElement ValidateCurrent_com_Supervisor;
	//
	@FindBy(xpath="//*[@for='curr_com_sup_name_1']")
	private WebElement Validatecurr_com_sup_name_1;
	@FindBy(xpath="//*[@id='curr_com_sup_name_1']")
	private WebElement Getcurr_com_sup_name_1;
	//
	@FindBy(xpath="//*[@for='curr_com_supervisor_designation_1']")
	private WebElement Validatecurr_com_supervisor_designation_1;
	@FindBy(xpath="//*[@id='curr_com_supervisor_designation_1']")
	private WebElement Getcurr_com_supervisor_designation_1;
	//
	@FindBy(xpath="//*[@for='curr_com_supervisor_email_1']")
	private WebElement Validatecurr_com_supervisor_email_1;
	@FindBy(xpath="//*[@id='curr_com_supervisor_email_1']")
	private WebElement Getcurr_com_supervisor_email_1;
	//
	@FindBy(xpath="//*[@for='curr_com_supervisor_phone_number']")
	private WebElement Validatecurr_com_supervisor_phone_number;
	@FindBy(xpath="//*[@id='curr_com_supervisor_phone_number']")
	private WebElement Getcurr_com_supervisor_phone_number;
	//Current HR
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[5]/div/div[9]/div/h2")
	private WebElement ValidateCurrentHR_details;
	//
	@FindBy(xpath="//*[@for='curr_com_hr_name_1']")
	private WebElement Validatecurr_com_hr_name_1;
	@FindBy(xpath="//*[@id='curr_com_hr_name_1']")
	private WebElement Getcurr_com_hr_name_1;
	//
	@FindBy(xpath="//*[@for='curr_com_hr_designation_1']")
	private WebElement Validatecurr_com_hr_designation_1;
	@FindBy(xpath="//*[@id='curr_com_hr_designation_1']")
	private WebElement Getcurr_com_hr_designation_1;
	//
	@FindBy(xpath="//*[@for='curr_com_hr_official_email_1']")
	private WebElement Validatecurr_com_hr_official_email_1;
	@FindBy(xpath="//*[@id='curr_com_hr_official_email_1']")
	private WebElement Getcurr_com_hr_official_email_1;
	//
	@FindBy(xpath="//*[@for='curr_com_hr_phone_1']")
	private WebElement Validatecurr_com_hr_phone_1;
	@FindBy(xpath="//*[@id='curr_com_hr_phone_1']")
	private WebElement Getcurr_com_hr_phone_1;
	
	//(Emp-2)Previous Employment___________//////////////
	
	@FindBy(xpath="//*[text()='(Emp-2)Previous Employment']")
	private WebElement Validate_Emp_2_PreviousEmployment;
	//	
	@FindBy(xpath="//*[@for='prev_com_name_1']")
	private WebElement Validateprev_com_name_1;
	@FindBy(xpath="//*[@id='prev_com_name_1']")
	private WebElement Getprev_com_name_1;
	//	
	@FindBy(xpath="//*[@for='prev_com_addr_1']")
	private WebElement Validateprev_com_addr_1;
	@FindBy(xpath="//*[@id='prev_com_addr_1']")
	private WebElement Getprev_com_addr_1;
	//
	@FindBy(xpath="//*[@for='prev_com_city_1']")
	private WebElement Validateprev_com_city_1;
	@FindBy(xpath="//*[@id='prev_com_city_1']")
	private WebElement Getprev_com_city_1;
	//
	@FindBy(xpath="//*[@for='prev_com_pincode_1']")
	private WebElement Validateprev_com_pincode_1;
	@FindBy(xpath="//*[@id='prev_com_pincode_1']")
	private WebElement Getprev_com_pincode_1;
	//
	@FindBy(xpath="//*[@for='prev_com_state_1']")
	private WebElement Validateprev_com_state_1;
	@FindBy(xpath="//*[@id='prev_com_state_1']")
	private WebElement Getprev_com_state_1;
	//
	@FindBy(xpath="//*[@for='prev_com_emp_start_date_1']")
	private WebElement Validateprev_com_emp_start_date_1;
	@FindBy(xpath="//*[@id='prev_com_emp_start_date_1']")
	private WebElement Getprev_com_emp_start_date_1;
	//
	@FindBy(xpath="//*[@for='prev_com_emp_end_date_1']")
	private WebElement Validateprev_com_emp_end_date_1;
	@FindBy(xpath="//*[@id='prev_com_emp_end_date_1']")
	private WebElement Getprev_com_emp_end_date_1;
	//
	@FindBy(xpath="//*[@for='prev_com_emp_code_1']")
	private WebElement Validateprev_com_emp_code_1;
	@FindBy(xpath="//*[@id='prev_com_emp_code_1']")
	private WebElement Getprev_com_emp_code_1;
	//
	@FindBy(xpath="//*[@for='prev_com_desig_1']")
	private WebElement Validateprev_com_desig_1;
	@FindBy(xpath="//*[@id='prev_com_desig_1']")
	private WebElement Getprev_com_desig_1;
	//
	@FindBy(xpath="//*[@for='prev_com_dept_1']")
	private WebElement Validateprev_com_dept_1;
	@FindBy(xpath="//*[@id='prev_com_dept_1']")
	private WebElement Getprev_com_dept_1;
	//
	@FindBy(xpath="//*[@for='prev_com_ctc_1']")
	private WebElement Validateprev_com_ctc_1;
	@FindBy(xpath="//*[@id='prev_com_ctc_1']")
	private WebElement Getprev_com_ctc_1;
	//
	@FindBy(xpath="//*[@for='prev_com_salary_1']")
	private WebElement Validateprev_com_salary_1;
	@FindBy(xpath="//*[@id='prev_com_salary_1']")
	private WebElement Getprev_com_salary_1;
	//previous 1 supervisor
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[5]/div/div[16]/div/h2")
	private WebElement ValidatePrev_1_com_Supervisor;
	//
	@FindBy(xpath="//*[@for='prev_com_sup_name_1']")
	private WebElement Validateprev_com_sup_name_1;
	@FindBy(xpath="//*[@id='prev_com_sup_name_1']")
	private WebElement Getprev_com_sup_name_1;
	//
	@FindBy(xpath="//*[@for='prev_com_supervisor_designation_1']")
	private WebElement Validateprev_com_supervisor_designation_1;
	@FindBy(xpath="//*[@id='prev_com_supervisor_designation_1']")
	private WebElement Getprev_com_supervisor_designation_1;
	//
	@FindBy(xpath="//*[@for='prev_com_supervisor_email_1']")
	private WebElement Validateprev_com_supervisor_email_1;
	@FindBy(xpath="//*[@id='prev_com_supervisor_email_1']")
	private WebElement Getprev_com_supervisor_email_1;
	//
	@FindBy(xpath="//*[@for='prev_com_supervisor_phone_number_1']")
	private WebElement Validateprev_com_supervisor_phone_number_1;
	@FindBy(xpath="//*[@id='prev_com_supervisor_phone_number_1']")
	private WebElement Getprev_com_supervisor_phone_number_1;
	//Previous 1 HR
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[5]/div/div[18]/div/h2")
	private WebElement ValidatePrevious_1_HR_details;
	//
	@FindBy(xpath="//*[@for='prev_com_hr_name_1']")
	private WebElement Validateprev_com_hr_name_1;
	@FindBy(xpath="//*[@id='prev_com_hr_name_1']")
	private WebElement Getprev_com_hr_name_1;
	//
	@FindBy(xpath="//*[@for='prev_com_hr_designation_1']")
	private WebElement Validateprev_com_hr_designation_1;
	@FindBy(xpath="//*[@id='prev_com_hr_designation_1']")
	private WebElement Getprev_com_hr_designation_1;
	//
	@FindBy(xpath="//*[@for='prev_com_hr_official_email_1']")
	private WebElement Validateprev_com_hr_official_email_1;
	@FindBy(xpath="//*[@id='prev_com_hr_official_email_1']")
	private WebElement Getprev_com_hr_official_email_1;
	//
	@FindBy(xpath="//*[@for='prev_com_hr_phone_1']")
	private WebElement Validateprev_com_hr_phone_1;
	@FindBy(xpath="//*[@id='prev_com_hr_phone_1']")
	private WebElement Getprev_com_hr_phone_1;
	
	//      (Emp-3)Previous Employment____________________/////////////
	
	@FindBy(xpath="//*[text()='(Emp-3)Previous Employment']")
	private WebElement Validate_Emp_3_PreviousEmployment;
	//	
	@FindBy(xpath="//*[@for='prev_com_name_2']")
	private WebElement Validateprev_com_name_2;
	@FindBy(xpath="//*[@id='prev_com_name_2']")
	private WebElement Getprev_com_name_2;
	//	
	@FindBy(xpath="//*[@for='prev_com_addr_2']")
	private WebElement Validateprev_com_addr_2;
	@FindBy(xpath="//*[@id='prev_com_addr_2']")
	private WebElement Getprev_com_addr_2;
	//
	@FindBy(xpath="//*[@for='prev_com_city_2']")
	private WebElement Validateprev_com_city_2;
	@FindBy(xpath="//*[@id='prev_com_city_2']")
	private WebElement Getprev_com_city_2;
	//
	@FindBy(xpath="//*[@for='prev_com_pincode_2']")
	private WebElement Validateprev_com_pincode_2;
	@FindBy(xpath="//*[@id='prev_com_pincode_2']")
	private WebElement Getprev_com_pincode_2;
	//
	@FindBy(xpath="//*[@for='prev_com_state_2']")
	private WebElement Validateprev_com_state_2;
	@FindBy(xpath="//*[@id='prev_com_state_2']")
	private WebElement Getprev_com_state_2;
	//
	@FindBy(xpath="//*[@for='prev_com_emp_start_date_2']")
	private WebElement Validateprev_com_emp_start_date_2;
	@FindBy(xpath="//*[@id='prev_com_emp_start_date_2']")
	private WebElement Getprev_com_emp_start_date_2;
	//
	@FindBy(xpath="//*[@for='prev_com_emp_end_date_2']")
	private WebElement Validateprev_com_emp_end_date_2;
	@FindBy(xpath="//*[@id='prev_com_emp_end_date_2']")
	private WebElement Getprev_com_emp_end_date_2;
	//
	@FindBy(xpath="//*[@for='prev_com_emp_code_2']")
	private WebElement Validateprev_com_emp_code_2;
	@FindBy(xpath="//*[@id='prev_com_emp_code_2']")
	private WebElement Getprev_com_emp_code_2;
	//
	@FindBy(xpath="//*[@for='prev_com_desig_2']")
	private WebElement Validateprev_com_desig_2;
	@FindBy(xpath="//*[@id='prev_com_desig_2']")
	private WebElement Getprev_com_desig_2;
	//
	@FindBy(xpath="//*[@for='prev_com_dept_2']")
	private WebElement Validateprev_com_dept_2;
	@FindBy(xpath="//*[@id='prev_com_dept_2']")
	private WebElement Getprev_com_dept_2;
	//
	@FindBy(xpath="//*[@for='prev_com_ctc_2']")
	private WebElement Validateprev_com_ctc_2;
	@FindBy(xpath="//*[@id='prev_com_ctc_2']")
	private WebElement Getprev_com_ctc_2;
	//
	@FindBy(xpath="//*[@for='prev_com_salary_2']")
	private WebElement Validateprev_com_salary_2;
	@FindBy(xpath="//*[@id='prev_com_salary_2']")
	private WebElement Getprev_com_salary_2;
	//previous 2 supervisor
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[5]/div/div[25]/div/h2")
	private WebElement ValidatePrev_2_com_Supervisor;
	//
	@FindBy(xpath="//*[@for='prev_com_sup_name_2']")
	private WebElement Validateprev_com_sup_name_2;
	@FindBy(xpath="//*[@id='prev_com_sup_name_2']")
	private WebElement Getprev_com_sup_name_2;
	//
	@FindBy(xpath="//*[@for='prev_com_supervisor_designation_2']")
	private WebElement Validateprev_com_supervisor_designation_2;
	@FindBy(xpath="//*[@id='prev_com_supervisor_designation_2']")
	private WebElement Getprev_com_supervisor_designation_2;
	//
	@FindBy(xpath="//*[@for='prev_com_supervisor_email_2']")
	private WebElement Validateprev_com_supervisor_email_2;
	@FindBy(xpath="//*[@id='prev_com_supervisor_email_2']")
	private WebElement Getprev_com_supervisor_email_2;
	//
	@FindBy(xpath="//*[@for='prev_com_supervisor_phone_number_2']")
	private WebElement Validateprev_com_supervisor_phone_number_2;
	@FindBy(xpath="//*[@id='prev_com_supervisor_phone_number_2']")
	private WebElement Getprev_com_supervisor_phone_number_2;
	//Current HR
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[5]/div/div[18]/div/h2")
	private WebElement ValidatePrevious_2_HR_details;
	//
	@FindBy(xpath="//*[@for='prev_com_hr_name_2']")
	private WebElement Validateprev_com_hr_name_2;
	@FindBy(xpath="//*[@id='prev_com_hr_name_2']")
	private WebElement Getprev_com_hr_name_2;
	//
	@FindBy(xpath="//*[@for='prev_com_hr_designation_2']")
	private WebElement Validateprev_com_hr_designation_2;
	@FindBy(xpath="//*[@id='prev_com_hr_designation_2']")
	private WebElement Getprev_com_hr_designation_2;
	//
	@FindBy(xpath="//*[@for='prev_com_hr_official_email_2']")
	private WebElement Validateprev_com_hr_official_email_2;
	@FindBy(xpath="//*[@id='prev_com_hr_official_email_2']")
	private WebElement Getprev_com_hr_official_email_2;
	//
	@FindBy(xpath="//*[@for='prev_com_hr_phone_2']")
	private WebElement Validateprev_com_hr_phone_2;
	@FindBy(xpath="//*[@id='prev_com_hr_phone_2']")
	private WebElement Getprev_com_hr_phone_2;
	
	//click on previous and next used explicit wait and java script executor
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/form/div[2]/fieldset[5]/input[1]")
	private WebElement Validateandclick_emp_previousbutton;
	@FindBy(xpath="//*[@class='post_next action-button']")
	private WebElement ValidateandClickOn_emp_nectButton;
	
	//validate emplyment details page
	public void Validate_Employment_DetailsPage() {
		
		
	}
	//(Emp-1)Current Employment
    public void Validate_Emp_1_CurrentEmployment() {
		
		
	}
    //
    public void Validatecurr_com_name_1() {
		
		
	}
    public void Getcurr_com_name_1() {
		
		
	}
    //
    public void Validatecurr_com_addr_1() {
		
		
   	}
    public void Getcurr_com_addr_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_city_1() {
		
		
   	}
    public void Getcurr_com_city_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_pincode_1() {
		
		
   	}
    public void Getcurr_com_pincode_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_state_1() {
		
		
   	}
    public void Getcurr_com_state_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_emp_start_date_1() {
		
		
   	}
    public void Getcurr_com_emp_start_date_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_emp_end_date_1() {
		
		
   	}
    public void Getcurr_com_emp_end_date_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_emp_code_1() {
		
		
   	}
    public void Getcurr_com_emp_code_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_desig_1() {
		
		
   	}
    public void Getcurr_com_desig_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_dept_1() {
		
		
   	}
    public void Getcurr_com_dept_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_ctc_1() {
		
		
   	}
    public void Getcurr_com_ctc_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_salary_1() {
		
		
   	}
    public void Getcurr_com_salary_1() {
   		
   		
   	}
  //supervisor
    public void ValidateCurrent_com_Supervisor() {
		
		
   	}
    //
    public void Validatecurr_com_sup_name_1() {
		
		
   	}
    public void Getcurr_com_sup_name_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_supervisor_designation_1() {
		
		
   	}
    public void Getcurr_com_supervisor_designation_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_supervisor_email_1() {
		
		
   	}
    public void Getcurr_com_supervisor_email_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_supervisor_phone_number() {
		
		
   	}
    public void Getcurr_com_supervisor_phone_number() {
   		
   		
   	}
    ////Current HR
    public void ValidateCurrentHR_details() {
   		
   		
   	}
    //
    public void Validatecurr_com_hr_name_1() {
		
		
   	}
    public void Getcurr_com_hr_name_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_hr_designation_1() {
		
		
   	}
    public void Getcurr_com_hr_designation_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_hr_official_email_1() {
		
		
   	}
    public void Getcurr_com_hr_official_email_1() {
   		
   		
   	}
    //
    public void Validatecurr_com_hr_phone_1() {
		
		
   	}
    public void Getcurr_com_hr_phone_1() {
   		
   		
   	}
    ////(Emp-2)Previous Employment___________//////////////
    
    public void Validate_Emp_2_PreviousEmployment() {
   		
   		
   	}
    //
    public void Validateprev_com_name_1() {
		
		
	}
    public void Getprev_com_name_1() {
		
		
	}
    //
    public void Validateprev_com_addr_1() {
		
		
   	}
    public void Getprev_com_addr_1() {
   		
   		
   	}
    //
    public void Validateprev_com_city_1() {
		
		
   	}
    public void Getprev_com_city_1() {
   		
   		
   	}
    //
    public void Validateprev_com_pincode_1() {
		
		
   	}
    public void Getprev_com_pincode_1() {
   		
   		
   	}
    //
    public void Validateprev_com_state_1() {
		
		
   	}
    public void Getprev_com_state_1() {
   		
   		
   	}
    //
    public void Validateprev_com_emp_start_date_1() {
		
		
   	}
    public void Getprev_com_emp_start_date_1() {
   		
   		
   	}
    //
    public void Validateprev_com_emp_end_date_1() {
		
		
   	}
    public void Getprev_com_emp_end_date_1() {
   		
   		
   	}
    //
    public void Validateprev_com_emp_code_1() {
		
		
   	}
    public void Getprev_com_emp_code_1() {
   		
   		
   	}
    //
    public void Validateprev_com_desig_1() {
		
		
   	}
    public void Getprev_com_desig_1() {
   		
   		
   	}
    //
    public void Validateprev_com_dept_1() {
		
		
   	}
    public void Getprev_com_dept_1() {
   		
   		
   	}
    //
    public void Validateprev_com_ctc_1() {
		
		
   	}
    public void Getprev_com_ctc_1() {
   		
   		
   	}
    //
    public void Validateprev_com_salary_1() {
		
		
   	}
    public void Getprev_com_salary_1() {
   		
   		
   	}
  //supervisor
    public void ValidatePrev_1_com_Supervisor() {
    	
		
   	}
    //
    public void ValidatePrev_com_sup_name_1() {
		
		
   	}
    public void GetPrev_com_sup_name_1() {
   		
   		
   	}
    //
    public void ValidatePrev_com_supervisor_designation_1() {
		
		
   	}
    public void GetPrev_com_supervisor_designation_1() {
   		
   		
   	}
    //
    public void ValidatePrev_com_supervisor_email_1() {
		
		
   	}
    public void GetPrev_com_supervisor_email_1() {
   		
   		
   	}
    //
    public void ValidatePrev_com_supervisor_phone_number() {
		
		
   	}
    public void GetPrev_com_supervisor_phone_number() {
   		
   		
   	}
    ////Current HR
    public void ValidatePrevious_1_HR_details() {
   		
   		
   	}
    //
    public void Validateprev_com_hr_name_1() {
		
		
   	}
    public void Getprev_com_hr_name_1() {
   		
   		
   	}
    //
    public void Validateprev_com_hr_designation_1() {
		
		
   	}
    public void Getprev_com_hr_designation_1() {
   		
   		
   	}
    //
    public void Validateprev_com_hr_official_email_1() {
		
		
   	}
    public void Getprev_com_hr_official_email_1() {
   		
   		
   	}
    //
    public void Validateprev_com_hr_phone_1() {
		
		
   	}
    public void Getprev_com_hr_phone_1() {
   		
   		
   	}
    
	//      (Emp-3)Previous Employment____________________/////////////
    public void  Validate_Emp_3_PreviousEmployment() {
    	
    	
    }
    //
    public void Validateprev_com_name_2() {
		
		
	}
    public void Getprev_com_name_2() {
		
		
	}
    //
    public void Validateprev_com_addr_2() {
		
		
   	}
    public void Getprev_com_addr_2() {
   		
   		
   	}
    //
    public void Validateprev_com_city_2() {
		
		
   	}
    public void Getprev_com_city_2() {
   		
   		
   	}
    //
    public void Validateprev_com_pincode_2() {
		
		
   	}
    public void Getprev_com_pincode_2() {
   		
   		
   	}
    //
    public void Validateprev_com_state_2() {
		
		
   	}
    public void Getprev_com_state_2() {
   		
   		
   	}
    //
    public void Validateprev_com_emp_start_date_2() {
		
		
   	}
    public void Getprev_com_emp_start_date_2() {
   		
   		
   	}
    //
    public void Validateprev_com_emp_end_date_2() {
		
		
   	}
    public void Getprev_com_emp_end_date_2() {
   		
   		
   	}
    //
    public void Validateprev_com_emp_code_2() {
		
		
   	}
    public void Getprev_com_emp_code_2() {
   		
   		
   	}
    //
    public void Validateprev_com_desig_2() {
		
		
   	}
    public void Getprev_com_desig_2() {
   		
   		
   	}
    //
    public void Validateprev_com_dept_2() {
		
		
   	}
    public void Getprev_com_dept_2() {
   		
   		
   	}
    //
    public void Validateprev_com_ctc_2() {
		
		
   	}
    public void Getprev_com_ctc_2() {
   		
   		
   	}
    //
    public void Validateprev_com_salary_2() {
		
		
   	}
    public void Getprev_com_salary_2() {
   		
   		
   	}
  //previous 2 supervisor
    public void ValidatePrev_2_com_Supervisor() {
    	
		
   	}
    //
    public void ValidatePrev_com_sup_name_2() {
		
		
   	}
    public void GetPrev_com_sup_name_2() {
   		
   		
   	}
    //
    public void ValidatePrev_com_supervisor_designation_2() {
		
		
   	}
    public void GetPrev_com_supervisor_designation_2() {
   		
   		
   	}
    //
    public void ValidatePrev_com_supervisor_email_2() {
		
		
   	}
    public void GetPrev_com_supervisor_email_2() {
   		
   		
   	}
    //
    public void Validateprev_com_supervisor_phone_number_2() {
		
		
   	}
    public void Getprev_com_supervisor_phone_number_2() {
   		
   		
   	}
    ////Current HR
    public void ValidatePrevious_2_HR_details() {
   		
   		
   	}
    //
    public void Validateprev_com_hr_name_2() {
		
		
   	}
    public void Getprev_com_hr_name_2() {
   		
   		
   	}
    //
    public void Validateprev_com_hr_designation_2() {
		
		
   	}
    public void Getprev_com_hr_designation_2() {
   		
   		
   	}
    //
    public void Validateprev_com_hr_official_email_2() {
		
		
   	}
    public void Getprev_com_hr_official_email_2() {
   		
   		
   	}
    //
    public void Validateprev_com_hr_phone_2() {
		
		
   	}
    public void Getprev_com_hr_phone_2() {
   		
   		
   	}
  //click on previous and next used explicit wait and java script executor
    public void Validateandclick_emp_previousbutton() {
		
		
   	}
    public void ValidateandClickOn_emp_nectButton() {
   		
   		
   	}
   
}
