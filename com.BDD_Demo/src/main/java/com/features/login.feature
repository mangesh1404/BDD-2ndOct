Feature: JBK offline website

Scenario: login Test

Given user should be on login page
When  user enters valid credentials
And   user click on login button
Then  user will be on home page

Scenario: JBK logo test

Given user should be on login page
Then  user should see a logo

