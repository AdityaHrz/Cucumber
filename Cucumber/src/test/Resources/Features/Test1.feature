Feature: Validating the login functionality for Orange HRM
Scenario: To validating the login with username and password


Given Open the Orange HRM and the user should be on login page
When User enters the "Admin" and "admin123"
And Clicks on to Login
Then Check if the user is logged in successfully 

Scenario: To check if we can run two scenario with 2 class files

Given Open the google chrome
When search for taylor swift
And hit search
Then close window