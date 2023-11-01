package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement searchContainer = $(".search-input-container"),
                            searchQuery = $("#query-builder-test");


    public MainPage openPage(){
        open("https://github.com/");
        return this;
    }
    public SearchPage setSearchQuery(String query){
        searchContainer.click();
        searchQuery.setValue(query).pressEnter();
        return page(SearchPage.class);
    }
}
