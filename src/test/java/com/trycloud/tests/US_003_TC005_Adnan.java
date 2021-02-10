package com.trycloud.tests;


import com.trycloud.pages.FilesPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US_003_TC005_Adnan extends TestBase {

    @Test
    public void test() {

        login();
        //Creating files page object in order to use that class variables and methods
        FilesPage filesPage = new FilesPage();

        //go to the files module
        filesPage.clickFilesButton();

        BrowserUtils.sleep(2);

        // click (+) icon
        filesPage.addFileIcon.click();

       // WebElement uploadFileButton = Driver.getDriver().findElement(By.xpath("//label[@for='file_upload_start']"));

        // uploadFileButton.sendKeys("C:\\Users\\ADNAN\\Desktop\\Screenshot 2021-02-04 193055.png");

        WebElement sth = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        sth.sendKeys("C:\\\\Users\\\\ADNAN\\\\Desktop\\\\Screenshot 2021-02-04 193055.png");
        BrowserUtils.sleep(2);

    }


}
