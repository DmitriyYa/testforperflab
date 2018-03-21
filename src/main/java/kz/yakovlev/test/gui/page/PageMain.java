package kz.yakovlev.test.gui.page;

import kz.yakovlev.test.runner.GlobalProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageMain {

    private static WebDriver driver = GlobalProperties.getDriver();


    public static WebElement btn_menuProfile() {
        return driver.findElement(By.id("menu-profile"));
    }

    public static class MenuProfile {

        public static WebElement btn_Profile() {
            return driver.findElement(By.id("view_profile"));
        }

        public static WebElement btn_GiveFeedBack(){
            return driver.findElement(By.id("give_feedback"));
        }

        public static WebElement btn_LogOut(){
            return driver.findElement(By.id("log_out"));
        }
    }

    public static class NavigationApp{

        public static  WebElement btn_desktop(){
            return driver.findElement(By.id("jira.top.navigation.bar:home-link-common-header"));
        }

        public static  WebElement btn_projects(){
            return driver.findElement(By.id("com.atlassian.jira.jira-header-plugin:global-product-projects"));
        }

        public static  WebElement btn_tasks(){
            return driver.findElement(By.cssSelector("[role] div:nth-of-type(3) .icVecj"));
        }

        public static  WebElement btn_settings(){
            return driver.findElement(By.cssSelector(".cyyJOE .joEstr:nth-of-type(1) div:nth-of-type(4) .icVecj"));
        }

        public static WebElement btn_CreateTask(){
            return driver.findElement(By.cssSelector(".kfFTAe div:nth-of-type(2) [width]"));
        }
    }

    public static class Tasks{

        public static WebElement btn_MyOpenTasks(){
            return driver.findElement(By.id("filter_lnk_my"));
        }
    }
}
