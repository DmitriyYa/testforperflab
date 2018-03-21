package kz.yakovlev.test.gui.action;

import kz.yakovlev.test.gui.page.PageMain;
import kz.yakovlev.test.gui.page.PageProjects;

public class ActionSerchProject {

    public static boolean serchProject(String projectName){
        PageMain.NavigationApp.btn_projects().click();
        return PageProjects.btnNameProject(projectName).isDisplayed();
    }

}
