package kz.yakovlev.test.gui.page;

import kz.yakovlev.test.gui.runner.GlobalProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class PageMyOpenProblem {

    private static WebDriver driver = GlobalProperties.getDriver();

    public static String txtSummary() {
        return driver.findElement(By.id("summary-val")).getText();
    }

    public static String txtType() {
        return driver.findElement(By.id("type-val")).getText();
    }

    public static String txtStatus() {
        return driver.findElement(By.id("status-val")).getText();
    }

    public static String txtDescription() {
        return driver.findElement(By.id("description-val")).getText();
    }

    public static String txtAssigne() {
        return driver.findElement(By.id("issue_summary_assignee_admin")).getText();
    }

    private static WebElement listTask() {
        return driver.findElement(By.className("list-content"));
    }

    public static WebElement btnTask(String summary) {
        WebElement result = null;
        List<WebElement> elements = listTask().findElements(By.className("issue-link-summary"));

        for (WebElement e : elements) {
            if (summary.equals(e.getText())) {
                result = e;
                return result;
            }
        }
        return result;

    }

    public static WebElement btnStatus(String status) {
        WebElement result = null;
        List<WebElement> elements = driver.findElement(By.id("opsbar-opsbar-transitions")).findElements(By.className("trigger-label"));
        for (WebElement e : elements) {
            if (status.equals(e.getText())) {
                result = e;
                return result;
            }
        }
        return result;
    }

}
