package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import websteps.GithubIssueCheckSteps;

public class AllureStepsAnnotationTest extends TestBase {

    GithubIssueCheckSteps steps = new GithubIssueCheckSteps();
    private final static String searchQuery = "in:name trollkuro/qaguru-hw-12";
    private final static String repositoryTitle = "trollkuro/qaguru-hw-12";
    private final static String issueTitle = "Simple test issue";

    @Test
    @Feature("Issue")
    @Owner("kegorova")
    @DisplayName("StepsAnnotation: Check the first issue in the repository")
    void testWithStepsAnnotation(){
        steps.openPage();
        steps.searchRepository(searchQuery);
        steps.selectRepository(repositoryTitle);
        steps.clickIssueTab();
        steps.checkFirstIssueTitle(issueTitle);
    }
}
