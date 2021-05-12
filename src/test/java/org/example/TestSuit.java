package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterPageSuccessfully registerPageSuccessfully = new RegisterPageSuccessfully();
    @Test
    public void userShouldBeAbleToLoginInSuccessfully(){
      homePage.clickOnRegisterButton();
       registerPage.userOpenRegisterPageSuccessfully();
      registerPageSuccessfully.verifyRegisterMessage();

     //  homePage.currencyChange();

    }

}
