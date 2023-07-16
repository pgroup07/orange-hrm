package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userName = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");

    /**
     * This method use for Enteruser in username field
     *
     * @param option
     */
    public void enterUserName(String option) {
        sendTextToElement(userName, option);
    }

    /**
     * This method use for Enteruser in Password field
     *
     * @param option
     */
    public void enterPassword(String option) {
        sendTextToElement(password, option);
    }

    /**
     * This method use for click on Login button
     */
    public void clickOnLogin() {
        clickOnElement(loginButton);
    }

    /**
     * This method user verify Dashboard Text
     *
     * @return
     */
    public String verifyDashboard() {
        return getTextFromElement(dashboard);
    }

}
