package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils{
    public void userOpenRegisterPageSuccessfully(){

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(By.id("gender-female"));//type gender
        enterText(By.id("FirstName"), "Rabia"); //user type first name
        enterText(By.id("LastName"),"Irfan");// user types last name
        // User type date of Birth
        selectFromDropdownByVisibleIndex(By.xpath("//select[@name=\"DateOfBirthDay\"]"),12);
        //user type date of manth
        selectFromDropdownByText(By.xpath("//select[@name=\"DateOfBirthMonth\"]"),"January");
        // user type date of year
        selectFromDropdownByValue(By.xpath("//select[@name=\"DateOfBirthYear\"]"),"2000");
        // user type Email
        enterText(By.id("Email"),"Rabia26@gmail.com");
        //user enters password
        enterText(By.name("Password"),"abc123");
       // user enters confirm password
        enterText(By.id("ConfirmPassword"),"abc123");
        // user clicks register button
        clickOnElement(By.id("register-button"));
    }
    }


