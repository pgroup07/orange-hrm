package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUser extends Utility {

    By verifySuccessMess = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");
    By verifyNameAnanya = By.xpath("//div[contains(text(),'Ananya Dash')]");
    By clickSearchButton = By.xpath("//button[normalize-space()='Search']");
    By clickCheckBox = By.xpath("//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteUserNameButton = By.xpath("//div[@class='orangehrm-container']//button[1]");

    By popUp = By.xpath("//button[normalize-space()='Yes, Delete']");
    By successfullyDelete = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");
    By NoRecord = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");

    /**
     * This method use for verify Pop-up Message
     *
     * @return
     */
    public String verifySuccessMessage() {
        return getTextFromElement(verifySuccessMess);
    }

    /**
     * This method use for verify Name
     *
     * @return
     */
    public String verifyUserNameAnanya() {
        return getTextFromElement(verifyNameAnanya);
    }

    /**
     * This method use for Search Option
     */
    public void clickOnSearch() {
        clickOnElement(clickSearchButton);
    }

    /**
     * This method use for select Check Box
     */
    public void clickOnCheckBox() {
        clickOnElement(clickCheckBox);
    }

    public void deleteUserName() {
        clickOnElement(deleteUserNameButton);
    }

    public void popUpMessage() {
        clickOnElement(popUp);
    }

    public String verifySuccessfullyDelete() {
        return getTextFromElement(successfullyDelete);
    }

    public String verifyNOoRecordFounds() {
        return getTextFromElement(NoRecord);
    }

}
