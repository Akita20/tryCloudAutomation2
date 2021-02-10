package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPagePOM extends PageBase {
    public MailPagePOM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='icon-mail']")
    public WebElement emailIcon;
    @FindBy(xpath = " //div[@id='emptycontent']/h2")
    public WebElement connectYourMailAccount;
    @FindBy(xpath = "//li[@class='tabs-component-tab is-active']")
    public WebElement autoTab;
    @FindBy(xpath = "//li[@class='tabs-component-tab']")
    public WebElement manualTab;
    @FindBy(xpath = "//section[@id='auto']/label[1]")
    public WebElement name;
    @FindBy(xpath = "//input[@id='auto-name']")
    public WebElement inputUser;
    @FindBy(xpath = "//section[@id='auto']/label[2]")
    public WebElement mailAddress;
    @FindBy(xpath = "//input[@id='auto-address']")
    public WebElement inputMailAddress;
    @FindBy(xpath = "//label[.='Password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='auto-password']")
    public WebElement inputPassword;
    @FindBy(xpath = "//input[@class='primary']")
    public WebElement connectTab;

    public void emailIconClick(){ emailIcon.click();}
    public void connectYourMailAccountC(){connectYourMailAccount.click();}
    public void autoTabClick(){autoTab.click();}
    public void manualTabClick (){ manualTab.click();}
    public void nameClick(){name.click();}
    public void inputUserClick(){ inputUser.click();}
    public void mailAddressClick(){mailAddress.click();}
    public void inputMailAddressClick(){inputMailAddress.click();}
    public void passwordClick(){password.click();}
    public void inputPasswordClick(){inputPassword.click();}
    public void connectTabClick(){connectTab.click();}


}
