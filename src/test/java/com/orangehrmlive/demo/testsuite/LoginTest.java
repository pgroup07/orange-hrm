package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    DashboardPage dashboardPage = new DashboardPage();
    AdminPage adminPage = new AdminPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() throws InterruptedException {
        homePage.enterUserName("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLogin();
        Thread.sleep(1000);
        String expectedText = "Dashboard";
        String actualText = homePage.verifyDashboard();
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        String expectedText = "orangehrm-login-logo";
        String actualText = adminPage.verifyLogoHRM();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() throws InterruptedException {
        homePage.enterUserName("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLogin();
        Thread.sleep(1000);
        dashboardPage.clickOnProfileLogo();
        dashboardPage.clickOnLogout();
    }
}
