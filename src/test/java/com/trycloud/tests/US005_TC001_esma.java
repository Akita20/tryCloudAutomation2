package com.trycloud.tests;

import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
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
        //2. Click “Contacts” module
        page.contactsUnderContactMenuBar.get(0).click();
        String name= page.selectContactFromContactMenuBar("Dory");
        //3. Verify the page tile is Contents module’s tile
        Assert.assertTrue(driver.getTitle().contains(name));

    }

}
