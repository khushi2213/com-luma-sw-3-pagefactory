package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;
    public void hoverOnGearMenu() {
        mouseHoverToElement(gearMenu);

    }

    public void clickOnBags() {
        Reporter.log("Bags " + bags.toString());
        clickOnElement(bags);
    //    CustomListeners.test.log(Status.PASS, "Click on bags");
    }

    public void mouseHoverToWomenMenu() {
        //Reporter.log("Women Menu " + womenMenu.toString());
        mouseHoverToElement(womenMenu);
    //    CustomListeners.test.log(Status.PASS, "Mouse Hover to women menu");

    }

    public void mouseHoverToWomenTops() {
        Reporter.log("Women Tops " );
        mouseHoverToElement(tops);
     //   CustomListeners.test.log(Status.PASS, "Mouse hover to women tops");
    }

    public void clickOnJackets() {
        Reporter.log("Women Jackets ");
        clickOnElement(jackets);
     //   CustomListeners.test.log(Status.PASS, "Click on Jackets");
    }

    public void mouseHoverToMenMenu() {
        //Reporter.log("Men Menu" + menMenu.toString());
        mouseHoverToElement(menMenu);
      //  CustomListeners.test.log(Status.PASS, "Mouse hover to men menu");
    }

    public void mouseHoverToMenTops() {
        //Reporter.log("Men Bottoms" + menMenu.toString());
        mouseHoverToElement(bottomMenu);
   //     CustomListeners.test.log(Status.PASS, "Mouse hover to men Bottom");
    }

    public void clickOnPants() {
        // Reporter.log("Men Pants" + menPants.toString());
        clickOnElement(pants);
    //    CustomListeners.test.log(Status.PASS, "Click on pants");
    }
}
