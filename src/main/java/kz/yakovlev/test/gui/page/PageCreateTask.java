package kz.yakovlev.test.gui.page;

import kz.yakovlev.test.runner.GlobalProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageCreateTask {

    private static WebDriver driver= GlobalProperties.getDriver();

    public static WebElement btn_txtProject(){
        return driver.findElement(By.id("project-field"));
    }

    public static WebElement btn_txtTipeTask(){
        return driver.findElement(By.id("issuetype-field"));
    }

    public static WebElement btn_txtTeme(){
        return driver.findElement(By.id("summary"));
    }

    public static WebElement txtDescription(){
        return driver.findElement(By.id("description"));
    }

    public static WebElement btnAssigne(){
        return driver.findElement(By.id("assignee-field"));
    }

    public static WebElement btnUser(){
        return driver.findElement(By.linkText("Тест Тестов - test.my.testov@gmail.com (admin)"));
    }

    public static WebElement btnCreate(){
        return driver.findElement(By.id("create-issue-submit"));
    }
}
