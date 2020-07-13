package org.example;

import org.openqa.selenium.By;

public class Computer extends Util {
    //stored variable
    private By _DesktopButton = By.linkText("Desktops");
    //create method for DesktopButton to click
    public void ClickOnDesktopButton(){

        clickOnElement(_DesktopButton,20);
    }

}
