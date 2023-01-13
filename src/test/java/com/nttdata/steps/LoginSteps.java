package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;
public class LoginSteps {

    LoginScreen loginScreen;

    @Step("Login")
    public void login(String user, String pass){
        loginScreen.addUsername(user);
        loginScreen.addPassword(pass);
        loginScreen.clickLogin();
    }

}
