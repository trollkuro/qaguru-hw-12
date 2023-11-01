package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchPage {

    private SelenideElement resultItemTitle = $("[data-testid=results-list]").$(".search-title");

    public RepositoryPage selectRepository(String title){
        resultItemTitle.shouldHave(text(title)).click();
        return page(RepositoryPage.class);
    }
}
