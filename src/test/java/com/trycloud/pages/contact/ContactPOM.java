package com.trycloud.pages.contact;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPOM {
    public ContactPOM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //all input boxes-->starts with 'box'
    //all clickable  buttons start with 'button'
//****Group 1:
    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement buttonNewContact;

    @FindBy(xpath = "//li[@class='app-navigation-entry active']/a")
    public WebElement buttonAllContacts;

    @FindBy(xpath = "//li[@id='notgrouped']/a")
    public WebElement buttonNotGrouped;

    @FindBy(xpath = "//li[@id='newgroup']/a")
    public WebElement buttonNewGroup;


}

