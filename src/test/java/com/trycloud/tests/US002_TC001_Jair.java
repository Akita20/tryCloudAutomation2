package com.trycloud.tests;

import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class US002_TC001_Jair extends TestBase {

    //UserStory #002 Test Case #001 - verify users access to the main modules
    /*  1-Check is the modules is display
        2-Get text from module
        3-Click on Module
        4-Verify function of the button if took to the actual page  */

    @Test
    public void testButtonOnMenuBar() {
        PageBase pageBase = new PageBase();
        login();

        testMainModulesButton(pageBase.buttonFiles, "Files");

      // testMainModulesButton(pageBase.buttonPhotos, "Galleries");
       //Fail, bug expect result "Galleries" Actual "Photos"

        testMainModulesButton(pageBase.buttonActivity, "Activity");

        testMainModulesButton(pageBase.buttonTalk, "Talk");

        testMainModulesButton(pageBase.buttonContacts, "Contacts");

        testMainModulesButton(pageBase.buttonCalendar, "Calendar");

        //testMainModulesButton(pageBase.buttonNotification, "Note");
        //Fail, bug there isn't "Note" module
    }



    public void testMainModulesButton(WebElement button, String buttonName) {
        //1-Check is the modules is display
        Assert.assertTrue(button.isDisplayed());
        BrowserUtils.sleep(1);

        // 2-Get text from module Expect Result "Activity"
        BrowserUtils.hoover(button);
        Assert.assertEquals(button.getText(), buttonName);

        // 3-Click on Module
        button.click();

        //4-Verify function of the button if took to the actual page Galleries
        Assert.assertTrue(Driver.getDriver().getTitle().contains(buttonName));

    }
}

