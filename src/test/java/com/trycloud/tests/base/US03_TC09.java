package com.trycloud.tests.base;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US03_TC09 extends TestBase{
    @Test
    public void US03_TC09(){
        login();
        WebElement fileButton = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        fileButton.click();
        BrowserUtils.sleep(2);
        WebElement settingButton= Driver.getDriver().findElement(By.id("body-user"));
        settingButton.click();
    }
}
