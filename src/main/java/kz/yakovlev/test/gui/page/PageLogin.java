package kz.yakovlev.test.gui.page;

import kz.yakovlev.test.gui.runner.GlobalProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLogin {
    private static WebDriver driver = GlobalProperties.getDriver();

    public static WebElement txt_userName() {
        return driver.findElement(By.id("username"));
    }

    public static WebElement txt_password() {
        return driver.findElement(By.id("password"));
    }

    public static WebElement btn_ContinueOrLogIn() {
        return driver.findElement(By.id("login-submit"));
    }
}
