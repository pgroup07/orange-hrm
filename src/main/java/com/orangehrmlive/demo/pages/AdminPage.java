package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By logoHRMForAll=By.xpath("//div[@class='orangehrm-login-logo']");
    public String verifyLogoHRM(){
        return getTextFromElement(logoHRMForAll);
    }
}
