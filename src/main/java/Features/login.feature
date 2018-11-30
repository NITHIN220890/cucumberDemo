Feature: Free CRM login Feature
Scenario: Free_CRM login test scenario
Given : User is already available on login page
When : Title of login page is Free Crm
Then : user enters username
And : user enters password
And : user clicks on login button
Then :user is on home page
And : user Logs out
Then : user back in the login page