package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUser;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ViewSystemUser saveSystemUser = new ViewSystemUser();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {

        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        Thread.sleep(1000);
        loginPage.clickOnAdmin();
        String expectedText = "System Users";
        String actualText = loginPage.verifySystemUser();
        Assert.assertEquals(actualText, expectedText);
        loginPage.clickOnAdd();
        String expectedAddText = "Add User";
        Thread.sleep(1000);
        String actualAddText = loginPage.verifyAddUser();
        Assert.assertEquals(actualAddText, expectedAddText);
        loginPage.selectUserRollAdmin("Admin");
        loginPage.enterEmployeeName("Chenzira  Chuki");
        loginPage.enterUserName1("Ananya Dash");
        loginPage.selectStatus("Disabled");
        loginPage.enterPasswordField("Admin@123");
        loginPage.enterConfirmPasswordField("Admin@123");
        loginPage.clickOnSave();
        Thread.sleep(1000);
        String expectedSuccessMessage = "Successfully Saved";
        String actualSuccessMessage = saveSystemUser.verifySuccessMessage();
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        Thread.sleep(1000);
        loginPage.clickOnAdmin();
        String expectedText1 = "System Users";
        String actualText1 = loginPage.verifySystemUser();
        Assert.assertEquals(actualText1, expectedText1);
        loginPage.enterUserName1("Ananya Dash");
        Thread.sleep(1000);
        loginPage.selectUserRollAdmin("Admin");
        loginPage.enterEmployeeName("Chenzira  Chuki");
        loginPage.selectStatus("Disabled");
        saveSystemUser.clickOnSearch();
        String expectedAnaya = "Ananya Dash";
        String actualAnaya = saveSystemUser.verifyUserNameAnanya();
        Assert.assertEquals(actualAnaya, expectedAnaya);

    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        Thread.sleep(1000);
        loginPage.clickOnAdmin();
        String expectedText = "System Users";
        String actualText = loginPage.verifySystemUser();
        Assert.assertEquals(actualText, expectedText);
        loginPage.enterUserName1("Ananya Dash");
        Thread.sleep(1000);
        loginPage.selectUserRollAdmin("Admin");
        loginPage.enterEmployeeName("Chenzira  Chuki");
        loginPage.selectStatus("Disabled");
        saveSystemUser.clickOnSearch();
        String expectedAnaya = "Ananya Dash";
        String actualAnaya = saveSystemUser.verifyUserNameAnanya();
        Assert.assertEquals(actualAnaya, expectedAnaya);
        saveSystemUser.clickOnCheckBox();
        saveSystemUser.deleteUserName();
        saveSystemUser.popUpMessage();
        String expectedDelete = "Successfully Deleted";
        String actualDelete = saveSystemUser.verifySuccessfullyDelete();
        Assert.assertEquals(actualDelete, expectedDelete);
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        Thread.sleep(1000);
        String expectedText1 = "System Users";
        String actualText1 = loginPage.verifySystemUser();
        Assert.assertEquals(actualText1, expectedText1);
        loginPage.enterUserName1("Ananya Dash");
        loginPage.selectUserRollAdmin("Admin");
        loginPage.selectStatus("Disabled");
        saveSystemUser.clickOnSearch();
        Thread.sleep(1000);
        String expectedNoRecord = "No Records Found";
        String actualNoRecord = saveSystemUser.verifyNOoRecordFounds();
        Assert.assertEquals(actualNoRecord, expectedNoRecord);
    }
}

