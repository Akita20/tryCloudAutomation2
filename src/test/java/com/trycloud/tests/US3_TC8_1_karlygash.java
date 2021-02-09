package com.trycloud.tests;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US3_TC8_1_karlygash extends TestBase {

    @Test
    public void delete_file_test(){
        login();

        WebElement filesButton = Driver.getDriver().findElement(By.xpath("(//a[@class='active'])[1]"));

        filesButton.click();

        WebElement noFilesInHereText = Driver.getDriver().findElement(By.xpath("(//h2[.='No files in here'])[1]"));

        WebElement addIcon = Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        WebElement newFolder = Driver.getDriver().findElement(By.xpath("//a[@data-templatename='New folder']"));

        if (noFilesInHereText.isDisplayed()){
            addIcon.click();
            newFolder.click();



        }






    }
}
