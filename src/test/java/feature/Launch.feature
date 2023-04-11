@Launch
Feature: Launch URL
 Background: Launch Url and Handle Window
    Given User is on Url page
    And Handle Welcome page
    When Validate Create acoount option is available
    And Validate tell us more option is available
    And Validate update documents option is available
    Then Validate your fluent account option is available
    And you are on the login or sign up page
    
    #Scenario: Login page Validation and signin
    Given User is on Login page
    And user Enter email id with Email "hemendra.rajput88263@gmail.com" 
    When user Enter email id with Password "Pass@12345" 
    And Validate new account option is available
    Then click on hidepassword
    And click on submit button
    
    @Smoke,
    @Sanity
    Scenario: Get personal details from user
    Given User is on Personal Details Page
    And Get Father name from user with FatherName "Khuxyz" 
    When Select blood group with SelectByone "O+" 
    And Select country BY countryName "India"
    Then Select datee of birth by Date "13-05-1997"
    And Select Gender By selectbyone "Male"
    And click on NextButton
    
    
    
    
    
