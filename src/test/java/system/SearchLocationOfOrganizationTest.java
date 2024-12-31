package system;

import base.Base;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LocationOfOrganizationPage;
import pages.TimeSheetPage;

public class SearchLocationOfOrganizationTest extends Base {
    HomePage homePage;
    String validUsername = "Admin";
    String validPassword = "admin123";
    @Test
    public void ValidSearchLocation() throws InterruptedException {
        HomePage homePage = new HomePage();
        LocationOfOrganizationPage locationOfOrganizationPage = new LocationOfOrganizationPage();
        logger.info("enter a valid username");
        homePage.enterUserName(validUsername);
        logger.info("enter a valid password");
        homePage.enterPassword(validPassword);
        logger.info("click on login button");
        homePage.clickOnLogin();
        logger.info("click on Admin");
        locationOfOrganizationPage.ClickOnAdmin();
        logger.info("click Oraganizations element");
        Thread.sleep(2000);
        locationOfOrganizationPage.ClickOrganizations();
        logger.info("select Locations");
        Thread.sleep(2000);
        locationOfOrganizationPage.SelectLocations();
        logger.info("Type a Name");
        String name = ("New York Sales Office");
        locationOfOrganizationPage.InputOraganizationName("New York Sales Office");
        logger.info("Type Name Of The City");
        String city = ("New York");
        locationOfOrganizationPage.InputCity("New York");
        logger.info("select the country");
        locationOfOrganizationPage.SelectCountry();
        logger.info("click United States");
        locationOfOrganizationPage.ClickUnitedStates();
        logger.info("click search button");
        locationOfOrganizationPage.ClickSearch();


    }
}
