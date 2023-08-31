package common;

import static common.Config.BROWSER_AND_PLATFORM;
import static common.Config.CLEAR_COOKIES;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

import java.util.concurrent.TimeUnit;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import common.Listener;

public class CommonActions {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonActions.class);

        public static void clearBrowserCookies() {
        if(CLEAR_COOKIES){
            try {
                Selenide.clearBrowserCookies();
                Selenide.clearBrowserLocalStorage();
                Selenide.executeJavaScript("window.localStorage.clear();");
            } catch (Exception e) {
                LOGGER.error(() -> "Fail to clearBrowserCookies() - {}" + e.getMessage());
            }

        }
    }
}
