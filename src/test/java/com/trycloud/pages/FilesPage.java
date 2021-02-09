package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FilesPage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label ='Files'])[1]")
    public WebElement filesButton;

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

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> actionIcons;

    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement deleteFolderButton;

    @FindBy(xpath = "//td[@class='filename ui-draggable ui-draggable-handle']")
    public List<WebElement> filesList;

    @FindBy(xpath = "//span[@class='nametext extra-data']")
    public List<WebElement> deletedFiles;

    public void clickFilesButton(){
        filesButton.click();
    }

    public void clickAllFilesButton(){
        allFilesButton.click();
    }

    public void clickDeleteFolder(){
        deleteFolderButton.click();
    }

    public void clickDeletedFilesButton(){
        deletedFilesButton.click();
    }

    public WebElement fileToDelete(){

        return filesList.get(0);
    }

    public void deleteFile(){
        actionIcons.get(0).click();
        BrowserUtils.sleep(3);
        deleteFolderButton.click();
    }




}
