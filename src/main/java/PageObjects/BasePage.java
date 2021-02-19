package PageObjects;

import Utils.DriverFactory;
import Utils.DriverUtils;

public class BasePage {

    public static DriverUtils driverUtils;
    public static HomePage homePage;


    public static void initPages()
    {
        driverUtils = new DriverUtils();

        homePage = new HomePage(DriverFactory.driver);


    }
}
