package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import java.time.Duration;


public class BasePage {

    public final SelenideElement authWidget = $x("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     * The method for navigating to a specific URL.
     */
    public void goToUrl(String url){
        open(url);
    }


    /**
     * Waits for the visibility of an element in the DOM model.
     */
    protected void clearAndType(SelenideElement element, String value) {
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
            element.sendKeys(value);

            }

    /**
     * Check is auth frame is visible
     */
    public void isAuthWidgetPresent(){
        authWidget.shouldBe(Condition.visible);
    }

    public void checkMessage(String message){
        $(byText(message)).shouldBe(Condition.visible);
    }
}
