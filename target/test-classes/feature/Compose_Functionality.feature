
Feature: Compose mail feature 
Description: The purpose of this feature is to test compose mail functionality
 

Scenario: Successful Login with Valid entries
Given User navigates to the website gmail.com
When Enter valid credientials
Then Log in successfully

 

Scenario: Compose mail functionality
Given User click on compose mail and compose window openedt
When    Add recipients  address ie. To , CC (carbon copy) , BCC (blind carbon copy) fields
And Select Formatting  Option to change font, make bold  & change text color    
And Add Subject and Message body 
And Attach the file 
And click on send option
Then email is successfully sent 

