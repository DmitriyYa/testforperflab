package kz.yakovlev.test.gui.action;



import kz.yakovlev.test.gui.helpers.TimingUtils;
import kz.yakovlev.test.gui.page.PageCreateTask;
import kz.yakovlev.test.gui.page.PageMain;

import java.util.Map;

public class ActionCreateTask {

    public static void createTask(Map <String, String> map) {
        PageMain.NavigationApp.btn_CreateTask().click();
        TimingUtils.waitSeconds(5);

        PageCreateTask.btn_txtTeme().click();
        PageCreateTask.btn_txtTeme().sendKeys(map.get("Тема"));

        TimingUtils.waitSeconds(1);
        PageCreateTask.txtDescription().sendKeys(map.get("Описание"));

        PageCreateTask.btnAssigne().click();
        TimingUtils.waitSeconds(5);
        PageCreateTask.btnUser().click();
        TimingUtils.waitSeconds(2);

        PageCreateTask.btnCreate().click();
    }
}
