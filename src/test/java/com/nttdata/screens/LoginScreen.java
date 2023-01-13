package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement editTextUser;

    public void addUsername(String user){
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        editTextUser.click();
        editTextUser.sendKeys(user);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement editTextPass;

    public void addPassword(String pass){
        //getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        editTextPass.click();
        editTextPass.sendKeys(pass);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    public void clickLogin(){
        //getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        btnLogin.click();
    }

}
