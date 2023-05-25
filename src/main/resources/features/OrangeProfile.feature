@orange @profile
Feature: orange Profile Test

  Background: user login
    Given the user login with credentials 'Admin' and 'admin123'

  Scenario Outline: Modify Contacts
    And click element of dashboard
    When click on Contact Details
    Then enter on Contact Details
    When user complete de form with parameters '<Street 1>', '<City>', '<Province>', '<Postal Code>' and select country
    And click on save
    Then confirm is displayed

    Examples:
      | Street 1   | City   | Province | Postal Code |
      | Calle test | Gdansk | Azua     | 60580       |