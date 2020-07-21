package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Util {
    // stored variable
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");
    private By _ComputerButton = By.linkText("Computers");
    private By _ElectronicButton = By.linkText("Electronics");
    private By _SearchButton = By.xpath("//input[@type=\"submit\"]");
    private By _FacebookButton = By.linkText("Facebook");
    private By _DetailsButton = By.xpath("//div[@class=\"news-items\"]/div[1]/div[3]/a[1]");
    private By _currencyButton = By.xpath("//select[@id=\"customerCurrency\"]");

   // method for click on register button
    public void clickOnRegisterButton() {

        clickOnElement(_registerButton, 20);
    }

    //create method  to click on computer button
    public void clickOnComputerButton() {

        clickOnElement(_ComputerButton, 20);
    }

    //create method for electronic button to click
    public void clickOnElectronicButton() {
        clickOnElement(_ElectronicButton, 20);
    }
  // method for searchButton
    public void clickOnSearchButton() {
        clickOnElement(_SearchButton, 20);

    }
 //method for click on alert
    public void clickAlert() {
        String actualMassage = driver.switchTo().alert().getText();
        String expectedAlertMassage = "Please enter some search keyword";
        Assert.assertEquals(actualMassage, expectedAlertMassage);
        driver.switchTo().alert().accept();
    }
  //method for click on facebook button
    public void clickOnFacebookButton() {
        clickOnElement(_FacebookButton, 20);

    }
    //method for click on detail button
    public void clickOnDetailsButton() {
        clickOnElement(_DetailsButton, 20);
    }
   //method for click on currency button
    public void clickOnCurrencyButton() {
        clickOnElement(_currencyButton, 20);
        Select currency = new Select(driver.findElement(By.id("customerCurrency")));
        currency.selectByVisibleText("Euro");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> ProductName = driver.findElements(By.className("prices"));
        for (WebElement Product : ProductName)
            System.out.println(Product.getText());
    }
     // method for assert currency
    public void assertForCurrency() {
        String expectedTitle = "€21.50";
        String actualText1 = getTextFromElement(By.xpath("//span[text()='€21.50']"));
        Assert.assertEquals(actualText1, expectedTitle);
    }
}