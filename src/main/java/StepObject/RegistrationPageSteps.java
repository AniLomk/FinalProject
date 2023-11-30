package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;


public class RegistrationPageSteps extends RegistrationPage {
          public RegistrationPageSteps openAutorization() {
              goBtn.click();
              return this;

          }

          public RegistrationPageSteps openRegistration() {
              regPage.click();
              Duration.ofMillis(3000);
              return this;

          }
    public RegistrationPageSteps userIsOnRegistrationPage() {
        regPage.click();
        return this;

    }

          public RegistrationPageSteps fillEmail(String email) {
              emailInput.setValue(email);
              emailInput.shouldNotBe(Condition.empty, Duration.ofMillis(3000));
              return this;
          }

          public RegistrationPageSteps fillUser(String username) {
              usernameInput.setValue(username);
              usernameInput.shouldNotBe(Condition.empty, Duration.ofMillis(3000));
              return this;
          }

          public RegistrationPageSteps fillPhone(String phone) {
              phoneInput.setValue(phone);
              phoneInput.shouldNotBe(Condition.empty, Duration.ofMillis(3000));
              return this;
          }

          public RegistrationPageSteps fillPassword(String password) {
              passwordInput.setValue(password);
              passwordInput.shouldNotBe(Condition.empty, Duration.ofMillis(3000));
              return this;
          }

          public RegistrationPageSteps fillConfPassword(String ConfirmPassword) {
              confirmPasswordInput.setValue(ConfirmPassword);
              confirmPasswordInput.shouldNotBe(Condition.empty, Duration.ofMillis(3000));
              return this;
          }

          public RegistrationPageSteps clickCreateBtn() {
              CreateAccBtn.click();
              return this;
          }
    public RegistrationPageSteps FillRegisteredEmail(String registeredEmail) {
        emailInput.setValue(registeredEmail);
        return this;
    }
      }