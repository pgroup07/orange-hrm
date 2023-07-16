package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");

    By verifyOrangeHRMText = By.xpath("(//img[@alt='company-branding'])[1]");
    By ForgetPassword = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    By LoginText = By.xpath("//h5[normalize-space()='Login']");
    By clickAdmin = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]");
    By SystemUserText = By.xpath("//h5[normalize-space()='System Users']");
    By AddButton = By.xpath("//button[normalize-space()='Add']");
    By AddUserText = By.xpath("//h6[normalize-space()='Add User']");
    By rollAdmin = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]");
    By EmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By UserName1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By selectStatusDropdown = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
    By passwordField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    By confirmPasswordField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
    By clickOnSaveButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

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
     * This method use for click on Admin button
     */
    public void clickOnAdmin() {
        clickOnElement(clickAdmin);
    }

    /**
     * This method use for verify "System User"
     *
     * @return
     */
    public String verifySystemUser() {
        return getTextFromElement(SystemUserText);
    }

    /**
     * This method use for click on Add button
     */
    public void clickOnAdd() {
        clickOnElement(AddButton);
    }

    /**
     * This method use for verify "Add User"
     *
     * @return
     */
    public String verifyAddUser() {
        return getTextFromElement(AddUserText);
    }

    /**
     * This method use for Select Roll from Drop down box
     *
     * @param option
     */
    public void selectUserRollAdmin(String option) {
        selectByContainsTextFromDropDown(rollAdmin, option);
    }

    /**
     * This method use for enter EmployeeName in field
     *
     * @param option
     */
    public void enterEmployeeName(String option) {
        sendTextToElement(EmployeeName, option);
    }

    /**
     * This method use for  enter UserName in field
     *
     * @param option
     */
    public void enterUserName1(String option) {
        sendTextToElement(UserName1, option);
    }

    /**
     * This method use for select Status
     *
     * @param option
     */
    public void selectStatus(String option) {
        selectByContainsTextFromDropDown(selectStatusDropdown, option);
    }

    /**
     * This method use for enter Password in field
     *
     * @param option
     */
    public void enterPasswordField(String option) {
        selectByVisibleTextFromDropDown(passwordField, option);
    }

    /**
     * This method use for enter ConfirmPassword in field
     *
     * @param option
     */
    public void enterConfirmPasswordField(String option) {
        selectByVisibleTextFromDropDown(confirmPasswordField, option);
    }

    /**
     * This method use for Click on Save button
     */
    public void clickOnSave() {
        clickOnElement(clickOnSaveButton);
    }
 //p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']
//div[@class='oxd-toast oxd-toast--info oxd-toast-container--toast']




}
