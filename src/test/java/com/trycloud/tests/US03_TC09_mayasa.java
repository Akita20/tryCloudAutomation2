package com.trycloud.tests;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US03_TC09_mayasa extends TestBase {
    @Test
    public void US03_TC09() throws InterruptedException {

        login();
        //I selected file button
        WebElement fileButton = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        fileButton.click();
        BrowserUtils.sleep(2);

// I located the setting button on the down left corner
        WebElement settingButton = Driver.getDriver().findElement(By.xpath("//button[@class='settings-button']"));
        settingButton.click();


        // Locating the showRichWorkSpaceCheckBox
        WebElement showRichWorkSpaceCheckBox = Driver.getDriver().findElement(By.id("body-user"));
        showRichWorkSpaceCheckBox.isSelected();
        Thread.sleep(1);

        //Locating the showRecommendationCheckBox button
        WebElement showRecommendationCheckBox = Driver.getDriver().findElement(By.xpath("//label[@for='recommendationsEnabledToggle']"));
        showRichWorkSpaceCheckBox.isSelected();
        Thread.sleep(1);


        //Locating the showHiddenFilesCheckBox button
        WebElement showHiddenFilesCheckBox = Driver.getDriver().findElement(By.xpath("//label[@for='showhiddenfilesToggle']"));
        showRichWorkSpaceCheckBox.isSelected();
        Thread.sleep(1);


        Assert.assertTrue(showRichWorkSpaceCheckBox.isEnabled());
        Assert.assertTrue(showRecommendationCheckBox.isEnabled());
        Assert.assertTrue(showHiddenFilesCheckBox.isEnabled());


    }
}

