package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC3_Jeren extends TestBase {

    @Test (description = "verify users can add a file to favorites")
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

        BrowserUtils.sleep(5);
        if (filesPage.addOrRemoveStarButton.getText().equals("Add to favorites")){ // Compare the texts of button
            filesPage.addOrRemoveStarButton.click(); // Choose “Add to Favorites” option

            // Click “Favorites” sub-module on the lest side
            BrowserUtils.sleep(2);
            filesPage.favoritesButton.click();

            //Verify the chosen file is listed on the table
            BrowserUtils.sleep(2);
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//span[@class='icon icon-starred'])[2]")).isDisplayed(), "problem occurred when asserting");

        }else if (filesPage.addOrRemoveStarButton.getText().equals("Remove from favorites")){
            filesPage.addOrRemoveStarButton.click();  // Choose “Remove from favorites” option

            BrowserUtils.sleep(2);
            filesPage.threeDots.click();  //Clicking to action icon button three dots

            BrowserUtils.sleep(2);
            filesPage.addOrRemoveStarButton.click();  // Choose “Add to Favorites” option

            BrowserUtils.sleep(2);
            filesPage.favoritesButton.click();    // Click “Favorites” sub-module on the lest side

            //Verify the chosen file is listed on the table
            BrowserUtils.sleep(2);
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//span[@class='icon icon-starred'])[2]")).isDisplayed(), "problem occurred when asserting");
        }
    }
}
