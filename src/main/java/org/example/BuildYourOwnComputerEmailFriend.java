package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerEmailFriend extends Util {
   //stored variable
   private By _EmailAFriendButton = By.xpath("//input[@value=\"Email a friend\"]");
   //create method for EmailFriend Button to click on element
   public void ClickOnEmailAFriendButton(){

      clickOnElement(_EmailAFriendButton,20);
   }

}
