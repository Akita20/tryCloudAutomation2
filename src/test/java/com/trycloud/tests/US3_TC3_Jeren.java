package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC3_Jeren extends TestBase {

    @Test (description = "Verify User can add a file to favorites")
    public void test3(){
        // login to the application
        login();
        // creating an object to get Files (and clicking) from PageBase using POM
        PageBase pageBase = new PageBase();
        pageBase.buttonFiles.click();
        // creating an object to get allFiles (and clicking) from FilesPage using POM
        FilesPage filesPage = new FilesPage();

        // Clicking to action icon button
        filesPage.threeDots.click();

        // Compare the texts of button
        if (filesPage.addOrRemoveStarButton.getText().equals("Add to favorites")){

            // Choose “Add to Favorites” option
            filesPage.addOrRemoveStarButton.click();

            // Click “Favorites” sub-module on the lest side
            filesPage.favoritesButton.click();

            //Verify the chosen file is listed on the table
            Assert.assertTrue(filesPage.starIcon.isDisplayed(),
                    "problem occurred when asserting");

        }else if (filesPage.addOrRemoveStarButton.getText().equals("Remove from favorites")){

            // Click “Favorites” sub-module on the lest side
            filesPage.favoritesButton.click();

            //Verify the chosen file is listed on the table
            Assert.assertTrue(filesPage.starIcon.isDisplayed(),
                    "problem occurred when asserting");
        }
    }
}
