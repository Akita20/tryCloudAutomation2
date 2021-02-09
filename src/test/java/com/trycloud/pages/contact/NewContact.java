package com.trycloud.pages.contact;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContact {
    public NewContact() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement boxNumber;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement boxEmail;

    @FindBy(xpath = "//div[@class='property property--last property-adr']/div[2]/input")
    public WebElement boxPostOfficeBox;
}
