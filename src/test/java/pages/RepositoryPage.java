package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RepositoryPage {
    private SelenideElement issueTab = $("#issues-tab");

    public IssuePage clickIssueTab(){
        issueTab.click();
        return page(IssuePage.class);
    }
}
