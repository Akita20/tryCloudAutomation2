package com.trycloud.tests;

import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US005_TC001_esma extends TestBase {
    WebDriver driver= Driver.getDriver();

    @Test(description = "//Test case #1 - verify users can access to Talks module")
    public void verify_users_access_talkModule_via_Contacts(){
        //1. Login as a user
        login();
        PageBase page=new PageBase();
        page.buttonContactMenuClick();
        //2. Click “Contacts” module and click to Dory Semal contact
        String name= page.selectContactFromContactMenuBar("Dory");
        //3. Verify the page tile is Contents module’s tile
        Assert.assertTrue(driver.getTitle().contains(name));

        //the test fails I tried manually and we are unable to click to contacts under Contact Menu bar
        //in the other environment we had a button on the contacts that was enabling us to go to talk page
        //of that certain contact

    }

}
