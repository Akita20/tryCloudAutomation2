package com.trycloud.tests;

import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class US007_TC001_Jamila extends TestBase {


    @Test
    public void TC001() {
        //        Test case #1 - Verify users can search any files/folder/users from the search box.

        //1. Login as a user
        login();
        BrowserUtils.sleep(1);
        //2. Click magnifier icon on the right top
        PageBase pageBase= new PageBase();

        pageBase.buttonSearchClick();
        //3. Search any existing file/folder/user name
        // search file name "watan"
        WebElement searchBox= Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        searchBox.sendKeys("watan");
        searchBox.click();

        String actualTitle= Driver.getDriver().findElement(By.xpath("//strong[.='watan']")).getText();
        BrowserUtils.sleep(2);
        String expectedTitle= "watan";
        //4. Verify the app displays the expected result option
        Assert.assertEquals(actualTitle,expectedTitle);




    }
    @Test
    public void tc2() {
        //        Test case #1 - Verify users can search any files/folder/users from the search box.

        //1. Login as a user
        login();
        BrowserUtils.sleep(1);
        //2. Click magnifier icon on the right top
        PageBase pageBase= new PageBase();

        pageBase.buttonSearchClick();
        //3. Search any existing file/folder/user name

       // search user name
        WebElement searchBox= Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
      //  Driver.getDriver()
         searchBox.sendKeys(ConfigurationReader.getProperty("username"));
         searchBox.click();
         String actualTitle1=Driver.getDriver().findElement(By.xpath("//input[@id='user']")).getText();
         String expectedTitle1="username";

          Assert.assertEquals(actualTitle1,expectedTitle1);
    }
}