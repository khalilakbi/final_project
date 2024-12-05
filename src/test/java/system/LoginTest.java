package system;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends Base {
    HomePage homePage;
    String validUsername = "Admin";
    String validPassword = "admin123";
    String accountPageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

    @Test
    public void testValidLogin() {
        logger.info("start test case valid login");
        logger.info("open orange hrm application");
        homePage = new HomePage();
        logger.info("enter a valid username");
        homePage.enterUserName(validUsername);
        logger.info("enter a valid password");
        homePage.enterPassword(validPassword);
        logger.info("click on login button");
        homePage.clickOnLogin();
        logger.info("check the account page url");
        Assert.assertEquals(driver.getCurrentUrl(), accountPageURL);
        logger.info("end test case valid login");
    }
}
