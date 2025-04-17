package com.luma.testcases;

import com.luma.base.BaseTest;
import com.luma.pages.LoginPage;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Auth Feature")
public class LoginTest extends BaseTest {
@Story("Login without email")
    @Test(description = "Test login functionality without writing email")
    public void TryToLoginWithoutWritingEmail(){

        LoginPage loginPage=new LoginPage(driver);
boolean messageOfRequiredField=
        loginPage
                .load()
                .invalidLogin("","Hendadel123").errorMessageOfRequiredFieldDisplayed();

        Assert.assertTrue(messageOfRequiredField);
    }
@Story("Login Without password")
    @Test(description = "test login functionality without writing password")
    public void TryToLoginWithoutWritingPassword(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.load().login("hendadelmoner@gmail.com","");
        boolean messageErrorOfPasswordDisplayed=loginPage.errorMessageOfPasswordFieldDisplayed();
        Assert.assertTrue(messageErrorOfPasswordDisplayed);
    }
@Story("Login With Invalid Email Format")
    @Test(description = "Test login functionality with invalid email format")
    public void TryToLoginWithInvalidEmailFormat(){

        LoginPage loginPage=new LoginPage(driver);
    boolean messageErrorOfPasswordDisplayed= loginPage
                .load()
                .invalidLogin("hendadelmonergmail.com","Hendadel123")
            .errorMessageOfFormatEmail();
        Assert.assertTrue(messageErrorOfPasswordDisplayed);
    }


@Story("Login with Email and Password")
    @Test(description = "Test login functionality With valid data")
    public void ShouldBeAbleToLoginWithValidEmailAndPassword(){
        LoginPage loginPage=new LoginPage(driver);
    boolean myacc= loginPage.load().login("hendadelmoner@gmail.com","Hendadel123").dilsplay();


        Assert.assertTrue(myacc);

    }

}

