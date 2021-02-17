package com.trycloud.pages.contact;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewGroup extends ContactPOM {
    public NewGroup() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //***pre-condition  to see boxNewGroupName  and boxSubmitForNewGroup is:
    // you need to press buttonNewGroup first ***

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement boxNewGroupName;

    @FindBy(xpath = "//label[@class='action-input__label']")
    public WebElement buttonSubmitForNewGroup;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement buttonAddNewContactViaGroup;
    /*      ****************************************************************
     After pressing buttonAddNewContactViaGroup a pop up bubble will open which
     you can search contacts and add to group the below webElements are for that
     window
            ****************************************************************

     */
    @FindBy(xpath = "//div[@class='modal-container']")
    public WebElement windowSearchContactsViaGroup;

    @FindBy(xpath = "//input[contains(@placeholder,'Search')]")
    public WebElement buttonSearchContactsViaGroup;

    @FindBy(xpath = "//button[@class='navigation__button-left']")
    public WebElement buttonCancelViaGroup;

    //it gives all users appear in the bubble
    @FindBy(xpath = "//span[@class='user-bubble__title']")
    public List<WebElement> usersOnBubble;

    @FindBy(xpath = "//button[@class='navigation__button-right primary']")
    public WebElement buttonAddToGroup;


}
