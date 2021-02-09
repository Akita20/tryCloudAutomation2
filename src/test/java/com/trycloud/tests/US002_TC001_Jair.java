package com.trycloud.tests;

import com.trycloud.pages.PageBase;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class US002_TC001_Jair extends TestBase {

    //UserStory #002 Test Case #001 - verify users access to the main modules
    /*  1-Check is the modules is display
        2-Get text from module
        3-Click on Module
        4-Verify function of the button if took to the action page  */

    @Test(priority = 1, description = "Verify users access to the main modules")
    public void testMainModulesButtons() {
        PageBase driverPageBase = new PageBase();
        login();
        PageFactory.initElements(Driver.getDriver(), driverPageBase);
        LinkedHashMap<WebElement, String> mapMenuBarElements = new LinkedHashMap<>();
        mapMenuBarElements = driverPageBase.mapModulesButton();
        for (WebElement eachElement : mapMenuBarElements.keySet()) {
            Assert.assertTrue(eachElement.isDisplayed());

        }

    }

      /*  @Test(priority = 1)
    public void testMainModulesFile() {
        login();

        PageFactory.initElements(Driver.getDriver(), driverMenuBar);
        //1-Check is the modules is display
        Assert.assertTrue(driverMenuBar.buttonFile.isDisplayed());
        BrowserUtils.sleep(1);

        // 2-Get text from module Expect Result "File"
        BrowserUtils.hoover(driverMenuBar.buttonFile);
        Assert.assertEquals(driverMenuBar.buttonFile.getText(), "Files");

        // 3-Click on Module
        driverMenuBar.buttonFile.click();

        //4-Verify function of the button if took to the actual page file
        String expectedFilePageTitle = "Files";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedFilePageTitle));

    }*/
}
