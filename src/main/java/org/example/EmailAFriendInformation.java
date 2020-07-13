package org.example;

import org.openqa.selenium.By;

public class EmailAFriendInformation extends Util {
  // stored variable
    private By _FriendEmail = By.id("FriendEmail");
    private By _PersonalMassage = By.xpath("//textarea[@id=\"PersonalMessage\"]");
    private By _SendEmailButton = By.xpath("//input[@name=\"send-email\"]");

 // create method for type text for email friend information
    public void typeTextEmailAFriendInformation() {

      typeText(_FriendEmail,"cheshta2016@yahoo.com",20);
      typeText(_PersonalMassage,"jai Swaminarayan",20);
      clickOnElement(_SendEmailButton,20);

    }
}