package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC3_Jeren extends TestBase {

    @Test
    public void test3(){
        // login to the application
      login();
        // creating an object to get Files (and clicking) from PageBase using POM
        PageBase pageBase = new PageBase();
        pageBase.buttonFiles.click();

        // creating an object to get allFiles (and clicking) from FilesPage using POM
        FilesPage filesPage = new FilesPage();

        BrowserUtils.sleep(2);
        filesPage.threeDots.click();
        if (filesPage.addToFav.isDisplayed()){
            filesPage.addToFav.click();
            BrowserUtils.sleep(2);
            filesPage.favoritesButton.click();

            BrowserUtils.sleep(2);
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//span[@class='icon icon-starred'])[2]")).isDisplayed(), "problem occurred when asserting");

        }else if (!filesPage.addToFav.isDisplayed()){
            filesPage.removeStarFromFav.click();

            BrowserUtils.sleep(2);
            filesPage.threeDots.click();

            BrowserUtils.sleep(2);
            filesPage.addToFav.click();

            BrowserUtils.sleep(2);
            filesPage.favoritesButton.click();

            BrowserUtils.sleep(2);
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//span[@class='icon icon-starred'])[2]")).isDisplayed(), "problem occurred when asserting");
        }
//           if (!filesPage.removeStarButton.isEnabled()) {
//
//               filesPage.threeDots.click();
//
//               BrowserUtils.sleep(2);
//               filesPage.addToFav.click();
//
//           }else {
//               filesPage.threeDots.click();
//
//               BrowserUtils.sleep(2);
//             filesPage.removeStarFromFav.click();
//
//               BrowserUtils.sleep(2);
//               filesPage.threeDots.click();
//
//               BrowserUtils.sleep(2);
//               filesPage.addToFav.click();
//
//           }

        // clicking the "Favorites" sub module on the left side
//        BrowserUtils.sleep(2);
//        filesPage.favoritesButton.click();
//
//        BrowserUtils.sleep(2);
//        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//span[@class='icon icon-starred'])[2]")).isDisplayed(), "problem occurred when asserting");
    }
}
