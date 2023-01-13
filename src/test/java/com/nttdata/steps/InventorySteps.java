package com.nttdata.steps;

import com.nttdata.screens.InventoryScreen;
import net.thucydides.core.annotations.Step;

public class InventorySteps {

    InventoryScreen inventoryScreen;

    @Step("Test Title Text")
    public void testTitleText(String expectedTitle){
        inventoryScreen.testTitleText(expectedTitle);
    }

    @Step("Test Item List")
    public void testItemList(){
        inventoryScreen.testItems();
    }
}
