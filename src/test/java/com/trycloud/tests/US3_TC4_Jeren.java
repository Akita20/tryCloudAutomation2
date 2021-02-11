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
        // login to the application
        login();

        // Creating an obj to get webElement from PageBase
        PageBase pageBase = new PageBase();
        pageBase.buttonFiles.click();

        // Creating an obj to get webElement from FilesPage
        FilesPage filesPage = new FilesPage();

        //Click action-icon from any file on the page
        filesPage.threeDots.click();

        //
        if(filesPage.addOrRemoveStarButton.getText().equals("Remove from favorites")){ // Compare the texts of button
            filesPage.addOrRemoveStarButton.click(); //Click “Remove from Favorites” option

            // Clicking to "Favorites" sub module
            BrowserUtils.sleep(2);
            filesPage.favoritesButton.click();


           //Verify that the file is removed from Favorites sub-module’s table.
            BrowserUtils.sleep(4);
            Assert.assertTrue(filesPage.noFavoritesYet.getText().equalsIgnoreCase("No Favorites Yet"));

        }else if (filesPage.addOrRemoveStarButton.getText().equals("Add to favorites")){

            BrowserUtils.sleep(2);
            filesPage.addOrRemoveStarButton.click();  // Choose “Add to favorites” option

            BrowserUtils.sleep(4);
            filesPage.threeDots.click();  //Clicking to action icon button three dots

            BrowserUtils.sleep(2);
            filesPage.addOrRemoveStarButton.click(); // Choose “Remove from favorites” option

            filesPage.favoritesButton.click();   // Click “Favorites” sub-module on the lest side

            //Verify the chosen file is NOT listed on the table
            BrowserUtils.sleep(2);
            Assert.assertTrue(filesPage.noFavoritesYet.getText().equalsIgnoreCase("No Favorites Yet"));
        }
    }
}
