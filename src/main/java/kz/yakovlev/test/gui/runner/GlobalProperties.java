package kz.yakovlev.test.gui.runner;

import org.openqa.selenium.WebDriver;

public class GlobalProperties {
    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        GlobalProperties.driver = driver;
    }
}
