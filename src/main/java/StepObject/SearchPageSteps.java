package StepObject;

import PageObject.SearchPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class SearchPageSteps extends SearchPage {

    public SearchPageSteps goonSearch() {
        SearchBtn.click();
        return this;
    }

    public SearchPageSteps showSearchEmpty() {
        emptyError.is(Condition.visible);
        return this;
    }

    public SearchPageSteps fillSearch(String someDataName) {
        SearchPlace.setValue(someDataName);
        SearchPlace.shouldNotBe(Condition.empty);
        return this;
    }

    public SearchPageSteps FillSearchPlace(String compData) {
        SearchPlace.setValue(compData).pressEnter();
        SearchBtn.shouldNotBe(Condition.empty, Duration.ofMillis(2000));
        return this;

    }
}
