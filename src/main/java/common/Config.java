package common;

import com.codeborne.selenide.Configuration;

import static org.openqa.selenium.remote.CapabilityType.BROWSER_NAME;

public class Config {
	
    /**
     * Specify the browser and platform for test:
     * CHROME_WINDOWS
     * MOZILLA_WINDOWS
     * */
    public static final String BROWSER_AND_PLATFORM = "chrome_windows"; //chrome_windows, mozilla_windows
    /*** Clean browser cookies after each iteration*/
    public static final boolean CLEAR_COOKIES = false;
    /*** To keep the browser open after all scenarios/tes*/
    public static final boolean HOLD_BROWSER_OPEN = false;
    /*** To clear reports dir before each run*/
    public static final boolean CLEAR_REPORTS_DIR = true;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "target/reports/test";
        Configuration.browser = BROWSER_NAME;
    }

}
