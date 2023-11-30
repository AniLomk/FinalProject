package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationPage {
    public SelenideElement

            goBtn = $(byXpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]")),
            regPage = $(byText("რეგისტრაცია")),
            emailInput = $("#email"),
           usernameInput = $("#username"),
            phoneInput = $("#phone"),
            passwordInput= $("#signup-password"),
            confirmPasswordInput = $("#signup-password-repeat"),
            CreateAccBtn =$(byText("შექმენი ანგარიში")),
            ErrorNotification = $(byText("ამ ელ.ფოსტით ანგარიში უკვე არსებობს"));


}
