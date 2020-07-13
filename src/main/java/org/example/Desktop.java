package org.example;

import org.openqa.selenium.By;

public class Desktop extends Util {
    //stored variable
    private By _ClickOnBuildYourOwnComputer = By.linkText("Build your own computer");
    //create method for build your on computer to click
    public void  ClickOnBuildYourOwnComputer(){
        clickOnElement(_ClickOnBuildYourOwnComputer,20);
    }
}
