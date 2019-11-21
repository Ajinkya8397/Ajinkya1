Feature: Registration Features

Scenario: User enters all his credentials
  Given the Signup page is opened
  When user enters Ajinkya10 as username 
  And user enters Ajinkya as First Name
  And user enters Patil as Last Name
  And user enters Patil@123 as password
  And user enters Patil@123 as confirm password
  And user select gender as male
  And user enters ajinkyapatil55@gmail.com as E-Mail
  And user enters "9876543210" as Mobile Number
  And User enters "04/08/1997" as DOB
  And user enters Pune as Address
  And User select What is Your Birth Place? as Security Question
  And user enters Nasik as Answer
  And user clicks on Register Button
  
  Then user will Finds a testmeapp homepage
