package com.trycloud.pages.contact;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContact {
    public NewContact() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='contact-fullname']")
    public WebElement boxName;

    @FindBy(xpath = "//input[@id='contact-org']")
    public WebElement boxCompany;

    @FindBy(xpath = "//input[@id='contact-title']")
    public WebElement boxTitle;

    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/header/div[1]/div/div[2]/div/div/button")
    public WebElement buttonPicture;

    @FindBy(xpath = "//li[@class='action active']/button")
    public WebElement buttonUploadPhoto;

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement boxNumber;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement boxEmail;

    @FindBy(xpath = "//div[@class='property property--last property-adr']/div[2]/input")
    public WebElement boxPostOfficeBox;

    @FindBy(xpath = "//div[@prop-name='adr']/div[3]/input")
    public WebElement boxAdress;

    @FindBy(xpath = "//div[@prop-name='adr']/div[4]/input")
    public WebElement boxExtendedAddress;

    @FindBy(xpath = "//div[@prop-name='adr']/div[5]/input")
    public WebElement boxPostalCode;

    @FindBy(xpath = "//div[@prop-name='adr']/div[6]/input")
    public WebElement boxCity;

    @FindBy(xpath = "//div[@prop-name='adr']/div[7]/input")
    public WebElement boxStateProvince;

    @FindBy(xpath = "//div[@prop-name='adr']/div[8]/input")
    public WebElement boxCountry;

    @FindBy(xpath = "//input[@placeholder='Add contact in group']")
    public WebElement boxGroups;
    //remember the add property part



}
