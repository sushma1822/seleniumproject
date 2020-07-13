package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
    public void setBrowser() {
        //setting up chrome driver path
        System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver.exe");
        //creating object to open chrome driver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);// allows to avoid chrome pop ups while running programme
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.nopcommerce.com/");


    }
    // create method close browser
    public static void closeBrowser(){
        driver.close();}
}