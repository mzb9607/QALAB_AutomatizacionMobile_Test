package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import java.util.concurrent.TimeUnit;

public class InventoryScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement textTitle;

    public void testTitleText(String expectedTitle){
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assertions.assertEquals(textTitle.getText(), expectedTitle);
    }

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])")
    private WebElement[] itemTest;

    public void testItems(){
        Assertions.assertTrue(itemTest.length > 0, "El tamaño de la lista es: " + itemTest.length);
    }

}
