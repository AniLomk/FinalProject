package StepObject;

import PageObject.BasketPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class BasketPageSteps extends BasketPage {
    public BasketPageSteps goToSale() {
        saleBtn.scrollTo();
        return this;
    }

    public BasketPageSteps goToTechnique() {
        techniqueBtn.scrollTo();
        return this;
    }

    public BasketPageSteps goToWine() {
        wineBtn.click();
        Duration.ofMillis(3000);
        return this;
    }

    public BasketPageSteps chooseWine() {
        firstWine.click();
        Duration.ofMillis(3000);
        return this;
    }


    public BasketPageSteps addToCard() {
        CardAddBtn.click();
        Duration.ofMillis(3000);
        return this;
    }

    public BasketPageSteps openCartPage() {
        cartBtn.click();
        Duration.ofMillis(3000);
        return this;
    }

    public BasketPageSteps userIsOnCartPage() {
        cartBtn.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }



    public BasketPageSteps clickOnDelete() {
        deleteBtn.click();
        Duration.ofMillis(3000);
        return this;
    }
}