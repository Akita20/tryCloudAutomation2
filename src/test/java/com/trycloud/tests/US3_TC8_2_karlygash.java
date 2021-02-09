package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC8_2_karlygash extends TestBase {

    @Test
    public void add_comments_to_file() {
        login();
        // create an object from FilesPage and go to Files Module
        FilesPage filesPage = new FilesPage();
        filesPage.clickFilesButton();
        // click on All Files
        filesPage.clickAllFilesButton();

        String message = "Very good";

        filesPage.writeCommentToFile(message);

        boolean messageIsDisplayed = false;

        for (WebElement each : filesPage.displayedMessages) {
            if (each.getText().equals(message)) {
                messageIsDisplayed = true;
            }
        }

        Assert.assertTrue(messageIsDisplayed);


    }

}
