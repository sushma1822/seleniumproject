package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest  {
    // object of the classes
    HomePage homePage = new HomePage();
   RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    BuildYourOwnComputerEmailFriend buildYourOwnComputerEmailFriend = new BuildYourOwnComputerEmailFriend();
    CellPhone cellPhone = new CellPhone();
    Computer computer = new Computer();
    Desktop desktop = new Desktop();
    Electronic electronic = new Electronic();
    EmailAFriendInformation emailAFriendInformation = new EmailAFriendInformation();
    EmailSendSuccessfully emailSendSuccessfully = new EmailSendSuccessfully();
    ShoppingCart shoppingCart = new ShoppingCart();
    Facebook facebook = new Facebook();
    OnlineStore onlineStore = new OnlineStore();
    IFrameHandle iFrameHandle = new IFrameHandle();
    @Test(priority = 1)
    public void verifyUserShouldAbleToRegisterSuccessFully(){
         homePage.verifyTextOnHomePage();
        //click on register button
        homePage.clickOnRegisterButton();
        // user enters registration details
        registerPage.userEnterRegistrationDetails();
        //user click on register-submit button
       registerPage.userClickOnRegisterSubmitButton();
        // verify user is on register-success page
        //verify register success message
        registerSuccessPage.verifyUserRegisteredSuccessFully();


    }
    @Test(priority = 2)
    public void EmailAFriendSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        // user enters registration details
        registerPage.userEnterRegistrationDetails();
        //user click on register-submit button
        registerPage.userClickOnRegisterSubmitButton();
        //click on computerButton
        homePage.clickOnComputerButton();
        //click on DesktopButton
        computer.ClickOnDesktopButton();
        //click on Build your own computer
        desktop.ClickOnBuildYourOwnComputer();
        // click on email a friend button
        buildYourOwnComputerEmailFriend.ClickOnEmailAFriendButton();
        //type text email a friend information
        emailAFriendInformation.typeTextEmailAFriendInformation();


    }
    @Test(priority = 3)
    public void userAbleToAddToCart(){
        // click on ElectronicButton
        homePage.clickOnElectronicButton();
        //click on cellphone button
        electronic.clickOnCellPhoneButton();
        //click on Add to cartButton
        cellPhone.clickOnAddToCartButton();
        //verify shopping cart Message
        shoppingCart.userVerifyShoppingCartMassage();

    }
    @Test
    public void VerifyEachProductHaveName()
    {
        List<WebElement> ProductName = driver.findElements(By.xpath("//div[contains(@class,'product')]/div[2]/div/div[1]/div[2]/h2/a"));
        for (WebElement Product :ProductName)
            System.out.println(Product.getText());
    }
    @Test(priority = 4)
    public void demoGetAlert(){
        //click on search button
        homePage.clickOnSearchButton();
        //click on alert
        homePage.clickAlert();

    }
    @Test(priority = 5)
    public void verifyWindowPopUp(){
        // click on facebook button
        homePage.clickOnFacebookButton();
        //click on swap window
        facebook.verifyUserIsSwapWindow();
        //verify URL by assert
        facebook.verifyURl();
      //  user verify the text
        facebook.verifyText();
        // verify color of text
        facebook.verifyColourOfText();
      // go to main window
        facebook.GoToMainWindow();
    }
    @Test(priority = 6)
    public void verifyDetailOfNews(){
        //click on details Button
        homePage.clickOnDetailsButton();
        // type the text in comment
        onlineStore.verifyURlForOnlineStore();
        // assert comment
        onlineStore.verifyNewComment();
        // user can verify massage successfully
        onlineStore.VerifyCommentMassageSuccessfully();
        // assert the comment of the text
        onlineStore.assertText();
    }
    @Test(priority =7)
    public void verifyCurrency(){
        //click on currency BUTTON
        homePage.clickOnCurrencyButton();
        // get assert for currency
        homePage.assertForCurrency();
    }
    @Test(priority = 8)
    public void VerifyIFrameHandle(){
        //handle swichiframe
        iFrameHandle.SwichIframe();
        // get frame name
        iFrameHandle.animalName();
        // get the animal name
        iFrameHandle.animal();
    }
}


