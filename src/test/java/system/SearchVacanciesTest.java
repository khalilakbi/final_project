package system;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRecruitmentVacanciesPage;
import pages.HomePage;

public class SearchVacanciesTest extends Base {
    HomePage homePage;
    AddRecruitmentVacanciesPage addRecruitmentVacanciesPage;

     String Vacancies= "No Records Found";
    @Test
    public void ValidSearchVacanciesTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        AddRecruitmentVacanciesPage addRecruitmentVacanciesPage = new AddRecruitmentVacanciesPage();
        logger.info("Click On Recruitment");
        addRecruitmentVacanciesPage.ClickOnRecruitment();
        logger.info("Click On Vacancies");
        addRecruitmentVacanciesPage.ClickOnVacanciesElement();
        logger.info("Click On Select The Job Title");
        addRecruitmentVacanciesPage.ClickOnSelectJobTitle();
        logger.info(" Select Automaton Tester");
        addRecruitmentVacanciesPage.SelectAutomatonTester();
        Thread.sleep(3000);
        logger.info("Click On Search Button");
        addRecruitmentVacanciesPage.ClickOnSearchButton();
        Thread.sleep(3000);
       Assert.assertEquals(Vacancies,"No Records Found");


    }
}
