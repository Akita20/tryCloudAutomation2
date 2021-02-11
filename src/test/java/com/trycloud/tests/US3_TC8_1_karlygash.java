package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC8_1_karlygash extends TestBase {

    @Test
    public void delete_file_test() {
        login();
        // go to Files Module
        FilesPage filesPage = new FilesPage();
        filesPage.clickFilesButton();
        // click on All Files
        filesPage.clickAllFilesButton();
        // Click on the 1st file
        WebElement fileToDelete = filesPage.fileToDelete();
        String deletedFileTitle = fileToDelete.getText();
        System.out.println("deletedFileTitle = " + deletedFileTitle);

        filesPage.deleteFile();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(fileToDelete));

        filesPage.clickDeletedFilesButton();

        boolean fileIsDeleted = false;
        for (WebElement eachDeletedFile : filesPage.deletedFiles){

            if (eachDeletedFile.getAttribute("data-original-title").equalsIgnoreCase(deletedFileTitle)){
                fileIsDeleted = true;
            }
        }
        Assert.assertTrue(fileIsDeleted);


    }
}
