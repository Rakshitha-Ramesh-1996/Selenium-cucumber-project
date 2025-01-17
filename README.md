Cucumber BDD framework with web driver manager & Allure Reporting along with Page Object Model- using Selenium 4 in a Maven-Java Project

There are 3 testcases which we want to automate:
1. LoggedIn User View:
When a user has a valid login details and he tries to navigate after he has successfully logged in

2. New Registration View:
When a user is not a valid login and wants to register himself and navigates to Registration Page

3. General User View:
When a user doesnot a login page neither he wants to register himself but he wants to navigate and have a look at the Online Products page

Features
1. LoggedIn.feature
Scenario: Validate user is able to view after Login Given User navigates to the Login page When User successfully enters the log in details Then User should be able to view the product category page

2. NewUserRegistration.feature
Scenario: Validate new user is able to view after clicking on new Registration Given User navigates to the Login page When User clicks on new Registration button Then User should be able to view the Registration page

3. GeneralUserView.feature
Scenario: Validate general user is able to view products wihtout logging in Given User navigates to the Online products page When User clicks on Formal Shoes drop down Then User should be able to view the Products
