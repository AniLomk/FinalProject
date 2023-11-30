package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class BasketPage {
    public SelenideElement

    saleBtn = $(byText("ნახე ფასდაკლებები")),

    techniqueBtn = $(byText("შეარჩიე მხოლოდ ჯანსაღი")),
    wineBtn = $(byText("ღვინო მცირე მარნებიდან")),

    firstWine = $(byXpath("//*[@id=\"__next\"]/section/div/div[4]/div[4]/div[1]/div[1]/span/a")),
    CardAddBtn = $("#cart-button-y"),
    cartBtn = $ ("#cart-button"),
    purchaseBtn = $(By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[5]/div[3]/div/a[2]")),
    deleteBtn = $(byClassName("delete")),
    emptyCart = $(byText("შენი კალათა ცარიელია"));


}
