package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(xpath = "//a[@class='action action-share permanent']")
    public WebElement shareIcon;

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

    //added this web element to locate new folder button
    @FindBy(xpath = "//a[.='New folder']")
    public  WebElement newFolderButton;

    //added folder name after creating new folder
    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement folderName;

    //added "already exist" text
    @FindBy(xpath = "//div[@class='tooltip-inner']")
    public WebElement alreadyExistText;

    //added folder should display after creating new folder
    @FindBy(xpath = "//div[@class='thumbnail']")
    public WebElement addedFolder;


    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement deleteFolderButton;

    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']")
    public WebElement detailsOption;

    @FindBy(xpath = "//td[@class='filename ui-draggable ui-draggable-handle']")
    public List<WebElement> filesList;

    @FindBy(xpath = "//span[@class='nametext extra-data']")
    public List<WebElement> deletedFiles;

    @FindBy(id = "commentsTabView")
    public WebElement commentsButton;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement inputComment;

    @FindBy(xpath = "//ul//div[@class='message']")
    public List<WebElement> displayedMessages;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement threeDots;

    @FindBy(xpath = "//span[@class='icon icon-starred']")
    public WebElement removeStarButton;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeStarFromFav;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFav;

    @FindBy(xpath = "(//h2[.='No files in here'])[1]")
    public WebElement noFilesInHere;

    @FindBy(xpath = "(//div[@class='thumbnail'])[2]")
    public WebElement file;

    @FindBy(xpath = "//h2[.='No favorites yet']")
    public WebElement noFavoritesYet;

    public void clickFilesButton(){
        buttonFiles.click();
    }

    public void clickAllFilesButton(){
        allFilesButton.click();
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

    public void writeCommentToFile(String message){
        actionIcons.get(0).click();
        detailsOption.click();
        commentsButton.click();
        inputComment.sendKeys(message+ Keys.ENTER);
    }






}
