package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement

    SearchBtn = $(By.className("styled__SearchForm-sc-1gjbxx7-9")),
    SearchPlace = $(By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[2]/form/input")),
    cantFindInfo = $(byText("დარწმუნდი, რომ ბრენდისა და მოდელის სახელს სწორად წერ.")),
    emptyError = $(byText("ძებნის ისტორია ცარიელია")),
    leptopBagBtn = $(byText("ლეპტოპის ჩანთები"));

}
