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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TC03_US007 extends TestBase {
    @Test
    public void US003_TC07() {

       login();
        WebElement fileButton = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        fileButton.click();
        String path = "C:\\Users\\15026\\Desktop\\Ruslan.jpg";
        BrowserUtils.sleep(2);
        WebElement plus = Driver.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));
        plus.click();
        WebElement uploadFileButton = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        uploadFileButton.sendKeys(path);
        String expectedFileName = "Ruslan";
        //  Driver.getDriver().navigate().refresh();
        List<WebElement> listOfLinks = Driver.getDriver().findElements(By.xpath("//*[@id='fileList']/tr/td[2]/a/span/span"));
        for (WebElement eachName : listOfLinks) {
            if (eachName.getText().contains("Ruslan")) {
                String target=(eachName.getText());
                System.out.println(target+  " is Displayed in the page");
            }

        }
    }
}



        //for (WebElement eachName : listOfLinks) {
          //  if (eachName.getText().equals("Ruslan")) {
            //    System.out.println("The file is exist");
            //} else {
          //      System.out.println("the file is not ");
       //     }

            //ul[@class=‘conversations’]/li





