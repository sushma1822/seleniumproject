package org.example;

import org.testng.annotations.Test;

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
    @Test(priority = 1)
    public void verifyUserShouldAbleToRegisterSuccessFully(){

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

}
