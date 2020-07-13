package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart  extends  Util{
    //stored variable
    private By _AddFirstItem = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    private By _AddSecondItem = By.linkText("HTC One Mini Blue");
    String expectedAddFirstItem = "HTC One M8 Android L 5.0 Lollipop";
    String expectedAddSecondItem = "HTC One Mini Blue";
    // method for verify shoppingCart massage in assert
    public void userVerifyShoppingCartMassage(){
        Assert.assertEquals(getTextFromElement(_AddFirstItem),expectedAddFirstItem);
        Assert.assertEquals(getTextFromElement(_AddSecondItem),expectedAddSecondItem);
    }

}
