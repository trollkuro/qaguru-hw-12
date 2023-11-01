package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.IssuePage;
import pages.MainPage;
import pages.RepositoryPage;
import pages.SearchPage;


public class AllureSelenideListenerTest extends TestBase {

    private MainPage mainPage = new MainPage();
    private SearchPage searchPage = new SearchPage();
    private RepositoryPage repositoryPage = new RepositoryPage();
    private IssuePage issuePage = new IssuePage();
    private final static String searchQuery = "in:name trollkuro/qaguru-hw-12";
    private final static String repositoryTitle = "trollkuro/qaguru-hw-12";
    private final static String issueTitle = "Simple test issue";


    @Test
    @Feature("Issue")
    @Owner("kegorova")
    @DisplayName("SelenideListener: Check the first issue in the repository")
    void testWithSelenideListener(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage.openPage();
        mainPage.setSearchQuery(searchQuery);
        searchPage.selectRepository(repositoryTitle);
        repositoryPage.clickIssueTab();
        issuePage.checkFirstIssueTitle(issueTitle);
    }
}
