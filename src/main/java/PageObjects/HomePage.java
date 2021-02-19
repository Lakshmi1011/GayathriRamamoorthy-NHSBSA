package PageObjects;

import Utils.DriverFactory;
import Utils.DriverUtils;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomePage {

     WebDriver driver;

     @FindBy(id = "next-button") public WebElement StartBtn;

     @FindBy(xpath = "//label[@id='label-wales']") public WebElement LivingCountry;

     @FindBy(id="next-button") public  WebElement NextBtn;

     @FindBy(id= "dob-day") public  WebElement DateTextBox;

     @FindBy(id = "dob-month") public  WebElement MonthTextBox;

    @FindBy(id = "dob-year") public  WebElement YearTextBox;

    @FindBy(xpath = "//label[@id='label-yes']") public  WebElement PartnerRadioBtn;

    @FindBy(xpath = "//label[@id='label-no']") public WebElement ClaimBenefitsRadioBtn;

    @FindBy(xpath = "//label[@id='label-no']") public WebElement GiveabirthRadioBtn;

    @FindBy(xpath = "//label[@id='label-no']") public WebElement ArmedForcesRadioBtn;

    @FindBy(xpath = "//label[@id='label-no']") public WebElement DiabetesRadioBtn;

    @FindBy(xpath = "//label[@id='label-no']") public WebElement GlaucomaRadioBtn;

    @FindBy(xpath = "//label[@id='label-no']") public WebElement CareHomeRadioBtn;

    @FindBy(xpath = "//label[@id='label-no']") public WebElement localCouncil;

    @FindBy(xpath = "//label[@id='label-yes']") public WebElement SavingsRadioBtn;

    @FindBy(xpath = "//h1[@id='result-heading']") public  WebElement result;
    public HomePage(WebDriver driver)
     {
         this.driver = driver;
         PageFactory.initElements(driver,this);
     }

   public  void StartButton()
   {

       DriverUtils.click(StartBtn);

   }
  public void Country()
  {

      DriverUtils.click(LivingCountry);
      Boolean status = DriverUtils.verifyisChecked(LivingCountry);
      System.out.println(status);
  }
  public void NextButton()
  {
      DriverUtils.click(NextBtn);
      DriverUtils.waitForElementClickable(DriverFactory.driver,NextBtn);
  }
  public void DateEntry()
  {
      DriverUtils.type(DateTextBox,"07");
  }
  public void MonthEntry()
  {
      DriverUtils.type(MonthTextBox,"03");
  }
public void  YearEntry()
{
    DriverUtils.type(YearTextBox,"1997");
}
public void SelectPartnerRadioBtn()
{
    DriverUtils.click(PartnerRadioBtn);
}

public void SelectClaimBenfitRadioBtn()
{
    DriverUtils.click(ClaimBenefitsRadioBtn);
}

public void SelectGiveBirthRadioBtn()
{
    DriverUtils.click(GiveabirthRadioBtn);
}
public void SelectArmedRadioBtn()
{
   DriverUtils.click(ArmedForcesRadioBtn);
}
public void SelectDiabetesRadioBtn()
{
 DriverUtils.click(DiabetesRadioBtn);
}
public void SelectGlaucomaRadioBtn()
{
    DriverUtils.click(GlaucomaRadioBtn);
}
public void SelectCareHomeRadioBtn()
{
    DriverUtils.click(CareHomeRadioBtn);
}

public  void  SelectLocalCouncil()
{
    DriverUtils.click(localCouncil);
}
public void SelectSavingsRadioBtn()
{
        DriverUtils.click(SavingsRadioBtn);
}

public void getResultStatus()
{
    String getResultPageTitle = BasePage.driverUtils.getPageTitle();
    System.out.println(getResultPageTitle);
}

}
