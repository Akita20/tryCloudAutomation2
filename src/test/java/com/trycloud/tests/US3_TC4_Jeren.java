package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC4_Jeren extends TestBase {

    @Test(description = "Verify User can remove file from favorites")
    public void test2(){
        // login to the application
        login();
        // Creating an obj to get webElement from PageBase
        PageBase pageBase = new PageBase();
        pageBase.buttonFiles.click();
        // Creating an obj to get webElement from FilesPage
        FilesPage filesPage = new FilesPage();

        //Click action-icon from any file on the page
        filesPage.threeDots.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 4);

        // Compare the texts of button
        if(filesPage.addOrRemoveStarButton.getText().equals("Remove from favorites")){

            //Click “Remove from Favorites” option
            filesPage.addOrRemoveStarButton.click();

            // Clicking to "Favorites" sub module
            filesPage.favoritesButton.click();

           //Verify that the file is removed from Favorites sub-module’s table.
            wait.until(ExpectedConditions.visibilityOf(filesPage.noFavoritesYet));
            Assert.assertTrue(filesPage.noFavoritesYet.getText().equals("No favorites yet"));

        }else if (filesPage.addOrRemoveStarButton.getText().equals("Add to favorites")){

            // Click “Favorites” sub-module on the lest side
            filesPage.favoritesButton.click();

            //Verify the chosen file is NOT listed on the table
            wait.until(ExpectedConditions.visibilityOf(filesPage.noFavoritesYet));
            Assert.assertTrue(filesPage.noFavoritesYet.getText().equals("No favorites yet"));
        }
    }
}
