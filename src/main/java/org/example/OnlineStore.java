package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class OnlineStore extends Util {
    // store a variable
    private By _TitleText = By.xpath("//input[@id=\"AddNewComment_CommentTitle\"]");
    private By _CommentText = By.xpath("//textarea[@name=\"AddNewComment.CommentText\"]");
    private By _NewCommentButton = By.xpath("//input[@name=\"add-comment\"]");
    private By _SuccessMassage = By.xpath("//div[@class=\"result\"]");
   String expectedSuccessMassage = "News comment is successfully added.";
    private By _TitleComment = By.xpath("//strong[text()=\"Test7\"]");
    String expectedTitleComment = "Test7";
    // method for assert URL
    public void verifyURlForOnlineStore(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://demo.nopcommerce.com/new-online-store-is-open");
    }
    //method for type new comment
    public void verifyNewComment(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      typeText(_TitleText,"Test7",30);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      typeText(_CommentText,"jai swaminarayan",20);
      clickOnElement(_NewCommentButton,20);
    }
    // method for verify massage
    public void VerifyCommentMassageSuccessfully(){
        Assert.assertEquals(getTextFromElement(_SuccessMassage),expectedSuccessMassage);
    }
    // method for verify title text
    public void assertText(){
        Assert.assertEquals(getTextFromElement(_TitleComment),expectedTitleComment);
    }
}
