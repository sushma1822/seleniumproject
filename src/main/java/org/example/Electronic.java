package org.example;

import org.openqa.selenium.By;

public class Electronic  extends Util{
    //stored variable
    private By _CellPhoneButton = By.linkText("Cell phones");
//create method for cellPhone Button to click
    public void clickOnCellPhoneButton(){
        clickOnElement(_CellPhoneButton,20);
    }
}
