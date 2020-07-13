package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util {
    // object for browser manager
    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod
    // method for openBrowser
    public void openBrowser(){
        browserManager.setBrowser();

    }

    @AfterMethod
    // method for close browser
    public void closeBrowser(){
        browserManager.closeBrowser();
    }
}
