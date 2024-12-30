package system;

import base.Base;
import org.testng.annotations.Test;
import pages.AddRecruitmentCandidatePage;
import pages.HomePage;

public class AddRecruitmentCandidateTest extends Base {
    HomePage homePage;
    AddRecruitmentCandidatePage addRecruitmentCandidatePage;
   // String validUsername = "Admin";
   // String validPassword = "admin123";
    @Test
    public void ValidAddCandidateTest() throws InterruptedException {
        HomePage homePage =new HomePage();
        homePage.doLogin("Admin", "admin123");
        AddRecruitmentCandidatePage addRecruitmentCandidatePage = new AddRecruitmentCandidatePage();
        Thread.sleep(3000);
        logger.info("Click On Recruitment Element");
        addRecruitmentCandidatePage.ClickOnRecruitment();
        logger.info("Click On Candidates Element");
        addRecruitmentCandidatePage.ClickOnCandidates();
        addRecruitmentCandidatePage.ClickOnSelectJobTitle();



    }
}
