package kz.yakovlev.test.gui.test;


import cucumber.api.java.ru.*;
import kz.yakovlev.test.gui.action.ActionCreateTask;
import kz.yakovlev.test.gui.action.ActionSerchProject;
import kz.yakovlev.test.gui.helpers.TimingUtils;
import kz.yakovlev.test.gui.page.PageMain;
import kz.yakovlev.test.gui.page.PageMyOpenProblem;
import kz.yakovlev.test.gui.page.PageProjects;
import org.junit.Assert;

import java.util.Map;


public class TestTaskLifecycle {
    @Дано("^в системе проект TestPerformanceLab с ключем TPL$")
    public void вСистемеПроектTestPerformanceLabСКлючемTPLИЗарегистрированнымПользователемТестТестов(Map<String, String> intro) throws Throwable {
        String projectName = intro.get("Имя проекта");
        String key = intro.get("Ключ");

        Assert.assertTrue(ActionSerchProject.serchProject(projectName));
        Assert.assertEquals(key, PageProjects.keyProject());
    }

    @Когда("^создаем задачу на данного пользователя$")
    public void создаемЗадачуНаДанногоПользователя(Map<String, String> testFields) throws Throwable {
        ActionCreateTask.createTask(testFields);
        TimingUtils.waitSeconds(3);
    }

    @Тогда("^в списке моих задач появилась новая задача$")
    public void вСпискеМоихЗадачПоявиласьНоваяЗадача(Map<String, String> result) throws Throwable {
        String teme = result.get("Тема");
        String type = result.get("Тип:");
        String statusMake = result.get("Статус сделать:");
        String statusInWork = result.get("Статус в работе:");
        String statusReady = result.get("Статус готово:");
        String description = result.get("Описание");
        String assigne = result.get("Исполнитель");

        PageMain.NavigationApp.btn_tasks().click();
        TimingUtils.waitSeconds(3);

        PageMain.Tasks.btn_MyOpenTasks().click();
        TimingUtils.waitSeconds(2);

        PageMyOpenProblem.btnTask(teme).click();
        TimingUtils.waitSeconds(1);
        Assert.assertEquals(teme, PageMyOpenProblem.txtSummary());
        Assert.assertEquals(type, PageMyOpenProblem.txtType());
        Assert.assertEquals(statusMake, PageMyOpenProblem.txtStatus());
        Assert.assertEquals(description, PageMyOpenProblem.txtDescription());
        Assert.assertEquals(assigne, PageMyOpenProblem.txtAssigne());

        PageMyOpenProblem.btnStatus(statusInWork).click();
        TimingUtils.waitSeconds(5);
        Assert.assertEquals(statusInWork.toUpperCase(), PageMyOpenProblem.txtStatus());

        PageMyOpenProblem.btnStatus(statusReady).click();
        TimingUtils.waitSeconds(5);
        Assert.assertEquals(statusReady.toUpperCase(), PageMyOpenProblem.txtStatus());
    }
}
