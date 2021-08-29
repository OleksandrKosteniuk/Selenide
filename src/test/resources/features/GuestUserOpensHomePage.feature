@Regression
Feature: Guest User opens Home Page
  As a customer
  I want to be able to open Home Page
  Scenario: Guest User opens Home Page
    Given I am an anonymous customer with clear cookies
    When I open the Home page