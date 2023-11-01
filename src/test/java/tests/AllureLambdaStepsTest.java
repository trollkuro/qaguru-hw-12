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

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class AllureLambdaStepsTest extends TestBase {

    private MainPage mainPage = new MainPage();
    private SearchPage searchPage = new SearchPage();
    private RepositoryPage repositoryPage = new RepositoryPage();
    private IssuePage issuePage = new IssuePage();
    private final static String SEARCH_QUERY = "in:name trollkuro/qaguru-hw-12";
    private final static String REPOSITORY_TITLE = "trollkuro/qaguru-hw-12";
    private final static String ISSUE_TITLE = "Simple test issue";

    @Test
    @Feature("Issue")
    @Owner("kegorova")
    @DisplayName("LambdaStep: Check the first issue in the repository")
    void testLambdaSteps(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page", () -> {
            mainPage.openPage();
        });
        step("Search the repository", () -> {
            mainPage.setSearchQuery(SEARCH_QUERY);
        });
        step("Select the repository", ()-> {
            searchPage.selectRepository(REPOSITORY_TITLE);
        });
        step("Click on Issue tab", ()-> {
            repositoryPage.clickIssueTab();
        });
        step("Check the first issue title", ()-> {
            issuePage.checkFirstIssueTitle(ISSUE_TITLE);
        });
    }

}
