@Launch
Feature: Launch URL

 #Background: Launch Url and Handle Window
    #Given User is on Url page
    #And Handle Welcome page
    #When Validate Create acoount option is available
    #And Validate tell us more option is available
    #And Validate update documents option is available
    #Then Validate your fluent account option is available
    #And you are on the login or sign up page
    Scenario: Login page Validation and signin
    Given User is on Login page
    And user Enter email id with Email "hemendra.rajput88263@gmail.com" 
    When user Enter email id with Password "Pass@12345" 

    And Validate new account option is available
    Then click on hidepassword
    And click on submit button

    Scenario: Get personal details from user
    Given User is on Personal Details Page
    And Get Father name from user with FatherName "Khuxyz" 
    When Select blood group with SelectByone "O+" 
    And Select country BY countryName "India"
    Then Select datee of birth by Date "13-05-1997"
    And Select Gender By selectbyone "Male"
    And click on NextButton
    
    #@Launch
    #Scenario: Get Address Details from the user
    #Given Validate user is on Current Address page
    #And Get details from the user CDoor/Flat/House No. with Door "h-10"
    #When Get details from the user CCColony_Street_Apartment with Colony "zyz"
    #And Get details from the user CLandmark with Landmark "abc"
    #And Get details from the user CCity with City "noida"
    #Then Get details from the user CState With State "Uttar Pradesh"
    #And Get details from the user CPincode with Pincode "201301"
    #Then Get details from the user LandlordName with Landloard "abcd"
    #And Get details from the user Landlord_Phone_No with Landlordphone "8826393418"
    #And Click and validate details  Same_as_Current_Address
    #Given Validate user is on Permanent Address Page
    #And Get details from the user PDoor/Flat/House No. with Door "h-11 "
    #When Get details from the user PCColony_Street_Apartment with Colony "zyz"
    #And Get details from the user PLandmark with Landmark "abc"
    #And Get details from the user PCity with City "noida"
    #Then Get details from the user PState With State "Uttar Pradesh"
    #And Get details from the user PPincode with Pincode "201301"
    #Then Click on Previous
    #And Click on Next
    
    #Scenario: Get id proof Details from the user
    #Given ValidateAdharCarddetails
    #And Validateaadharnumber
    #And GetaadharDetails
    #When ValidateName_as_perDocument
    #And GetName_as_perDocument
    #And ValidateFront_Side
    #And GetNameFront_Side
    #And ValidateBack_Side
    #When GetNameBack_Side
    #And ValidatePAN_Card_Details
    #And ValidatePancardnumber
    #And GetPancardNumber
    #When ValidateName_as_perDocument1
    #And GetName_as_perDocument1
    #And ValidateDocument
    #And GetDocument
    #And ValidateDL
    #Then ValidateDLNumber
    #And GetDLNumber
    #And ValidateNameasperDocument
    #And GetNameasperdocument
    #Then ValidatePlace
    #Then GetPlace
    #And ValidateDateOfissue
    #And Getdateofissue
    #And ValidateExpirydate
    #Then GetExpirydate
    #And ValidateDocument1
    #And GetDocument1
    #And ValidatePassport
    #When ValidatePassportNumber
    #And  GetPassportNumber
    #And  ValidateNameasperPDocument
    #And GetNameasperPdocument
    #Then ValidatePlaceP
    #And GetPlaceP
    #And ValidatePDateOfissue
    #Then GetPdateofissue
    #And ValidatePExpirydate
    #And GetPExpirydate
    #And ValidatePDocument1
    #And  GetPDocument1
    #Then ValidateAndClickPreviousButton_ID
    #And ValidateAndClickNextButton_ID
    #
    #
    #
    #