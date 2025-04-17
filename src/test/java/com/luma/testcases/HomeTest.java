package com.luma.testcases;

import com.luma.base.BaseTest;
import com.luma.pages.*;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("add to cart ")
public class HomeTest extends BaseTest {
@Story("add item to cart")
    @Test(description = "Should be able to add to cart ")
    public void ShouldBeAbleToAddItemToCart() {
        LoginPage loginPage = new LoginPage(driver);
    boolean succmesaageeDisplayed = loginPage.load()
        .login("hendadelmoner@gmail.com", "Hendadel123")
            .clickOnHomeIcone()
            .clickOnSize()
            .clickOnColor()
            .ClickOnAddCartButton()
            .messageDisplayed();
        Assert.assertTrue(succmesaageeDisplayed);

    }
@Story("Add item to cart with select option")
    @Test(description = "Should be Able to choose option for item ")
    public void ShouldBeChooseOptionOfItem() {
        LoginPage loginPage = new LoginPage(driver);
    boolean messageShouldChooseOptionOfItem = loginPage.load()
        .login("hendadelmoner@gmail.com", "Hendadel123")
        .clickOnHomeIcone()
        .ClickOnImageDirect()
         .detailedOfitemDisplayed();
        Assert.assertTrue(messageShouldChooseOptionOfItem);
    }
}
