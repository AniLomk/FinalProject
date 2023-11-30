package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeTest(description = "ბრაუზერის გახსნა")
    public void setUp() {

        open("https://veli.store/");


    }

    @AfterTest (description = "ქეშის გასუფთავება და ბრაუზერის დახურვა")
    public void tearDown() {

        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }
}



