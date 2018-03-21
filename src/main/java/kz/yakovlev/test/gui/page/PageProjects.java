package kz.yakovlev.test.gui.page;

import kz.yakovlev.test.runner.GlobalProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageProjects {

    private static WebDriver driver= GlobalProperties.getDriver();

    public static WebElement btnNameProject(String projectName) {

        return driver.findElement(By.linkText(projectName));
    }

    public static String keyProject(){
        return driver.findElement(By.cssSelector("[title=\"TPL\"]")).getText();
    }

}
