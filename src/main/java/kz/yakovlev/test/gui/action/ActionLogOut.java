package kz.yakovlev.test.gui.action;

import kz.yakovlev.test.gui.helpers.TimingUtils;
import kz.yakovlev.test.gui.page.PageMain;

public class ActionLogOut {

    public static void logOut() {
        PageMain.btn_menuProfile().click();
        TimingUtils.waitSeconds(3);
        PageMain.MenuProfile.btn_LogOut().click();
    }
}
