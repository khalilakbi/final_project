package system;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRecruitmentCandidatePage;
import pages.AddRecruitmentVacanciesPage;
import pages.HomePage;

public class AddRecruitmentVacanciesTest extends Base {
    HomePage homePage;
    AddRecruitmentVacanciesPage addRecruitmentVacanciesPage;
    String vacancies= "(7) Records Found";
    @Test
    public void ValidAddVacanciesTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        AddRecruitmentVacanciesPage addRecruitmentVacanciesPage = new AddRecruitmentVacanciesPage();
        logger.info("Click On Recruitment");
        addRecruitmentVacanciesPage.ClickOnRecruitment();
        logger.info("Click On Vacancies");
        addRecruitmentVacanciesPage.ClickOnVacanciesElement();
        logger.info("Click On Add Button");
        addRecruitmentVacanciesPage.ClickOnAddButton();
        logger.info("enter Field Name");
        String vacancyName = "Fozzi";
        addRecruitmentVacanciesPage.enterVacancyName("Fozzi");
        logger.info("enter Description");
        String Description = "doing all financial transactions";
        addRecruitmentVacanciesPage.enterDescription("doing all financial transactions");
        logger.info("Select Job Title");
        addRecruitmentVacanciesPage.ClickOnJobTitle();
        logger.info("Select Account Assistant");
        addRecruitmentVacanciesPage.ClickOnAccountAssistant();
        logger.info("Type A Hiring Manager");
        String name = ("Rahul Das");
        addRecruitmentVacanciesPage.enterHiringManager("Rahul Das");
        logger.info("Enter a Number Of Position");
        int n= 12;
        addRecruitmentVacanciesPage.enterNumberOfPosition(12);
        logger.info("Click on Active Checkbox");
        addRecruitmentVacanciesPage.ClickOnActiveCheckBox();
        logger.info("Click On Publish in RSS Feed and Web Pag");
        addRecruitmentVacanciesPage.ClickOnPublishRssAndWeb();
        logger.info("Click On Save Button");
        addRecruitmentVacanciesPage.ClickOnSaveButton();
        Assert.assertEquals(vacancies,"(7) Records Found");
    }
    @Test
    public void AddVacanciesWithoutHiringManagerName() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        AddRecruitmentVacanciesPage addRecruitmentVacanciesPage = new AddRecruitmentVacanciesPage();
        logger.info("Click On Recruitment");
        addRecruitmentVacanciesPage.ClickOnRecruitment();
        logger.info("Click On Vacancies");
        addRecruitmentVacanciesPage.ClickOnVacanciesElement();
        logger.info("Click On Add Button");
        addRecruitmentVacanciesPage.ClickOnAddButton();
        logger.info("enter Field Name");
        String vacancyName = "Fozzi";
        addRecruitmentVacanciesPage.enterVacancyName("Fozzi");
        logger.info("enter Description");
        String Description = "doing all financial transactions";
        addRecruitmentVacanciesPage.enterDescription("doing all financial transactions");
        logger.info("Select Job Title");
        addRecruitmentVacanciesPage.ClickOnJobTitle();
        logger.info("Select Account Assistant");
        addRecruitmentVacanciesPage.ClickOnAccountAssistant();
//        logger.info("Type A Hiring Manager");
//        String name = ("Rahul Das");
//        addRecruitmentVacanciesPage.enterHiringManager("Rahul Das");
        logger.info("Enter a Number Of Position");
        int n= 12;
        addRecruitmentVacanciesPage.enterNumberOfPosition(12);
        logger.info("Click on Active Checkbox");
        addRecruitmentVacanciesPage.ClickOnActiveCheckBox();
        logger.info("Click On Publish in RSS Feed and Web Pag");
        addRecruitmentVacanciesPage.ClickOnPublishRssAndWeb();
        logger.info("Click On Save Button");
        addRecruitmentVacanciesPage.ClickOnSaveButton();
        Assert.assertTrue(homePage.isRequiredMSGDisplay());

    }
}
