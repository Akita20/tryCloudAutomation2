package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPOM extends PageBase {





        public TalkPOM() {
            PageFactory.initElements(Driver.getDriver(), this);
        }


        // Talk button
        @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
        public WebElement buttonTalk;
       // search button on the left side
        @FindBy(xpath = "//input[contains(@placeholder,'Search conversations')]")
        public WebElement SearchConversation;
        @FindBy(className = "notifications-button menutoggle")
        public WebElement buttonNotification;
        @FindBy(id = "contactsmenu")
        public WebElement contactMenu;
        // U sign includes setting,logout, set status and help
        @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
        public WebElement Usign;
        @FindBy(xpath = "//button[@class='settings-button']")
        public WebElement setting;
        @FindBy(xpath = "//input[@type='file']")
        public WebElement uploadFile;

        public void buttonTalkclick() {
            buttonTalk.click();
        }

        public void SearchConversation() {
            SearchConversation.click();
        }

        public void buttonNotification() {
            buttonNotification.click();
        }

        public void contactMenuclick() {
            contactMenu.click();
        }

        public void Usign() {
            Usign.click();
        }

        public void setting() {
            setting.click();
        }

        public void uploadFile() {
            uploadFile.click();
        }
    }