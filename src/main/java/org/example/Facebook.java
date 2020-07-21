package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class Facebook extends Util {
    //store a variable for assert
    private By _CreatePage = By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");
    String expectedCreatePageText = "Create a Page";
   // method for handle window
    public void verifyUserIsSwapWindow() {
        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
            }
        }
        }
        //assert for Url
        public void verifyURl(){
         String URL = driver.getCurrentUrl();
         Assert.assertEquals(URL,"https://www.facebook.com/nopCommerce");
        }
        // assert for crate page
        public void verifyText(){
            Assert.assertEquals(getTextFromElement(_CreatePage),expectedCreatePageText);

        }
        // get assert for background color
        public void verifyColourOfText(){

            String expectedColour = "#42b72a";
            String ActualColour = driver. findElement(By.linkText("Create New Account")). getCssValue("background-color");
            String hexColour = Color.fromString(ActualColour).asHex();
            String Actulcolour = hexColour;
            Assert.assertEquals(Actulcolour,expectedColour);
            System. out. println("Button color: " + ActualColour);


        }
        // back to main window
        public void GoToMainWindow(){
            // Switching to Parent window i.e Main Window.
            String MainWindow = driver.getWindowHandle();
            driver.switchTo().window(MainWindow);
        }
    }