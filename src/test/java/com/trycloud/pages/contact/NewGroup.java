package com.trycloud.pages.contact;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewGroup {
    public NewGroup(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //***pre-condition  to see boxNewGroupName  and boxSubmitForNewGroup is:
    // you need to press buttonNewGroup first ***

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement boxNewGroupName;

    @FindBy(xpath = "//label[@class='action-input__label']")
    public WebElement buttonSubmitForNewGroup;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement buttonAddNewContactViaGroup;
    //*****************************************************************//

}
