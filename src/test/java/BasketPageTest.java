import PageObject.BasketPage;
import StepObject.BasketPageSteps;
import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketPageTest extends ChromeRunner{

   BasketPageSteps BasketPageSteps = new BasketPageSteps();

    @Test
    @Description("ყიდვის ღილაკის გამოჩენა")
    public void BasketPageCheck() {

        BasketPageSteps
                .goToSale()
                .goToTechnique()
                .goToWine()
                .chooseWine()
                .addToCard()
                .openCartPage()
                .userIsOnCartPage();


        Assert.assertTrue(BasketPageSteps.purchaseBtn.is(Condition.enabled));

    }
    @Test
    @Description("კალათაში ყიდვის ღილაკის გაქრობა, კალათის დაცარიელების შემდეგ")
    public void negativeBasketPageCheck() {

        BasketPageSteps
                .goToSale()
                .goToTechnique()
                .goToWine()
                .chooseWine()
                .addToCard()
                .openCartPage()
                .userIsOnCartPage()
                .clickOnDelete();


        Assert.assertFalse(BasketPageSteps.emptyCart.is(Condition.visible));

    }

}


