package com.luma.testcases;

import com.luma.base.BaseTest;
import com.luma.pages.*;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Check out")
public class CheckOutTest extends BaseTest {

    @Story("Check out functionality")
    @Test(description = "Test the function of checkout")
    public void ShouldBeCheckoutSuccessfully() {
        LoginPage loginPage = new LoginPage(driver);

        boolean succmesaageeDisplayed =  loginPage.load()
                .login("hendadelmoner@gmail.com", "Hendadel123")
                .clickOnHomeIcone()
                .clickOnSize()
                .clickOnColor()
                .ClickOnAddCartButton()
                .messageDisplayed();
        Assert.assertTrue(succmesaageeDisplayed);
    }
}