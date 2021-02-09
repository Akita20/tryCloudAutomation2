package com.trycloud.tests.base;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPOM {
    public TalkPOM() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[@aria-label='Talk'])[1]")
    public WebElement talkButton;

    @FindBy(xpath = "//input[contains(@placeholder,'Search conversations')]")
    public WebElement searchConversationButton;
    @FindBy(className="material-design-icon__svg")
    public WebElement plusButton;


}


//
//    // 3. Search a user from search box on the left
//    WebElement searchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search conversations')]"));
//    String searchInput = "User100";
//    //used dynamic wait for sending searInput
//    sendTheKeys(searchBox, 15, searchInput);
//}