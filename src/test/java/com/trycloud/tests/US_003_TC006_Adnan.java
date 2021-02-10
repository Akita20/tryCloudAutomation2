package com.trycloud.tests;

import com.github.javafaker.Faker;
import com.trycloud.pages.FilesPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_003_TC006_Adnan extends TestBase {


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

        // In order to write new folder name first we need to delete default name
        filesPage.newFolderButton.click();
        filesPage.folderName.sendKeys(Keys.BACK_SPACE);
        BrowserUtils.sleep(2);

        // [Here i am hiding top secret information for each country :) ] and want to get this folder name data from java faker.Faker class is not in the test case requirements.I just made it up.
        Faker faker = new Faker();
        String name = faker.country().name();
        filesPage.folderName.sendKeys(name + Keys.ENTER);

        // if new folder name is same as one of the existed ones, 'already exist' text should be display.
        // String existingFolderName = Driver.getDriver().findElement(By.xpath("//a[@class='name']")).getText();
        //This is also not required in my test case but i thought it should be.
        for (WebElement eachExistingFolderName : filesPage.filesList) {

            if (name.equals(eachExistingFolderName.getText())) {

                String alreadyExistText = filesPage.alreadyExistText.getText();
                Assert.assertEquals(alreadyExistText, name + " already exist is not displayed");
            }

        }


        BrowserUtils.sleep(2);

      // verify added folder is displayed after creating new folder
        Assert.assertTrue(filesPage.addedFolder.isDisplayed());

        Driver.closeDriver();
    }
}
