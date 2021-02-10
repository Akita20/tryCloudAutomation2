package com.trycloud.tests;

import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class US007_TC001_Jamila extends TestBase {
    @Test
    public void TC001() {
        //        Test case #1 - Verify users can search any files/folder/users from the search box.

        //1. Login as a user
        login();
        BrowserUtils.sleep(2);
        //2. Click magnifier icon on the right top
        PageBase pageBase= new PageBase();

        pageBase.buttonSearchClick();
        //3. Search any existing file/folder/user name
        // search file name "watan"
        WebElement searchBox= Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        searchBox.sendKeys("watan");
        searchBox.click();
        String actualTitle=Driver.getDriver().getTitle();
        BrowserUtils.sleep(2);
        WebElement expectedTitle= Driver.getDriver().findElement(By.xpath("ul[@class='unified-search__results unified-search__results-files']"));


       //ul[@class='unified-search__results unified-search__results-files']
       //4. Verify the app displays the expected result option
        Assert.assertEquals(actualTitle,expectedTitle);


    }
}