package websteps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubIssueCheckSteps {

    @Step("Open main page")
    public void openPage(){
        open("https://github.com/");
    }

    @Step("Search the repository")
    public void searchRepository(String query){
        $(".search-input-container").click();
        $("#query-builder-test").setValue(query).pressEnter();
    }

    @Step("Select the repository")
    public void selectRepository(String repository){
        $("[data-testid=results-list]").$(".search-title").shouldHave(text(repository)).click();
    }

    @Step("Click on Issue tab")
    public void clickIssueTab(){
        $("#issues-tab").click();
    }

    @Step("Check the first issue title")
    public void checkFirstIssueTitle(String title){
        $("#issue_1").shouldHave(text(title));
    }
}
