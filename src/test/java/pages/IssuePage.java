package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IssuePage {
    private SelenideElement issueOne = $("#issue_1");

    public void checkFirstIssueTitle(String title){
        issueOne.shouldHave(text(title));
    }

}
