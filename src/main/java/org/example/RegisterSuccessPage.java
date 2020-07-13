package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Util {
    //stored variable
    private By _registerSuccessMessage = By.xpath("//div[@class=\"result\"]");
    String expectedRegisterSuccessMessage = "Your registration completed";
    // method for verify Registered Successfully for assert massage
    public void verifyUserRegisteredSuccessFully(){
        Assert.assertEquals(getTextFromElement(_registerSuccessMessage),expectedRegisterSuccessMessage);
    }

}
