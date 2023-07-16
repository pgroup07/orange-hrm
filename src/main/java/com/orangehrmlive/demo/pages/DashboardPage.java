package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By profileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logoutOption = By.xpath("//a[normalize-space()='Logout']");

    public void clickOnProfileLogo() {
        clickOnElement(profileLogo);
    }

    public void clickOnLogout() {
        mouseHoverToElementAndClick(logoutOption);
    }
}
