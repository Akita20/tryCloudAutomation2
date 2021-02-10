package com.trycloud.tests;

import com.trycloud.pages.contact.NewContact;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactTest extends TestBase {
    @Test
    public void t1(){
        login();
        NewContact newContact=new NewContact();
        newContact.buttonContactsClick();
        newContact.buttonNewContact.click();
        for(WebElement element: newContact.newPropertyOptions){
            element.click();
            BrowserUtils.sleep(2);
        }
    }
}
