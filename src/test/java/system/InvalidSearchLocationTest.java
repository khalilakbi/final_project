package system;

import base.Base;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LocationOfOrganizationPage;
import pages.TimeSheetPage;

public class InvalidSearchLocationTest extends Base {
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
        locationOfOrganizationPage.ClickOnAdmin();
        logger.info("click Oraganizations element");
        locationOfOrganizationPage.ClickOrganizations();
        logger.info("select Locations");
        locationOfOrganizationPage.SelectLocations();
        logger.info("click search button");
        locationOfOrganizationPage.ClickSearch();
    }
}
