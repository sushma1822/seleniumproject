package org.example;

import org.openqa.selenium.By;

public class CellPhone extends Util{
    // stored variables
    private By _FirstAddToCartButton = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/input[1]");
    private By _HTConeMiniBlueBlueButton = By.linkText("HTC One Mini Blue");
    private By _SecondAddToCartButton = By.xpath("//input[@id=\"add-to-cart-button-19\"]");
    private By _ShoppingCartButton = By.linkText("Shopping cart");
    // create a method for AddTOCartButton to click
    public void clickOnAddToCartButton(){
        clickOnElement(_FirstAddToCartButton,20);
        clickOnElement(_HTConeMiniBlueBlueButton,20);
        clickOnElement(_SecondAddToCartButton,20);
        clickOnElement(_ShoppingCartButton,20);
    }
}
