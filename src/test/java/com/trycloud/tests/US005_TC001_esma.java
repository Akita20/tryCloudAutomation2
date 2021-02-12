package com.trycloud.tests;

import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US005_TC001_esma extends TestBase {
    WebDriver driver= Driver.getDriver();
    //Test case #1 - verify users can access to Talks module
    //1. Login as a user
    //2. Click “Contacts” module
    //3. Verify the page tile is Contents module’s tile
    @Test
    public void verify_users_access_talkModule_via_Contacts(){
        login();
        PageBase page=new PageBase();
        page.buttonContactMenuClick();
        page.contactsUnderContactMenuBar.get(0).click();
        String name= page.selectContactFromContactMenuBar("Dory");
        System.out.println(name);
        Assert.assertTrue(driver.getTitle().contains(name));

    }

}
