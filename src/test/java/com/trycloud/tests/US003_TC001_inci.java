package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class US003_TC001_inci extends TestBase {
    @Test(priority = 1,description = "verify users can access to Files module ")
    public void test1(){
        //1.log in as a user
        login();
        //2.open Files module
        FilesPage filesPage=new FilesPage();
        filesPage.clickFilesButton();
        BrowserUtils.sleep(3);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Files"));
    }
   @AfterClass
    public void teardown() {
        Driver.closeDriver();
    }

}
