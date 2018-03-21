package kz.yakovlev.test.gui.action;

import kz.yakovlev.test.gui.helpers.TimingUtils;
import kz.yakovlev.test.gui.page.PageLogin;

public class ActionLogin {

    public static void logIn(String userName, String password){
        PageLogin.txt_userName().clear();
        PageLogin.txt_userName().sendKeys(userName);
        PageLogin.btn_ContinueOrLogIn().submit();
        TimingUtils.waitSeconds(3);

        PageLogin.txt_password().clear();
        PageLogin.txt_password().sendKeys(password);
        PageLogin.btn_ContinueOrLogIn().submit();
    }
}
