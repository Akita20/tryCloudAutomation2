package com.trycloud.pages.contact;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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

    @FindBy(css = "button.settings-button")
    public WebElement buttonSettings;

    @FindBy(css = "a.app-navigation-toggle")
    public WebElement buttonToggle;

    String sideBarButtons="//span[@title='%s']";


    public String t1(String text){
       return String.format(sideBarButtons,text);
    }


}

