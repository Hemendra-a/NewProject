package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationalDetails_Object {
	public WebDriver driver;
	public EducationalDetails_Object(WebDriver driver) {
    		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Educational Details']")
	private WebElement ValidateEducational_DetailsPage;
	//high school
	@FindBy(xpath="//*[text()='High School']")
	private WebElement ValidateHigh_School;
	//
	@FindBy(xpath="//*[@for='school_name']")
	private WebElement ValidateSchoolName;
	@FindBy(xpath="//*[@id='school_name']")
	private WebElement GetSchoolName;
	//
	@FindBy(xpath="//*[@for='registration_id']")
	private WebElement ValidateRollNo;
	@FindBy(xpath="//*[@id='registration_id']")
	private WebElement GetRollName;
	//
	@FindBy(xpath="//*[@for='board_name']")
	private WebElement ValidateBoardname;
	@FindBy(xpath="//*[@id='board_name']")
	private WebElement GetBoardName;
	//
	@FindBy(xpath="//*[@for='school_address']")
	private WebElement ValidateSchooladdress;
	@FindBy(xpath="//*[@id='school_address']")
	private WebElement GetSchoolAddress;
	//
	@FindBy(xpath="//*[@for='year_of_passing']")
	private WebElement Validateyear_of_passing;
	@FindBy(xpath="//*[@id='year_of_passing']")
	private WebElement Getyear_of_passing;
	//
	@FindBy(xpath="//*[@for='h_marks']")
	private WebElement Validateh_marks;
	@FindBy(xpath="//*[@id='h_marks']")
	private WebElement Geth_marks;
	//
	@FindBy(xpath="//*[@for='h_myfile']")
	private WebElement Validateh_marksheet;
	@FindBy(xpath="//*[@id='h_myfile']")
	private WebElement Geth_marksheet;
	
	//intermediate
	@FindBy(xpath="//*[text()='Intermediate']")
	private WebElement ValidateIntermediate_School;
	//
	@FindBy(xpath="//*[@for='i_sname']")
	private WebElement ValidateISchoolName;
	@FindBy(xpath="//*[@id='i_sname']")
	private WebElement GetISchoolName;
	//
	@FindBy(xpath="//*[@for='i_r_id']")
	private WebElement ValidateIRollNo;
	@FindBy(xpath="//*[@id='i_r_id']")
	private WebElement GetIRollName;
	//
	@FindBy(xpath="//*[@for='i_board_name']")
	private WebElement ValidateIBoardname;
	@FindBy(xpath="//*[@id='i_board_name")
	private WebElement GetIBoardName;
	//
	@FindBy(xpath="//*[@for='i_school_address']")
	private WebElement ValidateISchooladdress;
	@FindBy(xpath="//*[@id='i_school_address']")
	private WebElement GetISchoolAddress;
	//
	@FindBy(xpath="//*[@for='i_year_of_passing']")
	private WebElement ValidateIyear_of_passing;
	@FindBy(xpath="//*[@id='i_year_of_passing']")
	private WebElement GetIyear_of_passing;
	//
	//
	@FindBy(xpath="//*[@for='i_marks']")
	private WebElement Validatei_marks;
	@FindBy(xpath="//*[@id='i_marks']")
	private WebElement Geti_marks;
	//
	@FindBy(xpath="//*[@for='i_myfile']")
	private WebElement ValidateI_marksheet;
	@FindBy(xpath="//*[@id='i_myfile']")
	private WebElement GetI_marksheet;
	
//Other Degree/Diploma
	@FindBy(xpath="//*[text()='Other Degree/Diploma']")
	private WebElement ValidateOther_Degree_Diploma;
	//
	@FindBy(xpath="//*[@for='ao_course_name']")
	private WebElement ValidateO_course_name;
	@FindBy(xpath="//*[@id='ao_course_name']")
	private WebElement GetO_course_name;
	//
	@FindBy(xpath="//*[@for='ao_specilization']")
	private WebElement ValidateO_specilization;
	@FindBy(xpath="//*[@id='ao_specilization']")
	private WebElement GetO_specilization;
	//
	@FindBy(xpath="//*[@for='ao_year_starting']")
	private WebElement ValidateO_year_starting;
	@FindBy(xpath="//*[@id='ao_year_starting']")
	private WebElement GetO_year_starting;
	//
	@FindBy(xpath="//*[@for='ao_year_ending']")
	private WebElement Validateao_year_ending;
	@FindBy(xpath="//*[@id='ao_year_ending']")
	private WebElement Getao_year_ending;
	//
	@FindBy(xpath="//*[@for='ao_college_name']")
	private WebElement Validateao_college_name;
	@FindBy(xpath="//*[@id='ao_college_name']")
	private WebElement Getao_college_name;
	//
	@FindBy(xpath="//*[@for='ao_college_id']")
	private WebElement ValidateORollNo;
	@FindBy(xpath="//*[@id='ao_college_id']")
	private WebElement GetORollNo;
	//
	@FindBy(xpath="//*[@for='ao_college_address']")
	private WebElement Validateao_college_address;
	@FindBy(xpath="//*[@id='ao_college_address']")
	private WebElement Getao_college_address;
	//
	@FindBy(xpath="//*[@for='ao_college_uname']")
	private WebElement Validateao_college_uname;
	@FindBy(xpath="//*[@id='ao_college_uname']")
	private WebElement Getao_college_uname;
	//
	@FindBy(xpath="//*[@for='ao_student_marks']")
	private WebElement Validateao_student_marks;
	@FindBy(xpath="//*[@id='ao_student_marks']")
	private WebElement Getao_student_marks;
	//
	@FindBy(xpath="//*[@for='ao_student_degree']")
	private WebElement Validateao_student_degree;
	@FindBy(xpath="//*[@id='ao_student_degree']")
	private WebElement Getao_student_degree;
	//
	@FindBy(xpath="//*[@for='ao_student_marksheet']")
	private WebElement Validateao_student_marksheet;
	@FindBy(xpath="//*[@id='ao_student_marksheet']")
	private WebElement Getao_student_marksheet;
	
	//Graduation
	
	@FindBy(xpath="//*[text()='Graduation']")
	private WebElement ValidateGraduation;
	//
	@FindBy(xpath="//*[@for='g_course_name']")
	private WebElement Validateg_course_name;
	@FindBy(xpath="//*[@id='g_course_name']")
	private WebElement Getg_course_name;
	//
	@FindBy(xpath="//*[@for='g_specilization']")
	private WebElement Validateg_specilization;
	@FindBy(xpath="//*[@id='g_specilization']")
	private WebElement Getg_specilization;
	//
	@FindBy(xpath="//*[@for='g_year_starting']")
	private WebElement Validateg_year_starting;
	@FindBy(xpath="//*[@id='g_year_starting']")
	private WebElement Getg_year_starting;
	//
	@FindBy(xpath="//*[@for='g_year_ending']")
	private WebElement Validateg_year_ending;
	@FindBy(xpath="//*[@id='g_year_ending']")
	private WebElement Getg_year_ending;
	//
	@FindBy(xpath="//*[@for='g_college_name']")
	private WebElement Validateg_college_name;
	@FindBy(xpath="//*[@id='g_college_name']")
	private WebElement Getg_college_name;
	//
	@FindBy(xpath="//*[@for='g_college_id']")
	private WebElement ValidateGRollNo;
	@FindBy(xpath="//*[@id='g_college_id']")
	private WebElement GetGRollNo;
	//
	@FindBy(xpath="//*[@for='g_college_address']")
	private WebElement Validateg_college_address;
	@FindBy(xpath="//*[@id='g_college_address']")
	private WebElement Getg_college_address;
	//
	@FindBy(xpath="//*[@for='g_college_uname']")
	private WebElement Validateg_college_uname;
	@FindBy(xpath="//*[@id='g_college_uname']")
	private WebElement Getg_college_uname;
	//
	@FindBy(xpath="//*[@for='g_student_marks']")
	private WebElement Validateg_student_marks;
	@FindBy(xpath="//*[@id='g_student_marks']")
	private WebElement Getg_student_marks;
	//
	@FindBy(xpath="//*[@for='g_student_degree']")
	private WebElement Validateg_student_degree;
	@FindBy(xpath="//*[@id='g_student_degree']")
	private WebElement Getg_student_degree;
	//
	@FindBy(xpath="//*[@for='g_student_marksheet']")
	private WebElement Validateg_student_marksheet;
	@FindBy(xpath="//*[@id='g_student_marksheet']")
	private WebElement Getg_student_marksheet;
	
	//Post Graduation
	@FindBy(xpath="//*[text()='Post Graduation']")
	private WebElement ValidatePost_Graduation;
	//
	@FindBy(xpath="//*[@for='p_course_name']")
	private WebElement Validatep_course_name;
	@FindBy(xpath="//*[@id='p_course_name']")
	private WebElement Getp_course_name;
	//
	@FindBy(xpath="//*[@for='p_specilization']")
	private WebElement Validatep_specilization;
	@FindBy(xpath="//*[@id='p_specilization']")
	private WebElement Getp_specilization;
	//
	@FindBy(xpath="//*[@for='p_year_starting']")
	private WebElement Validatep_year_starting;
	@FindBy(xpath="//*[@id='p_year_starting']")
	private WebElement Getp_year_starting;
	//
	@FindBy(xpath="//*[@for='p_year_ending']")
	private WebElement Validatep_year_ending;
	@FindBy(xpath="//*[@id='g_year_ending']")
	private WebElement Getp_year_ending;
	//
	@FindBy(xpath="//*[@for='p_college_name']")
	private WebElement Validatep_college_name;
	@FindBy(xpath="//*[@id='p_college_name']")
	private WebElement Getp_college_name;
	//
	@FindBy(xpath="//*[@for='p_college_id']")
	private WebElement ValidatepRollNo;
	@FindBy(xpath="//*[@id='p_college_id']")
	private WebElement GetpRollNo;
	//
	@FindBy(xpath="//*[@for='p_college_address']")
	private WebElement Validatep_college_address;
	@FindBy(xpath="//*[@id='p_college_address']")
	private WebElement Getp_college_address;
	//
	@FindBy(xpath="//*[@for='p_college_uname']")
	private WebElement Validatep_college_uname;
	@FindBy(xpath="//*[@id='p_college_uname']")
	private WebElement Getp_college_uname;
	//
	@FindBy(xpath="//*[@for='p_student_marks']")
	private WebElement Validatep_student_marks;
	@FindBy(xpath="//*[@id='p_student_marks']")
	private WebElement Getp_student_marks;
	//
	@FindBy(xpath="//*[@for='p_student_degree']")
	private WebElement Validatep_student_degree;
	@FindBy(xpath="//*[@id='p_student_degree']")
	private WebElement Getp_student_degree;
	//
	@FindBy(xpath="//*[@for='p_student_marksheet']")
	private WebElement Validatep_student_marksheet;
	@FindBy(xpath="//*[@id='p_student_marksheet']")
	private WebElement Getp_student_marksheet;
	
	//click on previous and next //use explicit wait and java script executor
	@FindBy(xpath="//*[@id='msform']/div[2]/fieldset[4]/input[1]']")
	private WebElement ValidateClickOnprevious_E;
	@FindBy(xpath="//*[@class='next educational_next action-button']")
	private WebElement ClickonNextButton_E;
	
	//Get education details
	//validate you are on educational page
	public void ValidateEducational_DetailsPage() {
		
		
	}
	//High school details 
    public void ValidateHigh_School() {
		
		
	}
    //
    public void ValidateSchoolName() {
		
		
	}
    public void GetSchoolName() {
	
	
    }
    //
    public void ValidateRollNo() {
		
		
	}
    public void GetRollName() {
	
	
    }
    //
    public void ValidateBoardname() {
		
		
	}
    public void GetBoardName() {
	
	
    }
    //
    public void ValidateSchooladdress() {
		
		
	}
    public void GetSchoolAddress() {
	
	
    }
    //
    public void Validateyear_of_passing() {
		
		
	}
    public void Getyear_of_passing() {
	
	
    }
    //
    public void Validateh_marks() {
		
		
	}
    public void Geth_marks() {
	
	
    }
    //
    public void Validateh_marksheet() {
		
		
	}
    public void Geth_marksheet() {
	
	
    }
    ////intermediate
    public void ValidateIntermediate_School() {
		
		
	}
    //
    public void ValidateISchoolName() {
		
		
	}
    public void GetISchoolName() {
	
	
    }
    //
    public void ValidateIRollNo() {
		
		
	}
    public void GetIRollName() {
	
	
    }
    //
    public void ValidateIBoardname() {
		
		
	}
    public void GetIBoardName() {
	
	
    }
    //
    public void ValidateISchooladdress() {
		
		
	}
    public void GetISchoolAddress() {
	
	
    }
	//
    public void ValidateIyear_of_passing() {
		
		
	}
    public void GetIyear_of_passing() {
	
	
    }
    //
    public void Validatei_marks() {
		
		
	}
    public void Geti_marks() {
	
	
    }
    //
    public void ValidateI_marksheet() {
		
		
	}
    public void GetI_marksheet() {
	
	
    }
    //Other Degree/Diploma
    public void ValidateOther_Degree_Diploma() {
		
		
	}
    //
    public void ValidateO_course_name() {
		
		
	}
    public void GetO_course_name() {
	
	
    }
    //
    public void ValidateO_specilization() {
		
		
	}
    public void GetO_specilization() {
	
	
    }
    //
    public void ValidateO_year_starting() {
		
		
	}
    public void GetO_year_starting() {
	
	
    }
    //
    public void Validateao_year_ending() {
		
		
	}
    public void Getao_year_ending() {
	
	
    }
    //
    public void Validateao_college_name() {
		
		
	}
    public void Getao_college_name() {
	
	
    }
    //
    public void ValidateORollNo() {
		
		
	}
    public void GetORollNo() {
	
	
    }
    //
    public void Validateao_college_address() {
		
		
	}
    public void Getao_college_address() {
	
	
    }
    //
    public void Validateao_college_uname() {
		
		
	}
    public void Getao_college_uname() {
	
	
    }
    //
    public void Validateao_student_marks() {
		
		
	}
    public void Getao_student_marks() {
	
	
    }
    //
    public void Validateao_student_degree() {
		
		
	}
    public void Getao_student_degree() {
	
	
    }
    //
    public void Validateao_student_marksheet() {
		
		
	}
    public void Getao_student_marksheet() {
	
	
    }
    //Graduation
    
    public void ValidateGraduation() {
    	
    	
    }
    //
    public void Validateg_course_name() {
		
		
	}
    public void Getg_course_name() {
	
	
    }
    //
    public void Validateg_specilization() {
		
		
	}
    public void Getg_specilization() {
	
	
    }
    //
    public void Validateg_year_starting() {
		
		
	}
    public void Getg_year_starting() {
	
	
    }
    //
    public void Validateg_year_ending() {
		
		
	}
    public void Getg_year_ending() {
	
	
    }
    //
    public void Validateg_college_name() {
		
		
	}
    public void Getg_college_name() {
	
	
    }
    //
    public void ValidateGRollNo() {
		
		
	}
    public void GetGRollNo() {
	
	
    }
    //
    public void Validateg_college_address() {
		
		
	}
    public void Getg_college_address() {
	
	
    }
    //
    public void Validateg_college_uname() {
		
		
	}
    public void Getg_college_uname() {
	
	
    }
    //
    public void Validateg_student_marks() {
		
		
	}
    public void Getg_student_marks() {
	
	
    }
    //
    public void Validateg_student_degree() {
		
		
	}
    public void Getg_student_degree() {
	
	
    }
    //
    public void Validateg_student_marksheet() {
		
		
	}
    public void Getg_student_marksheet() {
	
	
    }
    //Post Graduation
    public void ValidatePost_Graduation() {
    	
    	
    }
    //
    public void Validatep_course_name() {
		
		
	}
    public void Getp_course_name() {
	
	
    }
    //
    public void Validatep_specilization() {
		
		
	}
    public void Getp_specilization() {
	
	
    }
    //
    public void Validatep_year_starting() {
		
		
	}
    public void Getp_year_starting() {
	
	
    }
    //
    public void Validatep_year_ending() {
		
		
	}
    public void Getp_year_ending() {
	
	
    }
    //
    public void Validatep_college_name() {
		
		
	}
    public void Getp_college_name() {
	
	
    }
    //
    public void ValidatepRollNo() {
		
		
	}
    public void  GetpRollNo() {
	
	
    }
    //
    public void Validatep_college_address() {
		
		
	}
    public void Getp_college_address() {
	
	
    }
    //
    public void Validatep_college_uname() {
		
		
	}
    public void Getp_college_uname() {
	
	
    }
    //
    public void Validatep_student_marks() {
		
		
	}
    public void Getp_student_marks() {
	
	
    }
    //
    public void Validatep_student_degree() {
		
		
	}
    public void Getp_student_degree() {
	
	
    }
    //
    public void Validatep_student_marksheet() {
		
		
	}
    public void Getp_student_marksheet() {
	
	
    }
  //click on previous and next //use explicit wait and java script executor
    public void ValidateClickOnprevious_E() {
		
		
   	}
    public void ClickonNextButton_E() {
   	
   	
    }
}
