package common;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static common.CommonActions.clearBrowserCookies;
import static org.junit.jupiter.api.extension.ExtensionContext.Namespace.GLOBAL;

public class Listener implements TestWatcher, BeforeAllCallback, AfterEachCallback {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        extensionContext.getRoot().getStore(GLOBAL).put(true, this);
    }
    @Override
    public void afterEach(ExtensionContext extensionContext)  {
        clearBrowserCookies();
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        LOGGER.info(() -> "Test " + context.getTestMethod().get().getName() + " - FAILED!");
        String screenshotName = context.getTestMethod().get().getName() +
                String.valueOf(System.currentTimeMillis()).substring(9, 13);
        LOGGER.info(() -> "Trying to trace screenshot");
        Selenide.screenshot(screenshotName);
        attachScreenshotsToAllure();
    }



    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] attachScreenshotsToAllure(){
        if(WebDriverRunner.hasWebDriverStarted())
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        else return null;
    }
}
