package com.trycloud.tests;

import com.trycloud.pages.TalkPOM;
import com.trycloud.tests.base.TestBase;
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
        TalkPOM talkPOM=new TalkPOM();

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


//@Test
//    public void US003_TC07() {
//
//        login();
//        WebElement fileButton = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
//        String path = "\\Users\\15026\\Desktop\\Jair4.png";
//
//        fileButton.click();
//        //Creating files page object in order to use that class variables and methods
//        FilesPage filesPage = new FilesPage();
//        TalkPOM talkPOM = new TalkPOM();
//        //go to the files module
//        filesPage.clickFilesButton();
//        BrowserUtils.sleep(2);
//
//        // click (+) icon
//        filesPage.addFileIcon.click();
//        BrowserUtils.sleep(1);
////    login();
//
//        //   WebElement fileButton = Driver.getDriver().findElement(By.xpath("//a[@class='nav-icon-files svg active']"));
//        //     String path = "\\Users\\15026\\Desktop\\Jair4.png";
//
//        WebElement anyFolder = Driver.getDriver().findElement(By.xpath("(//div[@class='file-name'])[1]"));
//        //  fileButton.click();
//        // BrowserUtils.sleep(2);
//
//        BrowserUtils.sleep(2);
//
//        WebElement plus = Driver.getDriver().findElement(By.id("body-user"));
//        plus.click();
//        // WebElement anyFolder = Driver.getDriver().findElement(By.xpath("(//div[@class='file-name'])[1]"));
//
//        // BrowserUtils.sleep(2);
//
//        WebElement uploadFileButton = Driver.getDriver().findElement
//                (By.xpath("//label[@for='file_upload_start']"));
//        //  WebElement plus = Driver.getDriver().findElement(By.id("body-user"));
//        //  plus.click();
//
//        uploadFileButton.sendKeys(path);
//
//        // WebElement uploadFileButton = Driver.getDriver().findElement
//        // (By.xpath("//input[@type='file']"));
//
//        //  uploadFileButton.sendKeys(path);
//
//
//    }


