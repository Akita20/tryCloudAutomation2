package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC4_Jeren extends TestBase {

    @Test
    public void test2(){
        login();

        // Creating an obj to get webElement from PageBase
        PageBase pageBase = new PageBase();
        pageBase.buttonFiles.click();

        // Creating an obj to get webElement from FilesPage
        FilesPage filesPage = new FilesPage();

        if(filesPage.removeStarButton.isDisplayed()){
            filesPage.threeDots.click();
            //Click “Remove from Favorites” option
            BrowserUtils.sleep(2);
            filesPage.removeStarFromFav.click();

            // Clicking to "Favorites" sub module
            filesPage.favoritesButton.click();

            BrowserUtils.sleep(4);
           //Verify that the file is removed from Favorites sub-module’s table.
            Assert.assertTrue(filesPage.noFavoritesYet.isDisplayed());

        }else if (!filesPage.removeStarButton.isDisplayed()){
            filesPage.threeDots.click();

            BrowserUtils.sleep(2);
            filesPage.addToFav.click();

            BrowserUtils.sleep(4);
            filesPage.threeDots.click();

            BrowserUtils.sleep(2);
            filesPage.removeStarFromFav.click();

            filesPage.favoritesButton.click();

            BrowserUtils.sleep(2);
            Assert.assertTrue(filesPage.noFavoritesYet.isDisplayed());
        }
    }
}
