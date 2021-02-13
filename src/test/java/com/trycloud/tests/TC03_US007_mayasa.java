package com.trycloud.tests;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.TalkPOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC03_US007_mayasa extends TestBase {

    @Test
    public void upload_file() throws InterruptedException {
        login();
        // I created a FilesPage  and TalkPOM objects In order to use Those classes methods
        FilesPage filesPage = new FilesPage();
        TalkPOM talkPOM = new TalkPOM();

        // I went to the files module
        filesPage.buttonFiles.click();
        BrowserUtils.sleep(2);

        // I uploaded an image to the webPage
        filesPage.addFileIcon.click();
        // The  root of the file that i uploaded to the webpage
        String path = "C:\\Users\\15026\\Desktop\\Ruslan.jpg";
        // the name of the file that i uploaded from my Computer to the webPage
        String expectedResult = "Ruslan";
        // I passed the path of the file that i want to uploaded
        talkPOM.uploadFile.sendKeys(path);
        Thread.sleep(2);
        // handling a HTML alert
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//button[@class='cancel']"));
        alertMessage.click();
        Thread.sleep(2);

        boolean fileIsDisplayed = false;
        for (WebElement eachFile : filesPage.filesList) {
            if (eachFile.getText().contains(expectedResult)) {
                fileIsDisplayed = true;
            }
        }
        Assert.assertTrue(fileIsDisplayed);
        //
    }
}


// I located all the element without using the object pages

// @Test
//  public void US003_TC07() {
//        login();
//     WebElement fileButton = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
//   fileButton.click();
//  String path = "C:\\Users\\15026\\Desktop\\Ruslan.jpg";
//  BrowserUtils.sleep(2);
//  WebElement plus = Driver.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));
// plus.click();
//  WebElement uploadFileButton = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
// uploadFileButton.sendKeys(path);
// String expectedFileName = "Ruslan";
//  Driver.getDriver().navigate().refresh();
//  List<WebElement> listOfLinks = Driver.getDriver().findElements(By.xpath("//*[@id='fileList']/tr/td[2]/a/span/span"));
//  for (WebElement eachName : listOfLinks) {
//   if (eachName.getText().equals(expectedFileName)) {
//     String  myNewFile=(eachName.getText());
//   System.out.println(myNewFile+"  is Displayed on the page");            }

// }
// }










