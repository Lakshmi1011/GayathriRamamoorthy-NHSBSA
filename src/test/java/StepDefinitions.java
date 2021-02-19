import PageObjects.BasePage;
import Utils.DriverFactory;
import Utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Before
    public void setUp() {
        DriverFactory.getDriver();

    }

    @After
    public void tearDown() {
        DriverFactory.closeDriver();
    }

    @Given("I navigated to Url {string}")
    public void i_navigated_to_url(String string) {
        BasePage.driverUtils.navigateToUrl(string);
    }

    @Then("I should be navigated to NHS business Service Authority check for help Page")
    public void i_should_be_navigated_to_nhs_business_service_authority_check_for_help_page()
    {
        String nhsCheckforHelpPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(nhsCheckforHelpPageTitle);

    }

    @When("I click on start button from the check for help page")
    public void i_click_on_start_button_from_the_check_for_help_page()
    {

        BasePage.homePage.StartButton();
    }

    @Then("I should be navigated to where you live page")
    public void i_should_be_navigated_to_where_you_live_page() {
        String CountryPage = BasePage.driverUtils.getPageTitle();
        System.out.println(CountryPage);

    }

    @When("I select {string} radio button from the where you live page and click on Next button")
    public void i_select_radio_button_from_the_where_you_live_page_and_click_on_next_button(String string)
    {
            BasePage.homePage.Country();

            BasePage.homePage.NextButton();
    }

    @Then("I should be navigated to date of birth page")
    public void i_should_be_navigated_to_date_of_birth_page() {
        String dateOfBirthPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(dateOfBirthPageTitle);

    }

    @When("I enter {string} from the date of birth page and click on Next button")
    public void i_enter_from_the_date_of_birth_page_and_click_on_next_button(String string)
    {
        BasePage.homePage.DateEntry();
        BasePage.homePage.MonthEntry();
        BasePage.homePage.YearEntry();
        BasePage.homePage.NextButton();
    }

    @Then("I should be navigated to partner page")
    public void i_should_be_navigated_to_partner_page() {
        String partnerpageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(partnerpageTitle);

    }

    @When("I select {string} radio button from the partner page and click on Next button")
    public void i_select_radio_button_from_the_partner_page_and_click_on_next_button(String string) {

        BasePage.homePage.SelectPartnerRadioBtn();


    }

    @Then("I should be navigated to claim benefits tax page")
    public void i_should_be_navigated_to_claim_benefits_tax_page() {

        String claimBenefitsPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(claimBenefitsPageTitle);
    }

    @When("I select {string} radio button from the claim benefits tax page and click on Next button")
    public void i_select_radio_button_from_the_claim_benefits_tax_page_and_click_on_next_button(String string) {
        BasePage.homePage.SelectClaimBenfitRadioBtn();
        BasePage.homePage.NextButton();
    }

    @Then("I should be navigated to give a birth page")
    public void i_should_be_navigated_to_give_a_birth_page() {

        String giveBirthPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(giveBirthPageTitle);

    }

    @When("I select {string} radio button from the give a birth page and click on Next button")
    public void i_select_radio_button_from_the_give_a_birth_page_and_click_on_next_button(String string) {

        BasePage.homePage.SelectGiveBirthRadioBtn();
        BasePage.homePage.NextButton();
    }

    @Then("I should be navigated to war prisoner page")
    public void i_should_be_navigated_to_war_prisoner_page() {

        String prisonerPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(prisonerPageTitle);
    }

    @When("I select {string} radio button from the war prisoner page and click on Next button")
    public void i_select_radio_button_from_the_war_prisoner_page_and_click_on_next_button(String string)
    {
            BasePage.homePage.SelectArmedRadioBtn();
            BasePage.homePage.NextButton();
        }

    @Then("I should be navigated to diabetes page")
    public void i_should_be_navigated_to_diabetes_page() {

        String diabetesPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(diabetesPageTitle);
    }

    @When("I select {string} radio button from the diabetes page and click on Next button")
    public void i_select_radio_button_from_the_diabetes_page_and_click_on_next_button(String string) {

        BasePage.homePage.SelectDiabetesRadioBtn();
        BasePage.homePage.NextButton();
    }

    @Then("I should be navigated to glaucoma page")
    public void i_should_be_navigated_to_glaucoma_page() {

        String glaucomaPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(glaucomaPageTitle);

    }

    @When("I select {string} radio button from the glaucoma page and click on Next button")
    public void i_select_radio_button_from_the_glaucoma_page_and_click_on_next_button(String string) {
        BasePage.homePage.SelectGlaucomaRadioBtn();
        BasePage.homePage.NextButton();
    }

    @Then("I should be navigated to care home page")
    public void i_should_be_navigated_to_care_home_page() {

        String CarehomePageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(CarehomePageTitle);
    }

    @When("I select {string} radio button from the Care home page and click on Next button")
    public void i_select_radio_button_from_the_care_home_page_and_click_on_next_button(String string) {

        BasePage.homePage.SelectCareHomeRadioBtn();
        BasePage.homePage.NextButton();
    }


    @Then("I should be navigated to LocalCouncil Page")
    public void i_should_be_navigated_to_localcouncil_page() throws Throwable {
         String LocalCouncilPageTitle = BasePage.driverUtils.getPageTitle();
         System.out.println(LocalCouncilPageTitle);
    }

    @When("I select {string} radio button from the local council page and click Next Button")
    public void i_select_something_radio_button_from_the_local_council_page_and_click_next_button(String strArg1) throws Throwable {
          BasePage.homePage.SelectLocalCouncil();
          BasePage.homePage.NextButton();
    }

    @Then("I should be navigated to savings page")
    public void i_should_be_navigated_to_savings_page() {

        String savingsPageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(savingsPageTitle);
    }

    @When("I select {string} radio button from the savings page and click on Next button")
    public void i_select_radio_button_from_the_savings_page_and_click_on_next_button(String string) {

        BasePage.homePage.SelectSavingsRadioBtn();
        BasePage.homePage.NextButton();
    }

    @Then("I should successfully see get help with NHS costs")
    public void i_should_successfully_see_get_help_with_nhs_costs()
    {
        BasePage.homePage.getResultStatus();

    }



}
