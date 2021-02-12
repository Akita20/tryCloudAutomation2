package com.trycloud.pages.contact;

import com.trycloud.pages.PageBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPOM extends PageBase {
    public ContactPOM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //all input boxes-->starts with 'box'
    //all clickable  buttons start with 'button'
//****Group 1:
    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement button_NewContact;

    @FindBy(xpath = "//li[@class='app-navigation-entry active']/a")
    public WebElement button_AllContacts;

    @FindBy(xpath = "//li[@id='notgrouped']/a")
    public WebElement button_NotGrouped;

    @FindBy(xpath = "//li[@id='newgroup']/a")
    public WebElement button_NewGroup;

    @FindBy(css = "a.app-navigation-toggle")
    public WebElement button_Toggle;

    @FindBy(css = "button.settings-button")
    public WebElement button_Settings;

    //***inside the Settings there is below elements***
    @FindBy(xpath = "//input[@id='socialSyncToggle']/following-sibling::label")
    public WebElement checkBox_Update_Avatars;

    @FindBy(xpath = "//button[@aria-controls='menu-ohlff']")
    public WebElement button_ThreeDots_Contacts;
    @FindBy(xpath = "//button[@aria-controls='menu-tylvo']")
    public WebElement button_ThreeDots_RecentlyContacted;

    @FindBy(xpath = "//input[@id='new-addressbook']")
    public WebElement box_Address_Book_Name;

    @FindBy(xpath = "//span[.='Sort by Display name']")
    public WebElement box_SortByDisplayName;

    @FindBy(xpath = "//button[@class='import-contact__button-main']")
    public WebElement button_ImportContacts;
    //****************************************



    String sideBarButtons = "//span[@title='%s']";


    public String t1(String text) {
        return String.format(sideBarButtons, text);
    }


}

