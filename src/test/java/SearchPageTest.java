import PageObject.SearchPage;
import StepObject.RegistrationPageSteps;
import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.SearchPageData.compData;
import static DataObject.SearchPageData.someDataName;

public class SearchPageTest extends ChromeRunner {
 SearchPageSteps SearchPageSteps = new SearchPageSteps();
  @Test
    @Description ("არარსებული მონაცემების შეყვანის შედეგად გამოაქვს ერორის შეტყობინება")
    public void NegativeSearchPageCheck () {
       SearchPageSteps
               .goonSearch()
               .showSearchEmpty()
               .fillSearch(someDataName);



      Assert.assertTrue(SearchPageSteps.cantFindInfo.is(Condition.visible));
  }
    @Test
    @Description ("მონაცემების შეყვანის შემდეგ გადავყავართ სწორ ფეიჯზე")
    public void SearchPageCheck () {
        SearchPageSteps
                .goonSearch()
                .showSearchEmpty()
                .fillSearch(compData);


        Assert.assertFalse(SearchPageSteps.leptopBagBtn.is(Condition.visible));
    }
}

