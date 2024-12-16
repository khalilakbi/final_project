package system;

import base.Base;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TimeSheetPage;

public class TimeSheetTest extends Base {
    HomePage homePage;
    TimeSheetPage timeSheetPage;
    String validUsername = "Admin";
    String validPassword = "admin123";
    @Test
    public void SubmitMyTimesheet() throws InterruptedException {
        HomePage homePage = new HomePage();
        TimeSheetPage timeSheetPage = new TimeSheetPage();
        logger.info("enter a valid username");
        homePage.enterUserName(validUsername);
        logger.info("enter a valid password");
        homePage.enterPassword(validPassword);
        logger.info("click on login button");
        homePage.clickOnLogin();
        logger.info("click on Time");
        timeSheetPage.ClickOnTime();
        logger.info("click drop down");
        timeSheetPage.ClickOnTimeSheet();







    }
}
