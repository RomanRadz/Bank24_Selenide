package tests.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import common.CommonActions;
import pages.base.BasePage;
import pages.loans.CarLoansPage;
import pages.telecommunications.MobilePhoneReplenishmentPage;

import java.io.File;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {


    protected BasePage basePage = new BasePage();
    protected CarLoansPage carLoansPage = new CarLoansPage();
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage();
    protected CommonActions commonActions = new CommonActions();

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);


    static {
        LOGGER.info(() ->"START TIME" + LocalTime.now());
        LOGGER.info(() ->"Start clear reports dir: build/reports ...");
        File allureResults = new File("allure-results");
        if(allureResults.isDirectory()){
            for(File item : Objects.requireNonNull(allureResults.listFiles()))
                item.delete();
            }
        if(CLEAR_REPORTS_DIR){
            File allureScreenshots = new File("build/reports/test/");
            for(File item : Objects.requireNonNull(allureScreenshots.listFiles()))
                item.delete();
        }
        }


}
