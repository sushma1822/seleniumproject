package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Util {
    //stored variables
    private By _Gender =  By.xpath("//input[@id=\"gender-female\"]");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirthday = By.xpath("//select[@name='DateOfBirthDay']");
    private By _dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");
    private By _emailField = By.name("Email");
    private By _CompanyName = By.id("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerSubmitButton = By.xpath("//input[@id=\"register-button\"]");

    public void verifyUserIsOnRegisterPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("Register"),"User is not on register page");
    }
    //method for enter register details
    public void userEnterRegistrationDetails(){
        clickOnElement(_Gender,20);
        typeText(_firstName,"sushma",20);
        typeText(_lastName,"patel",20);
        selectFromDropDownByVisibleText(_dateOfBirthday,"18");
        selectFromDropDownByVisibleText(_dateOfBirthMonth,"March");
        selectFromDropDownByVisibleText(_dateOfBirthYear,"1992");
        typeText(_emailField,"priyal+"+timestamp()+"@gmail.com",20);
        typeText(_CompanyName,"ABCLtd.",20);
        typeText(_password,"priyal",20);
        typeText(_confirmPassword,"priyal",20);
    }
    //method for click on registerSubmitButton
    public void userClickOnRegisterSubmitButton(){
        clickOnElement(_registerSubmitButton,30);
    }
}
