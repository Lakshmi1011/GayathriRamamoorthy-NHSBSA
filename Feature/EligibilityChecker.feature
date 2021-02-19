Feature: Checking the patient eligibility for help from NHS cost checker tool
  Scenario: Verify the patient can able to check for paying nhs cost.
    Given I navigated to Url "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"
    Then  I should be navigated to NHS business Service Authority check for help Page
    When  I click on start button from the check for help page
    Then  I should be navigated to where you live page
    When  I select "Wales" radio button from the where you live page and click on Next button
    Then  I should be navigated to date of birth page
    When  I enter "07/03/1997" from the date of birth page and click on Next button
    Then  I should be navigated to partner page
    When  I select "Yes" radio button from the partner page and click on Next button
    Then  I should be navigated to claim benefits tax page
    When  I select "No" radio button from the claim benefits tax page and click on Next button
    Then  I should be navigated to give a birth page
    When  I select "No" radio button from the give a birth page and click on Next button
    Then  I should be navigated to war prisoner page
    When  I select "No" radio button from the war prisoner page and click on Next button
    Then  I should be navigated to diabetes page
    When  I select "No" radio button from the diabetes page and click on Next button
    Then  I should be navigated to glaucoma page
    When  I select "No" radio button from the glaucoma page and click on Next button
    Then  I should be navigated to care home page
    When  I select "No" radio button from the Care home page and click on Next button
    Then  I should be navigated to LocalCouncil Page
    When  I select "No" radio button from the local council page and click Next Button
    Then  I should be navigated to savings page
    When  I select "No" radio button from the savings page and click on Next button
    Then  I should successfully see get help with NHS costs

