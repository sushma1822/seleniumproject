package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util {
    // stored variable
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");
    private By _ComputerButton = By.linkText("Computers");
    private By _ElectronicButton = By.linkText("Electronics");
   // create method to click on register button
    public void clickOnRegisterButton(){

        clickOnElement(_registerButton,20);
    }
    //create method  to click on computer button
    public void clickOnComputerButton(){

        clickOnElement(_ComputerButton,20);
    }
    //create method for electronic button to click
    public void clickOnElectronicButton(){
        clickOnElement(_ElectronicButton,20);
    }

}
