package system;

import base.Base;
import org.testng.annotations.Test;
import pages.AddingGradePage;
import pages.HomePage;
import pages.TimeSheetPage;

public class InvalidAddingGradeTest extends Base {
    HomePage homePage;
    TimeSheetPage timeSheetPage;
    String validUsername = "Admin";
    String validPassword = "admin123";
    @Test
    public void InvalidAddPayGrade() throws InterruptedException {
        HomePage homePage = new HomePage();
        AddingGradePage addingGradePage = new AddingGradePage();
        logger.info("enter a valid username");
        homePage.enterUserName(validUsername);
        logger.info("enter a valid password");
        homePage.enterPassword(validPassword);
        logger.info("click on login button");
        homePage.clickOnLogin();
        logger.info("click on Admin");
        addingGradePage.ClickOnAdmin();
        logger.info("click drop down");
        addingGradePage.ClickDropDown();
        logger.info("select Pay Grades");
        Thread.sleep(2000);
        addingGradePage.SelectPayGrades();
        logger.info("click add");
        addingGradePage.ClickAddButton();
        logger.info("click save");
        Thread.sleep(3000);
        addingGradePage.ClickSaveButton();

    }
}
