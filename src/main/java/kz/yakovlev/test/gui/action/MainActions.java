package kz.yakovlev.test.gui.action;

import kz.yakovlev.test.gui.runner.GlobalProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

public class MainActions {

    public static void connectToApplication() {
        ChromeDriverService driverService = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("src/main/resources/chromedriver"))
                .build();

        WebDriver driver = new ChromeDriver(driverService);
        driver.get("https://testperflab.atlassian.net");
        GlobalProperties.setDriver(driver);
    }

    public static void disconnectFromApplication() {
        GlobalProperties.getDriver().close();
    }
}
