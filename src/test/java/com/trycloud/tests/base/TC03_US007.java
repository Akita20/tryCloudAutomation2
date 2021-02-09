package com.trycloud.tests.base;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC03_US007 extends TestBase {
    @Test
    public void US003_TC07() {

        login();
        WebElement fileButton = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        String path = "\\Users\\15026\\Desktop\\Jair4.png";

        fileButton.click();
        BrowserUtils.sleep(2);


        WebElement anyFolder = Driver.getDriver().findElement(By.xpath("(//div[@class='file-name'])[1]"));

        BrowserUtils.sleep(2);

        WebElement plus = Driver.getDriver().findElement(By.id("body-user"));
        plus.click();


        WebElement uploadFileButton = Driver.getDriver().findElement
                (By.xpath("//label[@for='file_upload_start']"));

        uploadFileButton.sendKeys(path);


    }


}





