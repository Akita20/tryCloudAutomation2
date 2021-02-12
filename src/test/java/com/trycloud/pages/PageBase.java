package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class PageBase {

    public PageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
    public WebElement buttonDashboard;
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement buttonFiles;
    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public WebElement buttonPhotos;
    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement buttonActivity;
    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement buttonTalk;
    @FindBy(xpath = "(//a[@aria-label='Mail'])[1]")
    public WebElement buttonMail;
    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement buttonContacts;
    @FindBy(xpath = "(//a[@aria-label='Circles'])[1]")
    public WebElement buttonCircle;
    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement buttonCalendar;
    @FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public WebElement buttonDeck;


    @FindBy(className = "header-menu__trigger")
    public WebElement buttonSearch;
    @FindBy(className = "notifications-button menutoggle")
    public WebElement buttonNotification;
    @FindBy(id = "contactsmenu")
    public WebElement buttonContactMenu;
    @FindBy(id = "settings")
    public WebElement buttonMenuToggle;
    @FindBy(className = "logo logo-icon")
    public WebElement buttonTryCloudLogo;
    @FindBy(xpath = "//div[@id='contactsmenu-contacts']/div/div/div/div[1]")
    public List<WebElement> contactsUnderContactMenuBar;
    @FindBy(xpath = "//input[@id='contactsmenu-search']")
    public WebElement boxSearchUnderContactMenuBar;


    public void buttonDashboardClick() {
        buttonDashboard.click();
    }

    public void buttonFileClick() {
        buttonFiles.click();
    }

    public void buttonPictureClick() {
        buttonPhotos.click();
    }

    public void buttonActivityClick() {
        buttonActivity.click();
    }

    public void buttonTalkClick() {
        buttonTalk.click();
    }

    public void buttonMailClick() {
        buttonMail.click();
    }

    public void buttonContactsClick() {
        buttonContacts.click();
    }

    public void buttonCircleClick() {
        buttonCircle.click();
    }

    public void buttonCalendarClick() {
        buttonCalendar.click();
    }

    public void buttonDeckClick() {
        buttonDeck.click();
    }

    public void buttonSearchClick() {
        buttonSearch.click();
    }

    public void buttonNotificationClick() {
        buttonNotification.click();
    }

    public void buttonContactMenuClick() {
        buttonContactMenu.click();
    }

    public void buttonMenuToggleClick() {
        buttonMenuToggle.click();
    }

    public String selectContactFromContactMenuBar(String name) {
        String nameOfContact = "";
        for (WebElement element : contactsUnderContactMenuBar) {
            if (element.getText().contains(name)) {
                element.click();
                nameOfContact = element.getText();
            }
        }
        return nameOfContact;
    }


}
