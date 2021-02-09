package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage extends PageBase {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "app-navigation-toggle")
    public WebElement navigationIcon;

    @FindBy(xpath = "//a[@class='nav-icon-files svg active']")
    public WebElement allFilesButton;

    @FindBy(xpath = "//a[@class='nav-icon-recent svg']")
    public WebElement recentButton;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favoritesButton;

    @FindBy(xpath = "//a[@class='nav-icon-shareoverview svg']")
    public WebElement sharesButton;

    @FindBy(xpath = "//a[@class='nav-icon-systemtagsfilter svg']")
    public WebElement tagsButton;

    @FindBy(xpath = "//a[@class='nav-icon-circlesfilter svg']")
    public WebElement sharedToCircles;

    @FindBy(xpath = "//a[@class='icon-home']")
    public WebElement homeIcon;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addFileIcon;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deletedFilesButton;

    @FindBy(xpath = "//a[@class='icon-quota svg']")
    public WebElement storageUsedIcon;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingsButton;

}
