package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CirclePOM extends PageBase {
    public CirclePOM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='icon-circles']")
    public WebElement circlePicture;
    @FindBy(xpath = "//h2[.='No circle selected']")
    public  WebElement circleNoSelectedText;
    @FindBy(id = "circles_new_name")
    public WebElement createNewCirleBox;
    @FindBy(id = "circles_search")
    public WebElement searchCirleBox;
    @FindBy(id = "circles_filters")
    public WebElement filterCirleBox;
    @FindBy(id = "c8f65455f26e70")
    public WebElement titleGroup22_1;
    @FindBy(id = "820f5f64b476d6")
    public WebElement titleGroup23;
    @FindBy(id = "749184ca0e14bd")
    public WebElement titleGroup22;
    @FindBy(xpath = "//div[.='Personal circles']")
    public WebElement personalCirclesButton;
    @FindBy(xpath = "//div[.='Public circles']")
    public WebElement publicCirclesButton;
    @FindBy(xpath = "//div[.='Closed circles']")
    public WebElement closedCirclesButton;
    @FindBy(xpath = "//div[.='Secret circles']")
    public WebElement secretCirclesButton;
    @FindBy(xpath = "//div[.='All circles']")
    public WebElement allCirclesButton;





}
