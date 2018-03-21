package kz.yakovlev.test.gui.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import kz.yakovlev.test.gui.action.ActionLogOut;
import kz.yakovlev.test.gui.action.ActionLogin;
import kz.yakovlev.test.gui.action.MainActions;
import kz.yakovlev.test.gui.helpers.TimingUtils;



public class Hooks {

    @Before (order = 10)
    public void startBrouser(){
        MainActions.connectToApplication();
    }

    @Before (order = 20)
    public void LogInApplication(){
        ActionLogin.logIn("test.my.testov@gmail.com","!Q2w3e4r" );
        TimingUtils.waitSeconds(50);
    }

    @After (order = 20)
    public void LogOutApplication(){
        ActionLogOut.logOut();
    }

    @After (order = 10)
    public void closeBrouser(){
        MainActions.disconnectFromApplication();
    }
}
