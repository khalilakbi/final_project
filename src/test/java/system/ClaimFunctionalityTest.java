package system;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ClaimFunctionalityPage;
import pages.HomePage;

public class ClaimFunctionalityTest extends Base {
    @Test
    public void verifyClaimFunctionalityWithValidReferenceId() throws InterruptedException {
        ClaimFunctionalityPage claimFunctionality = new ClaimFunctionalityPage();
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        claimFunctionality.clickClaimFunction();
        claimFunctionality.myClaims();
        Thread.sleep(1000);
        claimFunctionality.enterReferenceId("202307180000003");
        claimFunctionality.clickSearchButton();
        claimFunctionality.isOneRecordFoundMessageDisplayed();
    }

    @Test
    public void verifyClaimFunctionalityWithInValidReferenceId() throws InterruptedException {
        ClaimFunctionalityPage claimFunctionality = new ClaimFunctionalityPage();
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        claimFunctionality.clickClaimFunction();
        claimFunctionality.myClaims();
        Thread.sleep(1000);
        claimFunctionality.enterReferenceId("abcd");
        claimFunctionality.clickSearchButton();
        claimFunctionality.isOneRecordFoundMessageDisplayed();
        claimFunctionality.isNoRecordFoundMessageDisplayed();

    }

    @Test
    public void verifyValidationForToDateBeforeFromDate() throws InterruptedException {
        ClaimFunctionalityPage claimFunctionality = new ClaimFunctionalityPage();
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        claimFunctionality.clickClaimFunction();
        claimFunctionality.myClaims();
        Thread.sleep(1000);
        claimFunctionality.enterFormDate("2025-07-01");
        Thread.sleep(1000);
        claimFunctionality.enterToDate("2025-03-01");
        Thread.sleep(1000);
        claimFunctionality.clickSearchButtonDateVerification();
        Assert.assertTrue(claimFunctionality.toDateShouldBeAfterFromDateDisplay());

    }

    @Test
    public void verifySuccessfulSubmissionWithValidDates() throws InterruptedException {
        ClaimFunctionalityPage claimFunctionality = new ClaimFunctionalityPage();
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        claimFunctionality.clickClaimFunction();
        claimFunctionality.myClaims();
        Thread.sleep(1000);
        claimFunctionality.enterFormDate("2023-07-10");
        Thread.sleep(1000);
        claimFunctionality.enterToDate("2025-07-01");
        Thread.sleep(1000);
        claimFunctionality.clickSearchButtonDateVerification();
        Thread.sleep(1000);
        Assert.assertTrue(claimFunctionality.isRecordFoundMessageDisplayed());

    }

}
