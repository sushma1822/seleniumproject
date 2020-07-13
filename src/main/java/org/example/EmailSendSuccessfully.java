package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailSendSuccessfully extends Util {
    //stored variable
    private By _EmailSendSuccessMessage = By.linkText("Your message has been sent.");
    String expectedEmailSendSuccessMessage = "Your message has been sent.";
  // create method for send mail successfully for assert the massage
    public void verifyUserSendEmailSuccessFully(){
        Assert.assertEquals(getTextFromElement(_EmailSendSuccessMessage),expectedEmailSendSuccessMessage);

    }


}
