package com.trycloud.tests;


import com.trycloud.pages.FilesPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_003_TC005_Adnan extends TestBase {

    @Test
    public void test() {

        login();
        //Creating files page object in order to use that class variables and methods
        FilesPage filesPage = new FilesPage();

        //go to the files module
        filesPage.clickFilesButton();

        BrowserUtils.sleep(2);

        // click (+) icon
        filesPage.addFileIcon.click();

      // locate the upload file button and use drag and drop option to upload the file

        filesPage.uploadFileButton.sendKeys("C:\\Users\\ADNAN\\Desktop\\film listesi.txt");

        BrowserUtils.sleep(2);

        Assert.assertTrue(filesPage.addedFile.isDisplayed());

        Driver.closeDriver();

    }


}
