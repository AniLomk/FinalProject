import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationPageData.*;

public class RegistrationPageTest extends ChromeRunner {
    RegistrationPageSteps RegistrationPageSteps = new RegistrationPageSteps();

    @Test
    @Description ("რეგისტრაციის ღილაკის შემოწმება")
    public void RegistrationCheck() {
  RegistrationPageSteps
          .openAutorization()
          .openRegistration()
          .userIsOnRegistrationPage()
          .fillEmail(email)
          .fillUser(username)
          .fillPhone(phone)
          .fillPassword(password)
          .fillConfPassword(ConfirmPassword)
          .clickCreateBtn();


  Assert.assertTrue(RegistrationPageSteps.CreateAccBtn.is(Condition.enabled));


    }
    @Test
    @Description ("რეგისტრირებული მეილით რეგისტრაციის მცდელობის დროს სწორი შეტყობინების გამოტანა")
    public void NegativeRegistrationCheck() {
        RegistrationPageSteps
                .openAutorization()
                .openRegistration()
                .userIsOnRegistrationPage()
                .fillEmail(registeredEmail);



        Assert.assertFalse(RegistrationPageSteps.ErrorNotification.is(Condition.visible));


    }
}