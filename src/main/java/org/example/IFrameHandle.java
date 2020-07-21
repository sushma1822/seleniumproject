package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class IFrameHandle extends Util {
    //store a variable
    private By _TypeTopicName = By.xpath("//input[@type=\"text\"]");
    private By _CheckBox = By.xpath("//input[@type=\"checkbox\"]");
    String Expected = "Not a Friendly Topic";
    private By _AnimalName = By.xpath("//select[@id=\"animals\"]");
  //method for the swich to iFrame
    public void SwichIframe(){
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

        String URL = driver.getCurrentUrl();
        String Expected = "https://chercher.tech/practice/frames-example-selenium-webdriver";
        Assert.assertEquals(URL, Expected);

    }

   // method for get frame name
    public void animalName(){
        WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame(_iframe1);
        typeText(_TypeTopicName, "priyal name",20);

        WebElement _iframe3 = driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
        driver.switchTo().frame(_iframe3);
        clickOnElement(_CheckBox, 20);
        driver.switchTo().defaultContent();

    }

     // method  for  get animal  name
    public void animal(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-autpmation"});

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.switchTo().frame("frame2");
        selectFromDropDownByVisibleText(_AnimalName,"Avatar");}



}







