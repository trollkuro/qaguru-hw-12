package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import websteps.GithubIssueCheckSteps;

public class AllureStepsAnnotationTest extends TestBase {

    GithubIssueCheckSteps steps = new GithubIssueCheckSteps();
    private final static String SEARCH_QUERY = "in:name trollkuro/qaguru-hw-12";
    private final static String REPOSITORY_TITLE = "trollkuro/qaguru-hw-12";
    private final static String ISSUE_TITLE = "Simple test issue";

    @Test
    @Feature("Issue")
    @Owner("kegorova")
    @DisplayName("StepsAnnotation: Check the first issue in the repository")
    void testWithStepsAnnotation(){
        steps.openPage();
        steps.searchRepository(SEARCH_QUERY);
        steps.selectRepository(REPOSITORY_TITLE);
        steps.clickIssueTab();
        steps.checkFirstIssueTitle(ISSUE_TITLE);
    }
}
